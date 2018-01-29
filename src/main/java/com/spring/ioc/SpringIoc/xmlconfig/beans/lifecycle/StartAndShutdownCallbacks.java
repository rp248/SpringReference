package com.spring.ioc.SpringIoc.xmlconfig.beans.lifecycle;

import org.springframework.context.Lifecycle;

public class StartAndShutdownCallbacks implements Lifecycle {

    @Override
    public void start() {
        System.out.println("StartAndShutdownCallbacks- start() invoked");
    }

    @Override
    public void stop() {
        System.out.println("StartAndShutdownCallbacks- stop() invoked");
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
