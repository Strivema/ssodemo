package com.ray.sso.config;

import lombok.SneakyThrows;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Ray.Ma
 * @date 2019/8/8 16:29
 */
@EnableOAuth2Sso
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    @SneakyThrows
    protected void configure(HttpSecurity http) {
        http.logout().logoutSuccessUrl("http://localhost:8080/logout");
        http.authorizeRequests().anyRequest().authenticated();
        http.csrf().disable();
    }
}
