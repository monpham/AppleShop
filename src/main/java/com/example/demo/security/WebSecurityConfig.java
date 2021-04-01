package com.example.demo.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.DelegatingPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.joining;
import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;
import static org.springframework.security.core.userdetails.User.withUsername;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";
    private static final String MANAGER_ROLE = "MANAGER";
    @Autowired
    private DataSource dataSource;

    @Autowired
    AuthenticationSuccessHandlerCustom authenticationSuccessHandlerCustom;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery("SELECT username, password, enabled FROM user WHERE username=?")
                .authoritiesByUsernameQuery("SELECT u.username, r.name FROM user_role ur " +
                        " INNER JOIN user u ON u.id = ur.user_id" +
                        " INNER JOIN  role r ON r.id = ur.role_id" +
                        " WHERE u.username=?");
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login").authenticated()
                .antMatchers("/admin/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/maps/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/tables/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/invoice/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/calendar/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/sweet/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/sendmail/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/delete/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/contacts/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/editAccountUser/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/editAccount/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/AccountAdminAdd/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/productsadmin/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/addProducts/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/editProducts/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/newProducts/**").hasAuthority(ADMIN_ROLE)
                .antMatchers("/cart/**").hasAuthority(USER_ROLE)
                .antMatchers("/paypal/**").hasAuthority(USER_ROLE)
                .antMatchers("/user/**").hasAuthority(USER_ROLE)
                .antMatchers("/manager/**").hasAuthority(MANAGER_ROLE)
                .and()
                .formLogin().permitAll()
                .loginPage("/login")
                .loginProcessingUrl("/j_spring_security_check")
                .usernameParameter("username")
                .passwordParameter("password")
                .failureUrl("/error")
                .successHandler(authenticationSuccessHandlerCustom)
                .and()
                .logout()
                .permitAll()
                .logoutUrl("/logout");

    }
}
