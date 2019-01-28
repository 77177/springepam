package com.epam.config;


import org.hibernate.dialect.H2Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class Persistance {

    @Autowired
    DataSource dataSource;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {

        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setPackagesToScan("com.epam.model");
        localSessionFactoryBean.setHibernateProperties(hiberProp());
        localSessionFactoryBean.getHibernateProperties().setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        localSessionFactoryBean.getHibernateProperties().setProperty("hibernate.show_sql", "true");
        localSessionFactoryBean.getHibernateProperties().setProperty("hibernate.connection.driver_class", "org.h2.Driver");
        return localSessionFactoryBean;
    }

    public Properties hiberProp() {

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "H2Dialect");
        properties.setProperty("hibernate.show_sql", "true");
        return properties;
    }

}
