package com.ahmetvaran.bean;

import com.ahmetvaran.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")     //proje boyunca çalışır
//    @Scope("request")       //istek boyunca çalışır
//    @Scope("session")       //oturum boyunca çalışır
    public BeanDto beanDto(){

        return BeanDto.builder().id(0L).beanName("bean name").beanData("bean data").build();
    }
}
