package com.pluralsight.dealershipapi.Configuration;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataBaseConfiguration {



//    private DataSource dataSource;
//
//
//    @Bean
//    public DataSource dataSource() {
//
//        HikariConfig config = new HikariConfig();
//        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
//        config.setUsername("user");
//        config.setPassword("password");
//        config.setMaximumPoolSize(10);
//        config.setIdleTimeout(30000);
//        return new HikariDataSource(config);
//    }



}
