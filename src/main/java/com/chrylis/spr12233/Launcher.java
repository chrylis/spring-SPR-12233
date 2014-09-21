package com.chrylis.spr12233;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.blitline.image.BlitlinePostback;
import com.blitline.image.spring.annotation.EnableBlitlineImageService;
import com.blitline.image.spring.postback.BlitlinePostbackHandler;

@Configuration
@EnableAutoConfiguration
@EnableBlitlineImageService
public class Launcher {

    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }

    // This is here because the service needs a handler to pass events back to.
    @Bean
    public BlitlinePostbackHandler noopHandler() {
        return new BlitlinePostbackHandler() {
            @Override
            public void handlePostback(BlitlinePostback postback) {
            }
        };
    }
}
