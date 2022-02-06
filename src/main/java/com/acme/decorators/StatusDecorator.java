package com.acme.decorators;

import com.acme.facades.IServerInfo;
import com.acme.factory.ServerStatusFactory;
import com.acme.statusmgr.beans.ServerStatus;
import org.apache.catalina.Server;
/**
 * This is the base abstract class for decorating
 */
public abstract class StatusDecorator {

    public static IServerInfo facade;
    private ServerStatus thingIAmDecorating;

    public StatusDecorator(ServerStatus ss){
        thingIAmDecorating = ss;
    }

    public abstract String getStatusDesc();

    public static void setFacade(IServerInfo facadeToUse) {
        facade = facadeToUse;
    }
}
