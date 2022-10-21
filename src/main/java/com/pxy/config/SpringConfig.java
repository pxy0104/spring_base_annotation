package com.pxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.pxy.dao","com.pxy.service"})
@PropertySource(value = "jdbc.properties",encoding = "utf-8")
public class SpringConfig {
}
