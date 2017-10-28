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
package com.budiluhur.pemweb.service;

import com.budiluhur.pemweb.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.annotation.PostConstruct;

/**
 *
 * Author andry on 25/10/17.
 */
@Component
public class Initializer {

    @Autowired
    private BookService bookService;

    @PostConstruct
    public void init(){
        int year = 2000;
        for(int i=1;i<=10;i++){
            Book book = new Book();
            book.setLocation("location "+i);
            book.setPublisher("publisher "+i);
            book.setTitle("title "+i);
            book.setDescription("description "+i);
            book.setRackNo(i);
            book.setYear(year++);
            bookService.save(book);
        }

    }

}
