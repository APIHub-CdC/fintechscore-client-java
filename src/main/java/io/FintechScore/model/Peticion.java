package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.FintechScore.model.Persona;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
@ApiModel(description = "Datos generales de la persona a consultar.")


public class Peticion {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("persona")
  private Persona persona = null;
  public Peticion folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "20210304", required = true, value = "Folio interno del otorgante, número único generado por el otorgante para su seguimiento")
  public String getFolioOtorgante() {
    return folioOtorgante;
  }
  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }
  public Peticion persona(Persona persona) {
    this.persona = persona;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public Persona getPersona() {
    return persona;
  }
  public void setPersona(Persona persona) {
    this.persona = persona;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Peticion peticion = (Peticion) o;
    return Objects.equals(this.folioOtorgante, peticion.folioOtorgante) &&
        Objects.equals(this.persona, peticion.persona);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, persona);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Peticion {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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
