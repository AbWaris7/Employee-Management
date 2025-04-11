package com.khan.code.Employee.Management.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class EmployeeSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {

        UserDetails abdul = User.builder()
                .username("abdul")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE, MANAGER")
                .build();

        UserDetails mark = User.builder()
                .username("mark")
                .password("{noop}test123")
                .roles("EMPLOYEE, MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(abdul, john, mark);
    }
}
