package com.example.demo.config;

import org.apache.catalina.Context;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")
@Configuration
public class TomcatJSPConfiguration {
    @Bean
    WebServerFactoryCustomizer<WebServerFactory> staticResourceCustomizer() {
        return factory -> {
            if (factory instanceof TomcatServletWebServerFactory tomcatFactory) {
                tomcatFactory.addContextCustomizers(context -> context.addLifecycleListener(new JSPStaticResourceConfigurer(context)));
            }
        };
    }
}