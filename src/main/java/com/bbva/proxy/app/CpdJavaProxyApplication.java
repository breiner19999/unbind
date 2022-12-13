package com.bbva.proxy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bbva.proxy", "com.bbva"})
@EntityScan(basePackages = {"com.bbva.proxy", "com.bbva"})
// JBOSS
public class CpdJavaProxyApplication/* extends SpringBootServletInitializer*/ {

  //JBOSS
  // @Override
  // protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
  //     return application.sources(CpdJavaProxyApplication.class);
  // }

  public static void main(String[] args) {
    SpringApplication.run(CpdJavaProxyApplication.class, args);
  }

}
