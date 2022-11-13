package org.example.designpatterns.strategypattern;

public class Main {
    public static void main(String[] args) {
        try {
            RequestValidator requestValidator = new RequestValidator("abcgmail",  new StringValidator());
            requestValidator.validate();
            requestValidator = new RequestValidator(0, new IntegerValidator());
            requestValidator.validate();
        } catch (Exception exception) {
            System.out.println("Got exception : " + exception.getMessage());
        }
    }
}
