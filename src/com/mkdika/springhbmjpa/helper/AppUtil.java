package com.mkdika.springhbmjpa.helper;

import com.mkdika.springhbmjpa.service.ServiceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Maikel
 */
public class AppUtil {
 
    private static ApplicationContext context;    
    private static ServiceDao service;
    
    /*
    Singleton pattern pada load spring context & config.
    Supaya efisien instance spring bisa dipakai berulang" dimana saja.
    Namun load aplication context ini cukup dilakukan 1x pada saat aplikasi
    startup.
    */
    private static ApplicationContext getSpringContext() {
        if (context == null) {
            context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        }
        return context;
    }
    
    /*
    Singleton pattern pada load serviceDao dari yang telah diregistrasi di
    Spring applicationContext.xml. Supaya efisien, instance hanya akan digenerate
    sekali dan bisa dipanggil langsung (static method) berulang" kali pada 
    semua program aplikasi.    
    */
    public static ServiceDao getService() {
        if (service == null) {
            service = (ServiceDao) getSpringContext().getBean("serviceDao");
        }
        return service;
    }    
}
