package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.FintechScore.model.Domicilio;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
@ApiModel(description = "Datos generales de la persona a consultar.")


public class Persona {
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("RFC")
  private String RFC = null;
  @SerializedName("domicilio")
  private Domicilio domicilio = null;
  public Persona apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "PRUEBA", required = true, value = "Apellido Paterno del cliente. No usar abreviaturas, iniciales y/o puntos.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Persona apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "RUIZ", value = "Apellido Materno del cliente. No usar abreviaturas, iniciales y/o puntos.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Persona primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(example = "JUAN", required = true, value = "Primer nombre del cliente. No usar abreviaturas, iniciales y/o puntos.")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public Persona segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "PABLO", value = "Segundo nombre del cliente. No usar abreviaturas, iniciales y/o puntos.")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public Persona fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(example = "1974-10-28", required = true, value = "Fecha de nacimiento de la persona, en el formato especificado (por defecto yyyy-MM-dd)")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public Persona RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }
   
  @ApiModelProperty(example = "PURJ741028PL2", value = "RFC con homoclave de la persona")
  public String getRFC() {
    return RFC;
  }
  public void setRFC(String RFC) {
    this.RFC = RFC;
  }
  public Persona domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Domicilio getDomicilio() {
    return domicilio;
  }
  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Persona persona = (Persona) o;
    return Objects.equals(this.apellidoPaterno, persona.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, persona.apellidoMaterno) &&
        Objects.equals(this.primerNombre, persona.primerNombre) &&
        Objects.equals(this.segundoNombre, persona.segundoNombre) &&
        Objects.equals(this.fechaNacimiento, persona.fechaNacimiento) &&
        Objects.equals(this.RFC, persona.RFC) &&
        Objects.equals(this.domicilio, persona.domicilio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, primerNombre, segundoNombre, fechaNacimiento, RFC, domicilio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Persona {\n");
    
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
