package org.example.designpatterns.chain_of_responsibility;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(1, "This is information");
    }
}
