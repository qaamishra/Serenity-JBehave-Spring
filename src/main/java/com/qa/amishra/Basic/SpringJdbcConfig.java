package com.qa.amishra.Basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.qa.amishra")
@PropertySource(value = "classpath:datasource.properties", ignoreResourceNotFound = false)
public class SpringJdbcConfig {

    private final Logger logger = LoggerFactory.getLogger(SpringJdbcConfig.class);
    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(env.getProperty("spring.datasource.h2.driver-class-name"));
        driverManagerDataSource.setUrl(env.getProperty("spring.datasource.h2.url"));
        driverManagerDataSource.setUsername(env.getProperty("spring.datasource.h2.username"));
        driverManagerDataSource.setPassword(env.getProperty("spring.datasource.h2.password"));

        return driverManagerDataSource;
    }

    @Bean
    protected JdbcTemplate getJDBCTemplate(DataSource dataSource) {

        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        jdbcTemplate.setMaxRows(10);
        return jdbcTemplate;



    }
}
