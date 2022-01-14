package com.training.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component // if annotate a class with @Component, it creates a bean.
@Endpoint(id = "stage") // when use @Component with @Endpoint, it exposes, https://localhost:8080/{id}
public class StageEndpoint {

    Map<String, Stage> stages = new ConcurrentHashMap<>();

    //return all the stages we have
    @ReadOperation
    public Map<String, Stage> getAllStages() {
        return stages;
    }

    ;

    //get the stage name and return the object
    //here the name parameter is the endpoint
    //@Selector - needs to operate this based on this value(name)
    @ReadOperation
    public Stage getStage(@Selector String name) {
        return stages.get(name);
    }

    @WriteOperation
    public void setValue(@Selector String name, int stage) {
        stages.put(name, new Stage(stage));
    }

    //create our own actuator end point
    static class Stage {
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
