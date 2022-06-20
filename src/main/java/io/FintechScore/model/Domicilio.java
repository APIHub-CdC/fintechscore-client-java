package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.FintechScore.model.CatalogoEstados;
import io.FintechScore.model.CatalogoPais;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
@ApiModel(description = "Datos del domicilio de la persona a consultar")


public class Domicilio {
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;
  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstados estado = null;
  @SerializedName("CP")
  private String CP = null;
  @SerializedName("pais")
  private CatalogoPais pais = null;
  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(example = "INGENIEROS MILITARES NO. 65", required = true, value = "Domicilio de la persona incluyendo nombre de la calle, número exterior y/o interior. Deben considerarse avenida, cerrada, manzana, lote, edificio, departamento, entre otros.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Domicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }
   
  @ApiModelProperty(example = "LOMAS DE SOTELO", value = "Colónia o población a la cual pertenece el domicilio de la persona.")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }
  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }
  public Domicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }
   
  @ApiModelProperty(example = "MIGUEL HIDALGO", value = "Delegación o municipio a la cual pertenece el domicilio de la persona.")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }
  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }
  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  @ApiModelProperty(example = "CIUDAD DE MEXICO", value = "Ciudad a la cual pertenece el domicilio de la persona.")
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Domicilio estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public CatalogoEstados getEstado() {
    return estado;
  }
  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }
  public Domicilio CP(String CP) {
    this.CP = CP;
    return this;
  }
   
  @ApiModelProperty(example = "11200", required = true, value = "Código postal debe estar compuesto por 5 dígitos; para que éste sea válido deberá corresponder al rango que se maneja dentro del Estado donde pertenece el domicilio de la persona. En caso de una longitud de 4 dígitos deberá completar con un cero a la izquierda (Ejemplo 08564).")
  public String getCP() {
    return CP;
  }
  public void setCP(String CP) {
    this.CP = CP;
  }
  public Domicilio pais(CatalogoPais pais) {
    this.pais = pais;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public CatalogoPais getPais() {
    return pais;
  }
  public void setPais(CatalogoPais pais) {
    this.pais = pais;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilio.ciudad) &&
        Objects.equals(this.estado, domicilio.estado) &&
        Objects.equals(this.CP, domicilio.CP) &&
        Objects.equals(this.pais, domicilio.pais);
  }
  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, pais);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
