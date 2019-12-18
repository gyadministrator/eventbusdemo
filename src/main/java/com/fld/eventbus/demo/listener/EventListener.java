package com.fld.eventbus.demo.listener;

import com.fld.eventbus.demo.event.MessageEvent;
import lombok.extern.slf4j.Slf4j;
import org.greenrobot.eventbus.Subscribe;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @program: eventbusdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 10:42
 */
@Component
@Slf4j
public class EventListener {
    private Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @Subscribe
    public void onMessageEvent(MessageEvent messageEvent) {
        logger.log(Level.WARNING, "Subscribe message:{}" + messageEvent);
    }
}