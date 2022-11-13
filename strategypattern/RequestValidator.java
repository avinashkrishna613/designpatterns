package org.example.designpatterns.strategypattern;

public class RequestValidator {
    private Object request;
    private IValidator iValidator;

    public RequestValidator(Object request, IValidator iValidator) {
        this.request = request;
        this.iValidator = iValidator;
    }

    public void validate() throws Exception {
        iValidator.validate(request);
    }
}
