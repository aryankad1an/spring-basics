package org.ancient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ancient")
public class BeanConfig {

//    // way of defining bean(if not using Component scan)
//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
}
