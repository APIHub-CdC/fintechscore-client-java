package io.FintechScore.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
@JsonAdapter(CatalogoRazones.Adapter.class)
public enum CatalogoRazones {
  
  E0("E0"),
  
  E1("E1"),
  
  E2("E2");
  private String value;
  CatalogoRazones(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }
  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static CatalogoRazones fromValue(String text) {
    for (CatalogoRazones b : CatalogoRazones.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<CatalogoRazones> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoRazones enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }
    @Override
    public CatalogoRazones read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogoRazones.fromValue(String.valueOf(value));
    }
  }
}
