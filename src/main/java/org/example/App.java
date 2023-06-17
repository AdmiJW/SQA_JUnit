package org.example;


public class App {

    int value = 0;

    int increment() {
        return ++value;
    }

    int decrement() {
        return --value;
    }

    int divide(int a, int b) {
        return a / b;
    }

    void infiniteLoop() {
        while (true) { }
    }
}
