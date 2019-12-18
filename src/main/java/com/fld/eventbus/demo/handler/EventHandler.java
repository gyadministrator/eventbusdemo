package com.fld.eventbus.demo.handler;

import com.fld.eventbus.demo.event.MessageEvent;
import com.fld.eventbus.demo.listener.EventListener;
import lombok.extern.slf4j.Slf4j;
import org.greenrobot.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: eventbusdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 10:50
 */
@Component
@Slf4j
public class EventHandler {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Autowired
    private EventBus eventBus;

    @Autowired
    private EventListener eventListener;

    @PostConstruct
    public void init() {
        eventBus.register(eventListener);
    }

    @PreDestroy
    public void destroy() {
        eventBus.unregister(eventListener);
    }

    public void eventPost(MessageEvent messageEvent) {
        eventBus.post(messageEvent);
        logger.log(Level.WARNING, "post event " + messageEvent.getTag());
    }
}