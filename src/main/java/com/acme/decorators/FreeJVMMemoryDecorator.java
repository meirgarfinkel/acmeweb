package com.acme.decorators;

import com.acme.facades.IServerInfo;
import com.acme.statusmgr.beans.ServerStatus;

import java.util.List;

/**
 * This is a decorator that gets the free jvm memory
 */
public class FreeJVMMemoryDecorator implements IStatus {

    private IStatus thingIAmDecorating;
    private IServerInfo facade;


    public FreeJVMMemoryDecorator(IStatus ss) {
        thingIAmDecorating = ss;
    }

    @Override
    public long getId() {
        return thingIAmDecorating.getId();
    }

    @Override
    public String getContentHeader() {
        return thingIAmDecorating.getContentHeader();
    }

    @Override
    public List<String> getDetails() {
        return thingIAmDecorating.getDetails();
    }

    @Override
    public String getStatusDesc() {
        return getStatusDesc() + facade.getFreeJVMMemory();
    }

    public void setFacade(IServerInfo facadeToUse) {
        this.facade = facadeToUse;
    }
}
