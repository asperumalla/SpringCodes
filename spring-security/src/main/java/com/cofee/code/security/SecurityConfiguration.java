package com.cofee.code.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	
	
	/**
	 * Illustration of in-memory Authentication
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.dataSource(dataSource);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		
		/**
		 * Make sure we follow the order of assigning permissions in the 
		 * order of most secured to least secured 
		 */
		.antMatchers("/employee").hasAnyRole("EMPLOYEE")
		.antMatchers("/visitor").hasAnyRole("VISITOR","EMPLOYEE")
		.antMatchers("/**").permitAll()
		.and()
		.formLogin();
	}
	
	/**
	 * Make sure that we declare this password encoder and @Bean declaration 
	 * for Spring to detect this bean 
	 * Feel free to implement the password encoding as you wish !!
	 * @return
	 */
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
	
}
