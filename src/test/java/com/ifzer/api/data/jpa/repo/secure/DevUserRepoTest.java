/**
 * Project Name:api_quku
 * File Name:DevUserRepoTest.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.data.jpa.repo.secure
 * Date:Sep 28, 20143:34:32 PM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.data.jpa.repo.secure;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ifzer.api.data.jpa.domain.DevUser;
import com.ifzer.api.data.jpa.repo.secure.DevUserRepo;
import com.ifzer.api.util.ValidUtil;
import com.imusic.api.JunitApplicationTests;

/**
 * ClassName:DevUserRepoTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     Sep 28, 2014 3:34:32 PM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
public class DevUserRepoTest extends JunitApplicationTests {

    @Autowired
    private DevUserRepo repo;
    /**
     * setUp:(描述这个方法的作用,适用条件，执行流程， 使用方法及注意事项). <br/>
     * @author Nelson
     * @throws java.lang.Exception
     * @since JDK 1.6
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test method for {@link org.springframework.data.repository.CrudRepository#save(S)}.
     */
//    @Test
    public void testSaveS() {
        assertNotNull(repo);
        DevUser user = new DevUser();
        user.setCreatetime(new Date());
        user.setUpdatetime(new Date());
        user.setEnable(1);
        user.setName("wap_api_user");
        user.setPassword(ValidUtil.randomPassword(12));
        repo.save(user);
    }

    /**
     * Test method for {@link org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)}.
     */
    @Test
    public void testFindOne() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.springframework.data.repository.CrudRepository#findAll()}.
     */
    @Test
    public void testFindAll() {
//        fail("Not yet implemented");
        Iterable<DevUser> findAll = repo.findAll();
        assertNotNull(findAll);
    }

    /**
     * Test method for {@link org.springframework.data.repository.CrudRepository#count()}.
     */
    @Test
    public void testCount() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link org.springframework.data.repository.CrudRepository#delete(java.lang.Object)}.
     */
    @Test
    public void testDeleteT() {
        fail("Not yet implemented");
    }

    @Test
    public void testFindByName(){
        List<DevUser> list = repo.findByName("api");
        System.out.println(list);
    }
}

