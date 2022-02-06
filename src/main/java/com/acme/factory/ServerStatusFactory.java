package com.acme.factory;

import com.acme.decorators.*;
import com.acme.facades.IServerInfo;
import com.acme.statusmgr.beans.ServerStatus;

import java.util.List;

/**
 * a factory to get any details requested about server status
 */
public class ServerStatusFactory {

    private ServerStatusFactory(){};

    /**
     * @return a new server status with whichever details are in the list
     */
    public static ServerStatus getServerStatus(long id, String contentHeader, List<String> details, IServerInfo givenFacade) {

        IStatus status = new ServerStatus(id, contentHeader, details, givenFacade);

        for (String detail : status.getDetails()){

            switch (detail){
                case("availableProcessors"): status = new AvailableProcessorsDecorator(status); break;
                case("freeJVMMemory"): status = new FreeJVMMemoryDecorator(status); break;
                case("totalJVMMemory"): status = new TotalJVMMemoryDecorator(status); break;
                case("jreVersion"): status = new JREVersionDecorator(status); break;
                case("tempLocation"): status = new TempLocationDecorator(status); break;
                default:
                    throw new IllegalStateException("Unexpected value: " + detail);
            }
        }

        return new ServerStatus(status.getId(), status.getContentHeader(), status.getDetails(), status.getStatusDesc(), givenFacade);
    }
}