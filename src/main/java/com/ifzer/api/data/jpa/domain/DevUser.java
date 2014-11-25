/**
 * Project Name:api_quku
 * File Name:DevUser.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.data.jpa.domain
 * Date:Sep 28, 201411:35:00 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * ClassName:DevUser <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Sep 28, 2014 11:35:00 AM <br/>
 * 
 * @author Nelson Email 020lilin@gmail.com
 * @version 1.0
 * @since JDK 1.6
 * @see
 */
@Entity(name="api_dev_user")
//@SequenceGenerator(name="sg_dev_user", sequenceName="api_dev_user_seq")
public class DevUser implements Serializable {

    /**
     */
    private static final long serialVersionUID = 5216557748249579551L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private Date createtime;
    private Date updatetime;
    private Integer enable;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }


}
