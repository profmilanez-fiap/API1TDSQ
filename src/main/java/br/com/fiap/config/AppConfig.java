package br.com.fiap.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class AppConfig extends ResourceConfig {

    public AppConfig() {
        packages("br.com.fiap.resource", "br.com.fiap.filter");
    }
}
