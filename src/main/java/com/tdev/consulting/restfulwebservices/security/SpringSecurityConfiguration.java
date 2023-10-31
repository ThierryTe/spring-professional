package com.tdev.consulting.restfulwebservices.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;


//@Configuration
public class SpringSecurityConfiguration {
	
@Bean
public SecurityFilterChain filterChain(HttpSecurity http)throws Exception {
	
	// 1) All requests should be authenticated
	return http
	.authorizeHttpRequests(auth ->
	auth
	.requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
	.anyRequest().authenticated())
	
	//2) If a request is not authenticated, a web page is shown
	.httpBasic(Customizer.withDefaults())
	.sessionManagement(
			session -> session.sessionCreationPolicy
			(SessionCreationPolicy.STATELESS))
    //3) disable CSRF
    .csrf(csrf -> csrf.disable())
    
	.build();
}
	
	
}
