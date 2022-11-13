package org.example.designpatterns.chain_of_responsibility;

public class InfoLogger extends BaseLogger {

    public InfoLogger(BaseLogger nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel) throws Exception {
        System.out.println("***** IAM INFO LOGGER");
        if (logLevel == INFO) {
            System.out.println("***** INSIDE INFOLOGGER : " + message);
            throw new Exception("Process failed");
        } else {
            System.out.println("***** THIS IS NOT A INFO LEVEL LOG");
        }
    }
}
