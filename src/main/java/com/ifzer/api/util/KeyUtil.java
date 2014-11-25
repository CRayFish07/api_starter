/**
 * Project Name:api_quku
 * File Name:KeyUtil.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.util
 * Date:Sep 28, 201411:18:26 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * ClassName:KeyUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 28, 2014 11:18:26 AM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class KeyUtil {

    /**
     * TIMESTAMP
     */
    public static final String TS = "TIMESTAMP";
    
    /**
     * TIMESTAMP FORMAT IS YYYYMMDDHHssmm
     */
    public static final String TS_FORMAT = "YYYYMMDDHHssmm";
    
    /**
     * TIMESTAMP FORMAT IS YYYYMMDDHHssmm
     */
    public static final DateFormat DF_FORMAT = new SimpleDateFormat(TS_FORMAT);
    
    public static String userKey(String name){
        return "user:"+name;
    }
    
}

