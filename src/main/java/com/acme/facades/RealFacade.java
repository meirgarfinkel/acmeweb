package com.acme.facades;

/**
 * facade to get the status info easily
 */
public class RealFacade implements IServerInfo {
    Runtime runtime = Runtime.getRuntime();

    @Override
    public int getAvailableProcessors() {

        return runtime.availableProcessors();
    }

    @Override
    public long getFreeJVMMemory() {

        return runtime.freeMemory();
    }

    @Override
    public long getTotalJVMMemory() {

        return runtime.totalMemory();
    }

    @Override
    public String getJreVersion() {

        return Runtime.class.getPackage().getImplementationVersion();
    }

    @Override
    public String getTempLocation() {

        return System.getenv("TEMP");
    }
}
