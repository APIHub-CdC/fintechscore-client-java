package com.cdc.apihub.mx.FintechScore.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.mx.FintechScore.client.ApiClient;
import com.cdc.apihub.mx.FintechScore.client.ApiException;
import com.cdc.apihub.mx.FintechScore.client.ApiResponse;
import com.cdc.apihub.mx.FintechScore.client.api.FintechScoreApi;
import com.cdc.apihub.mx.FintechScore.client.model.CatalogoEstados;
import com.cdc.apihub.mx.FintechScore.client.model.CatalogoPais;
import com.cdc.apihub.mx.FintechScore.client.model.Domicilio;
import com.cdc.apihub.mx.FintechScore.client.model.Persona;
import com.cdc.apihub.mx.FintechScore.client.model.Peticion;
import com.cdc.apihub.mx.FintechScore.client.model.Respuesta;
import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import okhttp3.OkHttpClient;


public class ApiTest {
    private final FintechScoreApi api = new FintechScoreApi();
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

	private ApiClient apiClient;
	
    private String keystoreFile = "your_path_for_your_keystore/keystore.jks";
    private String cdcCertFile = "your_path_for_certificate_of_cdc/cdc_cert.pem";
    private String keystorePassword = "your_super_secure_keystore_password";
    private String keyAlias = "your_key_alias";
    private String keyPassword = "your_super_secure_password";
    
    private String usernameCDC = "your_username_otrorgante";
    private String passwordCDC = "your_password_otorgante"; 
    
    private String url = "the_url";
    private String xApiKey = "X_Api_Key";
	
	private SignerInterceptor interceptor;
	
	
	@Before()
	public void setUp() {
		interceptor = new SignerInterceptor(keystoreFile, cdcCertFile, keystorePassword, keyAlias, keyPassword);
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath(url);
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(interceptor)
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}
    
    @Test
    public void getReporteTest() throws ApiException {
        
        Peticion body = new Peticion();
        Persona persona = new Persona();
        Domicilio domicilio = new Domicilio();
        
        Integer estatusOK = 200;
        Integer estatusNoContent = 204;
        
        try {
        	
        	domicilio.setDireccion("AV 535 84");
            domicilio.setCiudad( "CIUDAD DE MEXICO");
            domicilio.setColoniaPoblacion("SAN JUAN DE ARAGON 1RA SECC");
            domicilio.setDelegacionMunicipio("GUSTAVO A MADERO");
            domicilio.setCP("07969");
            domicilio.setEstado(CatalogoEstados.CDMX);
            domicilio.setPais(CatalogoPais.MX);
            
            persona.setPrimerNombre("PABLO");
            persona.setSegundoNombre("ANTONIO");
            persona.setApellidoPaterno("PRUEBA");
            persona.setApellidoMaterno("ALVAREZ");
            persona.setFechaNacimiento("1985-03-16");
            persona.setRFC("PUAP850316MI1");
            persona.setDomicilio(domicilio);
            
            body.setFolioOtorgante("20210307");
            body.setPersona(persona);
            
            ApiResponse<?>  response = api.getGenericReporte(xApiKey, usernameCDC, passwordCDC, body);
            
        	Assert.assertTrue(estatusOK.equals(response.getStatusCode()));
            
            if(estatusOK.equals(response.getStatusCode())) {
                Respuesta responseOK = (Respuesta) response.getData();
                logger.info(responseOK.toString());
            }

        } catch (ApiException e) {
            if(!estatusNoContent.equals(e.getCode())) {
                logger.info(e.getResponseBody());
            }
            Assert.assertTrue(estatusOK.equals(e.getCode()));           
        }
    }
}
