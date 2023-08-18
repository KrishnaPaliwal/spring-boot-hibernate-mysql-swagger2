package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@SpringBootApplication( exclude = HibernateJpaAutoConfiguration.class )
public class SpringBootHibernateMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHibernateMysqlApplication.class, args);
    }
    
    @Bean
    public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter() {
        return new MappingJackson2XmlHttpMessageConverter();
    }
}
