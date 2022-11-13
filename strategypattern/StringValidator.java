package org.example.designpatterns.strategypattern;

public class StringValidator implements IValidator {
    @Override
    public void validate(Object request) throws Exception {
        String requestString = request.toString();
        if ((requestString == null || requestString.length() <= 0 || requestString.contains("*"))) {
            throw new Exception(String.format("Request string : [%s] is invalid ", requestString));
        }
        System.out.println("String object validated successfully");
        return;
    }
}
