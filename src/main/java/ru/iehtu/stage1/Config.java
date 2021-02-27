package ru.iehtu.stage1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.iehtu.stage1.Man;

@Configuration
// @ComponentScan("ru.iehtu")
public class Config {

    @Bean("man")
    Man getMan(){
        Man man = new Man();
        return new Man();
    }

    @Bean("work")
    Work getWork() {

        return new Work(getMan(), "полотёр");

    }
    
}
