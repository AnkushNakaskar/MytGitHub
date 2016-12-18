package com.vuclip.swagger.input;

import javax.validation.constraints.NotNull;

import springfox.documentation.builders.ApiInfoBuilder;

public class SwaggerConfigDetails {
	@NotNull(message="group name should not be null")
	private final String groupName;
	
	@NotNull(message="basePackage name should not be null")
	private final String basePackage;
	
	@NotNull(message="ApiInfoBuilder should not be null")
	private final ApiInfoBuilder apiInfoBuilder;

	public SwaggerConfigDetails(String groupName, String basePackage, ApiInfoBuilder apiInfoBuilder) {
		this.apiInfoBuilder = apiInfoBuilder;
		this.groupName = groupName;
		this.basePackage = basePackage;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getBasePackage() {
		return basePackage;
	}

	public ApiInfoBuilder getApiInfoBuilder() {
		return apiInfoBuilder;
	}

}
