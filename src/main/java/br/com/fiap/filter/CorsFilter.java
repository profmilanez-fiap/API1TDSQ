package br.com.fiap.filter;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class CorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {

        // Origem permitida: seu frontend na Vercel
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "https://front1-tdsq-2xje.vercel.app");

        // Cabeçalhos permitidos
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");

        // Permitir credenciais (cookies, tokens etc.)
        responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");

        // Métodos HTTP permitidos
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        // Tempo que a resposta do CORS pode ser armazenada em cache (em segundos)
        responseContext.getHeaders().add("Access-Control-Max-Age", "1209600");
    }
}
