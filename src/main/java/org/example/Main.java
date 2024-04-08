package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        writeResult(new Person("Dima","Chyrkin"));
    }

    private static void writeResult(Person person) {
        String result = new Gson().toJson(person);
        System.out.println(result);
    }
}