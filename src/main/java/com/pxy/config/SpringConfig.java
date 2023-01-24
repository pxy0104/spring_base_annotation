package com.pxy.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@ComponentScan(basePackages = "com.pxy")
@EnableAspectJAutoProxy //开启Aspect生成代理对象
//@PropertySource(value ="jdbc.properties" ,encoding = "utf-8")
public class SpringConfig {

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
//    @Bean(name = "primaryDataSource")
//    @ConfigurationProperties("jdbc")
//    public DataSource primaryDataSource() {
//        return (DataSource) DataSourceBuilder.create().build();
//    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
//    @Bean
//    public DataSourceTransactionManager dataSourceTransactionManager(){
//        return dataSource();
//    }
    @Bean
    public DataSourceTransactionManager  dataSourceTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
