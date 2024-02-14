package by.arvisit.modsenlibapp.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ModsenApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModsenApiGatewayApplication.class, args);
    }

}
