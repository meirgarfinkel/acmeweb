package com.acme.facades;

/**
 * fake facade class for testing - returns fixed results
 */
public class FakeFacade implements IServerInfo {
    Runtime runtime = Runtime.getRuntime();

    @Override
    public int getAvailableProcessors() {

        return 4;
    }

    @Override
    public long getFreeJVMMemory() {
        return 127268272;
    }

    @Override
    public long getTotalJVMMemory() {

        return 159383552;
    }

    @Override
    public String getJreVersion() {

        return "15.0.2+7-27";
    }

    @Override
    public String getTempLocation() {

        return "M:\\\\AppData\\\\Local\\\\Temp";
    }
}
