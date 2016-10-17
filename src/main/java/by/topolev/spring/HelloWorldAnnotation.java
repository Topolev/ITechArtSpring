package by.topolev.spring;

import by.topolev.spring.beans.RenderMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vladimir on 16.10.2016.
 */
public class HelloWorldAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        RenderMessage renderMessage = context.getBean(RenderMessage.class);
        renderMessage.render();
    }
}
