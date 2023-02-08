package ru.skillbox.diplom.group33.social.service.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Social Network Api")
                .version("1.0.0"))
                .servers(List.of(new Server().url("http://localhost:8080")
                        .description("Dev service"))
        );
  }

}

