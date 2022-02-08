package com.barshop.app.models.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Country implements Serializable {

    private static final long serialVersionUID = -4991168412652925793L;

	@ApiModelProperty(position = 0)
	@JsonProperty("id")
	private long id;

	@ApiModelProperty(position = 1)
	@JsonProperty("name")

	private String name;

	@ApiModelProperty(position = 2)
	@JsonProperty("countryCode")
	private int countryCode;

	@ApiModelProperty(position = 3)
	@JsonProperty("twoDigitIso")
	private String twoDigitIso;

	@ApiModelProperty(position = 4)
	@JsonProperty("threeDigitIso")
	private String threeDigitIso;

	@ApiModelProperty(position = 5)
	@JsonProperty("countryCallingCode")
	private String countryCallingCode;
}