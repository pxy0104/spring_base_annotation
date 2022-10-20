package com.pxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.pxy.dao","com.pxy.service"})
public class SpringConfig {
}
