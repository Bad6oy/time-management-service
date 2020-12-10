package ru.neoflex.bank.services.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class RemoteServiceConfiguration {

    @Value("${maxoptra.uri}")
    private String maxoptraUri;

    @Bean
    public WebClient maxoptraWebClientBuilder(WebClient.Builder builder){
        return builder.baseUrl(maxoptraUri).build();
    }
}
