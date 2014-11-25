/**
 * Project Name:api_quku
 * File Name:ValidUtil.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.util
 * Date:Sep 28, 201411:13:58 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.util;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import jodd.datetime.JDateTime;
import jodd.util.RandomStringUtil;
import jodd.util.StringUtil;

/**
 * ClassName:ValidUtil <br/>
 * Function: add valid field<br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 28, 2014 11:13:58 AM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class ValidUtil {

    private static final int VALID_MINUTE = 3;//有效的时间效果
    
    public static boolean isValidTime(Map<String,String> map) throws ParseException{
        if(map == null || map.containsKey(KeyUtil.TS)){
            Date parse = KeyUtil.DF_FORMAT.parse(map.get(KeyUtil.TS));
            JDateTime time1 = new JDateTime(parse);
            JDateTime time2 = new JDateTime();
            time2.addMinute(VALID_MINUTE);
            if(time2.isAfter(time1)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Map<String , String > map = new HashMap<String, String>();
        map.put(KeyUtil.TS, KeyUtil.DF_FORMAT.format(new Date()));
//            System.out.println(isValidTime(map));
//            System.out.println(RandomStringUtil.randomAlphaNumeric(12));
            randomPassword(12);
    }
    
    public static String randomPassword(int length){
        StringBuilder sb = new StringBuilder();
        char [] chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!_=".toCharArray();
        Random rd = new Random();
        char [] result = new char[length];
        while(length -- > 0){
            sb.append(chars[rd.nextInt(chars.length)]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}

