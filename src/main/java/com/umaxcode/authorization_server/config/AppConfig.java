package com.umaxcode.authorization_server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails1 = User.withUsername("user1")
                .password("{noop}password1")
                .roles("user", "admin")
                .build();

        UserDetails userDetails2 = User.withUsername("user2")
                .password("{noop}password2")
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

}
