package by.topolev.spring;

import by.topolev.spring.beans.RenderMessage;
import by.topolev.spring.beans.RenderMessageConsole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vladimir on 16.10.2016.
 */
@Configuration
public class AppConfig {

    @Bean
    public String message(){
        return "Hello, World via Java based way";
    }


    @Bean
    public RenderMessage renderMessageConsole(){
        return new RenderMessageConsole(message());
    }
}
