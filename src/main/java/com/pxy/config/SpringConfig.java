package com.pxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.pxy")
@EnableAspectJAutoProxy //开启Aspect生成代理对象
@PropertySource(value = "jdbc.properties",encoding = "utf-8")
public class SpringConfig {
}
