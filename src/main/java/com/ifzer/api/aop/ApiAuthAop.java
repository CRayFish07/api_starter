/**
 * Project Name:api_quku
 * File Name:ApiAuthAop.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.aop
 * Date:Sep 26, 20143:58:29 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName:ApiAuthAop <br/>
 * Date:     Sep 26, 2014 3:58:29 PM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
@Aspect
@Component
public class ApiAuthAop {

    
    /**
     * logger 
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(ApiAuthAop.class);
    
    @Around("execution(* com.imusic.api_quku.data.jpa.repo.resources.*Repository.*(..))")
    public Object logAround(ProceedingJoinPoint pjp) {
        LOGGER.info("around start......");
        Object obj = null;
        try {
            obj = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        LOGGER.info("around proceed......");
        return obj;
    }
    
    
}

