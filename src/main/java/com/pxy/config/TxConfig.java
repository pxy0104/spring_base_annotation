package com.pxy.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.pxy")
@EnableTransactionManagement
public class TxConfig {
    //配置DataSource数据源
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        //啥子数据源的名称和密码等等
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //设置连接的url
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        //设置连接的驱动
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
