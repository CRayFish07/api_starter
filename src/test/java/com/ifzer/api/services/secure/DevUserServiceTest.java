/**
 * Project Name:api_quku
 * File Name:DevUserServiceTest.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.services.secure
 * Date:Sep 28, 20144:59:05 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.services.secure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ifzer.api.data.jpa.domain.DevUser;
import com.ifzer.api.services.secure.DevUserService;
import com.imusic.api.JunitApplicationTests;

/**
 * ClassName:DevUserServiceTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 28, 2014 4:59:05 PM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class DevUserServiceTest extends JunitApplicationTests{
    
    @Autowired
    private DevUserService ser;
    
    /**
     * setUp:(描述这个方法的作用,适用条件，执行流程， 使用方法及注意事项). <br/>
     * @author Nelson
     * @throws java.lang.Exception
     * @since JDK 1.6
     */
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        assertNotNull(ser);
        DevUser findByName = ser.findByName("api");
        assertNotNull(findByName);
    }

}

