package com.ecommerce.ecommerce.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // 1. Disable CSRF for stateless REST APIs / POST requests from Postman
                .csrf(AbstractHttpConfigurer::disable)

                // 2. Configure endpoint authorization rules
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/users/**").permitAll() // Allow public access to user endpoints
                        .anyRequest().authenticated()                 // All other endpoints require authentication
                )

                // 3. Keep Basic Auth enabled
                .httpBasic(httpBasic -> {});

        return http.build();
    }
}