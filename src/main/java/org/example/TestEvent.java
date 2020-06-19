package org.example;

import lombok.Data;

@Data
public class TestEvent {
    public Integer eventVariables;

    public TestEvent(Integer var){
        this.eventVariables = var;
    }
}
