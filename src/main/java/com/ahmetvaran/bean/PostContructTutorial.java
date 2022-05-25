package com.ahmetvaran.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@Controller
public class PostContructTutorial {
    @Autowired
    Logger LOG;

    //parametresiz constructor
   /* public BeanController() {
        LOG.info("Log info çağrıldı.");
    } */
    //bean henüz başlamadığından null alıyoruz ve burada bağımlılığı enjekte edemiyoruz
    //Görevi: Bir bean nesnesi oluşturulduğunda hemen oluşur.
    @PostConstruct
    public void init(){
        LOG.info("Log info çağrıldı");
    }
    public static void main(String[] args) {
        PostContructTutorial postContructTutorial = new PostContructTutorial();
        System.out.println(postContructTutorial);
    }
}
