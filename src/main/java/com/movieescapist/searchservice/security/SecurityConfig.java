package com.movieescapist.searchservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig  {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http

                .authorizeRequests()
                .anyRequest().permitAll();
        return http.build();
//        http
//                .csrf((csrf) -> csrf.disable())  // Disable CSRF if not needed
//                .authorizeHttpRequests((auth) -> auth
//                        .requestMatchers("/public/**", "/login", "/api").permitAll()  // Allow public access to these paths
//                        .anyRequest().authenticated()  // Secure all other requests
//                )
//                .formLogin((form) -> form.disable())  // Enable form-based authentication
//                .httpBasic((httpBasic) -> httpBasic.disable());  // Enable HTTP Basic authentication (optional)
//        return http.build();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                  // Disable CSRF if not needed
//                .authorizeRequests()
//                .anyRequest().permitAll();  // Disable security for all endpoints
//    }
}
