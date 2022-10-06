package com.seguranca.usuariosSeguranca.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfing extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //Desabilitar o csrf ".disable" pois ele trava quando vai cria algo novo, e autorizar as riquisições sem senha
        // para cadastrar usuarios com o ".authorizeHttpRequests"
        http.csrf().disable().authorizeHttpRequests().antMatchers("/usuarios/create")
                .permitAll().and().httpBasic();
    }

}
