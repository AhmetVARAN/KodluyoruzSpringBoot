package com.ahmetvaran.tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//Bean yapısını kullanacağız yapı
@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod(){
        log.info("Bean Başlamadan Önce Ben Varım!");
        System.out.println("Bean başlamadan önce çalışacak metod");
    }
    //bitiş
    public void destroyBeanMethod(){
        log.info("Bean Bittikten Sonra Ben Varım!");
        System.err.println("Bean bittikten sonra çalışacak metod");
    }
}
