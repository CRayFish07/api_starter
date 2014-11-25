/**
 * Project Name:api_quku
 * File Name:MD5Util.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.util
 * Date:Sep 28, 20149:57:58 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

/**
 * ClassName:MD5Util <br/>
 * Function: generate md5 value<br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 28, 2014 9:57:58 AM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class MD5Util {

    
    /**
     * logger 
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);
    
    public static String md5(String toGen){
        String md5value = "";
        if(StringUtils.isEmpty(toGen)){
            return md5value;
        }
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] digestBytes = digest.digest(toGen.getBytes("utf-8"));
            StringBuffer sb = new StringBuffer();
            for(byte b : digestBytes){
                int bt = b & 0xff;
                if(bt < 16){
                    sb.append(0);
                }
                sb.append(Integer.toHexString(bt));
            }
            md5value = sb.toString();
            
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            LOGGER.error(e.getMessage());
        }
        return md5value;
    }
    
    public static String getMd5ByParamsSortByAlph(Map<String, String> map){
        if(map == null || map.size() == 0)
            return "";
        List<String> keyList = new ArrayList<String>(map.keySet());
        Collections.sort(keyList);
        
        StringBuffer sb = new StringBuffer();
        for (String key : keyList) {
            sb.append(map.get(key)).append("|");
        }
        //add user password to last
        
        String value = sb.substring(0, sb.length() - 2);
        LOGGER.info(value);
        
        String md5v = md5(value);
        LOGGER.info(md5v);
        return md5v;
    }
    
    public static void main(String[] args) {
        LOGGER.info("kkk");
        LOGGER.info(md5("kkk"));
        
        Map<String,String> amap = new HashMap<String, String>();
        amap.put("iuo", "kkkk");
        amap.put("2iuo", "kkk2k");
        amap.put("3iuo", "kkkk3");
        amap.put("6iuo", "kkkk4");
        amap.put("tiuo", "kkkk5");
        amap.put("7iuo", "kkkk6");
        getMd5ByParamsSortByAlph(amap);
    }
}

