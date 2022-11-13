package org.example.designpatterns.chain_of_responsibility;

public class ErrorLogger extends BaseLogger {

    public ErrorLogger(BaseLogger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel) {

        System.out.println("***** IAM ERROR LOGGER");
        if (logLevel == ERROR) {
            System.out.println("***** INSIDE ERRORLOGGER : " + message);
            return;
        } else {
            System.out.println("***** THIS IS NOT A ERROR LEVEL LOG");
        }
    }
}
