package by.arvisit.modsenlibapp.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@Configuration
@OpenAPIDefinition
public class RoutesConfig {

    @CrossOrigin
    @Bean
    RouteLocator routeLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("modsen-security-service", r -> r.path(
                        "/api/v1/users/{segment}",
                        "/api/v1/users",
                        "/modsen-security-service/v3/api-docs")
                        .uri("lb://modsen-security-service"))
                .route("modsen-library-service", r -> r.path(
                        "/api/v1/books/{segment}",
                        "/api/v1/books",
                        "/modsen-library-service/v3/api-docs")
                        .uri("lb://modsen-library-service"))
                .route("modsen-book-service", r -> r.path(
                        "/api/v1/books/{segment}",
                        "/api/v1/books",
                        "/modsen-book-service/v3/api-docs")
                        .uri("lb://modsen-book-service"))
                .build();
    }
}
