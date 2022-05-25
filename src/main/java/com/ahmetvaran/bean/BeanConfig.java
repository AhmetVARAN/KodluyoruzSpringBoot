package com.ahmetvaran.bean;

import com.ahmetvaran.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto(){

        return BeanDto.builder().id(0L).beanName("bean name").beanData("bean data").build();
    }
}
