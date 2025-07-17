package com.example.demo.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ApplicationReadyEventListener {

    @EventListener(ApplicationReadyEvent.class)
    public void applicationReadyEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("Application Ready Event generated at "
                + new Date(applicationReadyEvent.getTimestamp()));
    }
}
