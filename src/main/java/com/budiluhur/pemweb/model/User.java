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
package com.budiluhur.pemweb.model;

import javax.persistence.*;

/**
 *
 * Author andry on 24/10/17.
 */
@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String nim;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
