package com.riwi.Map_Struture.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Api para manejo de Endpoints de La librería LayKing",
        version = "1.0",
        description = "Esta api maneja los datos referente a la gestión de la librería."
        )
)
public class OpenApiConfig {
}
