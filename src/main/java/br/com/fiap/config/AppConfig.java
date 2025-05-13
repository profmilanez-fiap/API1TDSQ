package br.com.fiap.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/") // Define o caminho base da API (ex: /bandas, /discos, etc.)
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        // Registra os pacotes que contêm seus recursos e filtros
        packages("br.com.fiap.resource", "br.com.fiap.filter");
    }
}
