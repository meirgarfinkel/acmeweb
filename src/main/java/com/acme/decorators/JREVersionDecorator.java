package com.acme.decorators;

import com.acme.facades.IServerInfo;
import com.acme.statusmgr.beans.ServerStatus;

import java.util.List;

/**
 * This is a decorator that gets the jre version
 */
public class JREVersionDecorator implements IStatus {

    private IStatus thingIAmDecorating;
    private IServerInfo facade;


    public JREVersionDecorator(IStatus ss) {
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
        return getStatusDesc() + facade.getJreVersion();
    }

    public void setFacade(IServerInfo facadeToUse) {
        this.facade = facadeToUse;
    }
}
