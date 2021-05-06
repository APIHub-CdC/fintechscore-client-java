package com.cdc.apihub.mx.FintechScore.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.FintechScore.client.model.Score;

public class Respuesta {
	@SerializedName("folioConsulta")
	private String folioConsulta = null;
	@SerializedName("folioOtorgante")
	private String folioOtorgante = null;
	@SerializedName("score")
	private Score score = null;

	public Respuesta folioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
		return this;
	}

	@ApiModelProperty(example = "386636538", value = "Folio de la consulta")
	public String getFolioConsulta() {
		return folioConsulta;
	}

	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	public Respuesta folioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
		return this;
	}

	@ApiModelProperty(example = "20210304", value = "Folio de la consulta con relación al otorgante")
	public String getFolioOtorgante() {
		return folioOtorgante;
	}

	public void setFolioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
	}

	public Respuesta score(Score score) {
		this.score = score;
		return this;
	}

	@ApiModelProperty(value = "")
	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Respuesta respuesta = (Respuesta) o;
		return Objects.equals(this.folioConsulta, respuesta.folioConsulta)
				&& Objects.equals(this.folioOtorgante, respuesta.folioOtorgante)
				&& Objects.equals(this.score, respuesta.score);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsulta, folioOtorgante, score);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Respuesta {\n");

		sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
		sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
		sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
