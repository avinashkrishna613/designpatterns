package org.example.designpatterns.chain_of_responsibility;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseLogger implements ILogger {
    BaseLogger nextLogProcessor;

    public BaseLogger(BaseLogger nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public final void log (int logLevel, String message) throws Exception {
        log(message, logLevel);
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }

    public abstract void log(String message, int logLevel) throws Exception;
}
