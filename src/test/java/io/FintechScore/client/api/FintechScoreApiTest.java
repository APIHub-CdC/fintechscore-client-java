package io.FintechScore.client.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;
import io.FintechScore.api.FintechScoreApi;
import io.FintechScore.client.ApiClient;
import io.FintechScore.model.CatalogoEstados;
import io.FintechScore.model.CatalogoPais;
import io.FintechScore.model.Domicilio;
import io.FintechScore.model.Persona;
import io.FintechScore.model.Peticion;
import io.FintechScore.model.PeticionFolio;
import io.FintechScore.model.Respuesta;
import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import java.util.concurrent.TimeUnit;

public class FintechScoreApiTest {
    private final FintechScoreApi api = new FintechScoreApi();
	private Logger logger = LoggerFactory.getLogger(FintechScoreApiTest.class.getName());
	
	private String keystoreFile = "/your_path/keystore.jks";
    private String cdcCertFile = "/your_path/cdc_cert.pem";
    private String keystorePassword = "your_password";
    private String keyAlias = "your_alias";
    private String keyPassword = "your_key_password";
    
    
    @Before()
    public void setUp() {
    	 
    	ApiClient apiClient = api.getApiClient();
        apiClient.setBasePath("your-basepath");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder().readTimeout(30, TimeUnit.SECONDS)
				.addInterceptor(new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword)).build();
		apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getReporteTest() throws Exception {
    	String xApiKey = "Your Apikey";
        String username = "Your User";
        String password = "Your Password";
        
        Peticion request = new Peticion();
        request.setFolioOtorgante("");
        Persona persona = new Persona();
        Domicilio domicilio = new Domicilio();
        request.setPersona(persona);

        domicilio.setDireccion("");
        domicilio.setColoniaPoblacion("");
        domicilio.setDelegacionMunicipio("");
        domicilio.setCiudad("");
        domicilio.setEstado(CatalogoEstados.CDMX);
        domicilio.setCP("");
        domicilio.setPais(CatalogoPais.MX);
        persona.setApellidoPaterno("");
        persona.setApellidoMaterno("");
        persona.setPrimerNombre("");
        persona.setFechaNacimiento("");
        persona.setRFC("");
        persona.setDomicilio(domicilio);
        Respuesta response = api.getReporte( xApiKey, username, password, request);
        logger.info("Report: "+response.toString());
        
        Assert.assertTrue(response.getFolioConsulta() != null);
    }
   
   @Test
    public void getReporteFolio() throws Exception {
    	String xApiKey = "Your Apikey";
        String username = "Your User";
        String password = "Your Password";
        PeticionFolio request = new PeticionFolio();
        
        request.setFolioOtorgante("");
        request.setFolioConsulta("");
        
        Respuesta response = api.getReporteFolio(xApiKey, username, password, request);
        logger.info("Report Folio: "+response.toString());
        
        Assert.assertTrue(response.getFolioConsulta() != null);
    }
    

    
 
    
}
