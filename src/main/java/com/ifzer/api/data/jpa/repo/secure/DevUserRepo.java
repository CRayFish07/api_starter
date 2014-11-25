/**
 * Project Name:api_quku
 * File Name:UserRepo.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.data.jpa.repo.secure
 * Date:Sep 28, 201411:34:08 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.data.jpa.repo.secure;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ifzer.api.data.jpa.domain.DevUser;

/**
 * ClassName:DevUserRepo <br/>
 * Date:     Sep 28, 2014 11:34:08 AM <br/>
 * @author   Nelson
 * Email	 020lilin@gmail.com
 * @version  1.0
 * @since    JDK 1.6
 * @see 	 
 */
@Repository
public interface DevUserRepo extends CrudRepository<DevUser, Long>{

    List<DevUser> findByName(String name);
}

