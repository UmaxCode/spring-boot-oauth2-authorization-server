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
        UserDetails userDetails1 = User.withDefaultPasswordEncoder()
                .username("user1")
                .password("password1")
                .roles("user", "admin")
                .build();

        UserDetails userDetails2 = User.withDefaultPasswordEncoder()
                .username("user2")
                .password("password2")
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    }

}
