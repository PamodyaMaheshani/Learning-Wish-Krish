package com.training.student.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "learnBook")
public class LearnEndpoint {

    Map<String, Learn> learnBooks = new ConcurrentHashMap<>();

    //return all the books we have
    @ReadOperation
    public Map<String, Learn> getAllLaernBooks() {
        return learnBooks;
    };

    //get the stage name and return the object
    //here the name parameter is the endpoint
    //https://localhost:8080/(name)
    @ReadOperation
    public Learn getLearnBooks(@Selector String name) {
        return learnBooks.get(name);
    }

    @WriteOperation
    public void setLearnBooks(@Selector String name, Learn bookPages ) {
        learnBooks.put(name, bookPages);
    }

    //create our own actuator end point
    static class Learn {

        int pagesOfBooks;

        public Learn(int pagesOfBooks) {
            this.pagesOfBooks = pagesOfBooks;
        }

        public int getPagesOfBooks() {
            return pagesOfBooks;
        }

        public void setPagesOfBooks(int pagesOfBooks) {
            this.pagesOfBooks = pagesOfBooks;
        }
    }

}
