package org.jcol.rep;

import org.jcol.collection.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired  
    private RedisTemplate<String, String> redisTemplate;  
    
    public String findUser(String userid) {
    	return redisTemplate.opsForValue().get(userid);
    }
    
    public void addUser(User user) {
    	redisTemplate.opsForValue().set(user.getId(), user.toString());
    }
}
