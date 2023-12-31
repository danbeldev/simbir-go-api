package ru.volga_it.simbir_go.features.account.security.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "security.jwt")
public class JwtProperties {

    private String secret;
    private Long access;
}
