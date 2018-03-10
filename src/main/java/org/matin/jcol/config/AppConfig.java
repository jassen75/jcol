package org.matin.jcol.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@EnableJpaRepositories(basePackages = "org.jcol.collection")
public class AppConfig {

}