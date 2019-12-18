package com.fld.eventbus.demo.config;

import org.greenrobot.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: eventbusdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 10:48
 */
@Configuration
public class EventBusConfig {

    @Bean
    public EventBus eventBus() {
        return new EventBus();
    }
}