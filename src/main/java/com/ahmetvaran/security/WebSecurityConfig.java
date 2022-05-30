package com.ahmetvaran.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

//@EnableWebSecurity
public class WebSecurityConfig {
//    public class WebSecurityConfig extends WebSecurityConfigurerAdapter
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .anyRequest()
//               .authenticated()
//                .and()
//                .httpBasic();
//    }


//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        authenticationManagerBuilder
//                .inMemoryAuthentication()
//                .withUser("AhmetVaran")
//                .password("{noop}root")     //şifrenin maskelenmiş oalrak gitmemesi için noop eklendi
//                .roles("USER");
//    }

    //Şifrenin maskelenmiş olarak gönderilmesi için
//    @Autowired
//    public void configureGlobalEncryped(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//        PasswordEncoder passwordEncoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();

//       authenticationManagerBuilder
//                .inMemoryAuthentication()
//                .withUser("AhmetVaran")
//              .password(passwordEncoder.encode("root"))
//                .roles("USER");
//   }
}
