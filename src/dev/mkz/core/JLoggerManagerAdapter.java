package dev.mkz.core;

import dev.mkz.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log("Core" + message);
    }
}
