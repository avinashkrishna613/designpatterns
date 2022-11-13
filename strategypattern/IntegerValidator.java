package org.example.designpatterns.strategypattern;

public class IntegerValidator implements IValidator {

    @Override
    public void validate(Object request) throws Exception {
        Integer requestInt = (Integer) request;
        if (requestInt == null || requestInt.equals(0) ) {
            throw new Exception(String.format("Request cannot be equal to 0 : %d", requestInt));
        }
        System.out.println("Integer object validated successfully");
        return;
    }
}
