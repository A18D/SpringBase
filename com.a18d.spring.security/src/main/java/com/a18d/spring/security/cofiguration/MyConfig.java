package com.a18d.spring.security.cofiguration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "com.a18d.spring.security")
@EnableWebMvc
public class MyConfig {
    @Bean
    public DataSource dataSource(){
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            dataSource.setJdbcUrl("jdbc:sqlserver://localhost;databaseName=my_db");
            dataSource.setUser("C1");
            dataSource.setPassword("18198812");
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }

        return dataSource;
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver =
                new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
