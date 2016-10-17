package by.topolev.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Vladimir on 16.10.2016.
 */
public class RenderMessageConsole implements RenderMessage {
    private String message;

    public RenderMessageConsole(String message){
        this.message = message;
    }

    @Override
    public void render() {
        System.out.println(message);
    }
}
