package com.example;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;

	import springfox.documentation.builders.ApiInfoBuilder;
	import springfox.documentation.builders.PathSelectors;
	import springfox.documentation.builders.RequestHandlerSelectors;
	import springfox.documentation.service.ApiInfo;
	import springfox.documentation.spi.DocumentationType;
	import springfox.documentation.spring.web.plugins.Docket;

	/**
	 * Indicates that this is a "Swagger Configuration ", developed for the sprint
	 * project "Flight Ticket Booking Application" This class is developed for
	 * configuring swagger in spring boot in order to test the API documentations
	 * and also implement spring security techniques.
	 * 
	 **/

	//SWAGGER CONFIGURATON FOR API DOCUMENTATION
	@Configuration
	//@EnableSwagger2
	public class SwaggerConfiguration {
		  @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.OAS_30)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.example"))
	                .paths(PathSelectors.any())
	                .build().apiInfo(apiEndPointInfo());
	        
	    }
	    public ApiInfo apiEndPointInfo() {
	        return new ApiInfoBuilder().title("Flight Ticket Booking Application")
	                .description("Flight Ticket")
	                .licenseUrl("http://www.apache.org/licenses/LICENCE-2.0.html")
	                .version("0.0.1-SNAPSHOT")
	                .build();
	    }
	    

}
