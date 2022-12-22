package com.example.openfeign.api;

import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

import java.lang.reflect.Type;

public class MyApiConfiguration {
    @Bean
    public Encoder myEncoder() {
        return new Encoder() {
            @Override
            public void encode(Object object, Type bodyType, RequestTemplate template) throws EncodeException {
                System.out.println("trigger myEncoder#encode");
            }
        };
    }

}
