package ru.neoflex.bank.configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
    public Docket vacantDateApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors
                .basePackage("ru.neoflex.bank")).build();
    }
}
