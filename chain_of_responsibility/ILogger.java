package org.example.designpatterns.chain_of_responsibility;

public interface ILogger {
    int INFO = 1;
    int DEBUG = 2;
    int ERROR = 3;
    void log (int logLevel, String message) throws Exception;
}
