package com.a18d.spring.rest.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.Property;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.a18d.spring.rest")
@EnableWebMvc
@EnableTransactionManagement
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
    public LocalSessionFactoryBean localSessionFactoryBean(){
        LocalSessionFactoryBean localSession = new LocalSessionFactoryBean();
        localSession.setDataSource(dataSource());
        localSession.setPackagesToScan("com.a18d.spring.rest.entity");
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.SQLServerDialect");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        localSession.setHibernateProperties(hibernateProperties);
        return localSession;
    }

    @Bean
    public HibernateTransactionManager hibernateTransactionManager(){
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(localSessionFactoryBean().getObject());
        return htm;
    }
}
