package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


public class PeticionFolio {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;
  @SerializedName("folioConsulta")
  private String folioConsulta = null;
  public PeticionFolio folioOtorgante(String folioOtorgante) {
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
  public PeticionFolio folioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "20210304", required = true, value = "Folio interno de Consulta, número único generado por la consulta para su seguimiento")
  public String getFolioConsulta() {
    return folioConsulta;
  }
  public void setFolioConsulta(String folioConsulta) {
    this.folioConsulta = folioConsulta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeticionFolio peticionFolio = (PeticionFolio) o;
    return Objects.equals(this.folioOtorgante, peticionFolio.folioOtorgante) &&
        Objects.equals(this.folioConsulta, peticionFolio.folioConsulta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, folioConsulta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeticionFolio {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
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
