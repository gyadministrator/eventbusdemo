package com.fld.eventbus.demo;

import com.fld.eventbus.demo.event.MessageEvent;
import com.fld.eventbus.demo.handler.EventHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: eventbusdemo
 * @description:
 * @author: fldserver
 * @create: 2019-12-18 10:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EventBusTest {

    @Autowired
    private EventHandler eventHandler;

    @Test
    public void postEvent() {
        MessageEvent<String> messageEvent = new MessageEvent<>();
        messageEvent.setTag("tag");
        messageEvent.setData("jack");
        eventHandler.eventPost(messageEvent);
    }
}