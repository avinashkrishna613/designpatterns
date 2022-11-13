package org.example.designpatterns.chain_of_responsibility;

public class DebugLogger extends BaseLogger {

    public DebugLogger(BaseLogger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel) {

        System.out.println("***** IAM DEBUG LOGGER");
        if (logLevel == DEBUG) {
            System.out.println("***** INSIDE DEBUGLOGGER : " + message);
            return;
        } else {
            System.out.println("***** THIS IS NOT A DEBUG LEVEL LOG");
        }
    }
}
