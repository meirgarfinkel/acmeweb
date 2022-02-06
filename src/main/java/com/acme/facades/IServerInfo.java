package com.acme.facades;

/**
 * interface for server info
 */
public interface IServerInfo {
    int getAvailableProcessors();
    long getFreeJVMMemory();
    long getTotalJVMMemory();
    String getJreVersion();
    String getTempLocation();
}
