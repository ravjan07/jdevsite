package com.websystique.spring.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig {

	@Bean
	public DataSource createDataSource() {
		System.out.println("Creating DEV database");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		/*
		 * Set MySQL specific properties for Development Environment
		 */
		return dataSource;
	}

}
