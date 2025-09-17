package com.example.demo.config;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class MySiteMeshFilter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        // Layout cho trang admin
        builder.addDecoratorPath("/admin/*", "/WEB-INF/decorators/main.jsp");

        // Layout cho trang web người dùng
        builder.addDecoratorPath("/web/*", "/WEB-INF/decorators/main.jsp");
    }
}
