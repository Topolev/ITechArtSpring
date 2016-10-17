package by.topolev.spring;

import by.topolev.spring.beans.RenderMessage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Vladimir on 16.10.2016.
 */
public class HelloWorldXML {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context-xml.xml");
        RenderMessage renderMessage = context.getBean(RenderMessage.class);
        renderMessage.render();
    }
}
