/**
 * Innovez-One, Proprietary Software Cloud Communications
 * Copyright (c) 2015, Innovez-One and individual contributors
 * by the @authors tag.
 * <p>
 * This program is Proprietary Software: you can not redistribute it and/or modify
 * without license from Innovez-One.
 * <p>
 * Website : http://www.innovez-one.com/
 * Report bugs to <techsupport@innovez-one.com>.
 * Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.budiluhur.pemweb.web.controller;

/**
 *
 * Author andry on 24/10/17.
 */
public class Response {
    private String status;
    private Object data;

    public Response(){

    }

    public Response(String status, Object data){
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
