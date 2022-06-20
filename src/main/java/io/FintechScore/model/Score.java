package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.FintechScore.model.CatalogoRazones;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
@ApiModel(description = "Contiene los elementos Score.")


public class Score {
  @SerializedName("valor")
  private Integer valor = null;
  @SerializedName("razon")
  private CatalogoRazones razon = null;
  public Score valor(Integer valor) {
    this.valor = valor;
    return this;
  }
   
  @ApiModelProperty(example = "0", value = "Valor numerico de Score")
  public Integer getValor() {
    return valor;
  }
  public void setValor(Integer valor) {
    this.valor = valor;
  }
  public Score razon(CatalogoRazones razon) {
    this.razon = razon;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public CatalogoRazones getRazon() {
    return razon;
  }
  public void setRazon(CatalogoRazones razon) {
    this.razon = razon;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.valor, score.valor) &&
        Objects.equals(this.razon, score.razon);
  }
  @Override
  public int hashCode() {
    return Objects.hash(valor, razon);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    razon: ").append(toIndentedString(razon)).append("\n");
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
