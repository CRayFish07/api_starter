/**
 * Project Name:api_quku
 * File Name:DevUserService.java <p>function description: </p>
 * Package Name:com.imusic.api_quku.services.secure
 * Date:Sep 28, 201411:38:11 AM
 * Copyright (c) 2014, 020lilin@gmail.com All Rights Reserved.
 */
package com.ifzer.api.services.secure;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import com.ifzer.api.data.jpa.domain.DevUser;
import com.ifzer.api.data.jpa.repo.secure.DevUserRepo;
import com.ifzer.api.util.KeyUtil;

/**
 * ClassName:DevUserService <br/>
 * Date: Sep 28, 2014 11:38:11 AM <br/>
 * 
 * @author Nelson Email 020lilin@gmail.com
 * @version 1.0
 * @since JDK 1.6
 * @see
 */
@Service
public class DevUserService {

    @Autowired
    private DevUserRepo repo;

    @SuppressWarnings("rawtypes")
    @Autowired
    private RedisTemplate template;

    public DevUser findByName(String name) {
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new JdkSerializationRedisSerializer());
        ValueOperations<String,DevUser> opsForValue = template.opsForValue();
        Object object = opsForValue.get(KeyUtil.userKey(name));
        if (object == null) {
            List<DevUser> list = repo.findByName(name);
            if (list != null && !list.isEmpty()) {
                DevUser user = list.get(0);
//                temp.setValueSerializer(new GenericToStringSerializer<DevUser>(DevUser.class));
                opsForValue.set(KeyUtil.userKey(name), user);
                template.expire(KeyUtil.userKey(name), 24L, TimeUnit.HOURS);
                return user;
            }
        }
        return (DevUser) object;
    }

}
