//package com.longhoang.finalexammodule2.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class BasicConfiguration extends WebSecurityConfigurerAdapter {
//    @Autowired
//    CustomSuccessHandler customSuccessHandler;
//
//    @Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        auth.inMemoryAuthentication().withUser("bill").password(passwordEncoder.encode("123")).roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder.encode("123")).roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("dba").password(passwordEncoder.encode("123")).roles("ADMIN","DBA");
//    }
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/", "/employees").access("hasRole('USER')")
//                .antMatchers("/admin/**").access("hasRole('ADMIN')")
//                .antMatchers("/dba/**").access("hasRole('ADMIN') and hasRole('DBA')")
//                .and().formLogin().successHandler(customSuccessHandler)
//                .usernameParameter("ssoId").passwordParameter("password")
//                .and().csrf()
//                .and().exceptionHandling().accessDeniedPage("/Access_Denied");
//    }
//}
