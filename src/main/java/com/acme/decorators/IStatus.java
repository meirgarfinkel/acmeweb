package com.acme.decorators;

import java.util.List;

/**
 * interface for getting the current status
 */
public interface IStatus {

    /**
     * get the id of this request
     *
     * @return a numeric id that increases during life of server for each request .
     */
    long getId();

    /**
     * Get the content header that was specified by the request
     *
     * @return some string
     */
    String getContentHeader();

    List<String> getDetails();

    /**
     * Get an english-like description of the server's status
     *
     * @return A string describing status
     */
    String getStatusDesc();
}
