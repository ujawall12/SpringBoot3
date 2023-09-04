package com.javadev.springboot3.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfig {

    private String url;
    private String username;
    private String key;

}
