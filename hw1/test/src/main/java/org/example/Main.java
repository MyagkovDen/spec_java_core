package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Person person = new Person("John", "Doe", 30);
        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }


}
class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}