package vti.dtn.admin_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class ComponentConfig {

    @Bean
    public RestClient initRestClient() {
        return RestClient.create();
    }

}
