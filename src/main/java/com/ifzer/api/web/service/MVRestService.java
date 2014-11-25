/**
 * Project Name:api_quku
 * File Name:MVRestService.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.web.service
 * Date:Sep 25, 201410:15:25 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.web.service;


//import org.springframework.transaction.annotation.Transactional;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:MVRestService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 25, 2014 10:15:25 AM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
@RestController
public class MVRestService {

//    @Transactional(readOnly=true)
    @RequestMapping("/mvinfo")
    public String mvInfo(@RequestParam(required=true, value="mvid")String mvid){
        return "mvinfo is " + mvid;
    }
    
    @RequestMapping("/querymv")
    public Mv queryMvByName(@RequestParam(required=true, value="name")String name){
        Mv mv = new Mv();
        mv.setId(System.currentTimeMillis());
        mv.setName(name);
        mv.setUrl("url nil");
        return mv;
    }
    
    @XmlRootElement
    public static class Mv {
        String name;
        Long id;
        String url;
        String mvPath = "mv path";
        public String getMvPath(){
            return mvPath;
        }
        public void setMvPath(String mvPath) {
            this.mvPath = mvPath;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Long getId() {
            return id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
        
    }
}

