package com.vuclip.swagger;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Configuration;

import com.vuclip.swagger.input.SwaggerConfigDetails;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfigImpl {

    public Docket newsApi(SwaggerConfigDetails inputDetails) throws Exception {
    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
         Set<ConstraintViolation<SwaggerConfigDetails>> violations = validator.validate(inputDetails);
         if(violations.size()>0){
        	 throw new Exception(violations.toString());
         }
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName(inputDetails.getGroupName())
                .apiInfo(inputDetails.getApiInfoBuilder().build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.vuclip"))     
                .paths(PathSelectors.any())  
                .build();
    }
	
}
