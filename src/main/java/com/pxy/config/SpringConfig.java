package com.pxy.config;

import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.pxy")
@PropertySource(value = "jdbc.properties",encoding = "utf-8")
public class SpringConfig {
}
