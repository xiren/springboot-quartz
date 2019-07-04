package com.example.quartz.config;

import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfiguration {

    @Bean
    @QuartzDataSource
    @ConfigurationProperties(prefix = "spring.datasource.quartz")
    public DataSource initQuartzDataSource() {
        return DataSourceBuilder.create().build();
    }


}
