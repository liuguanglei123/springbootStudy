package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestEventListener {
    @EventListener
    public void eventListener(TestEvent testEvent){
        log.info(String.valueOf(testEvent.getEventVariables()));
    }
}
