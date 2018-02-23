package org.jcol.web;

import javax.ws.rs.core.Response;

import org.jcol.collection.User;
import org.jcol.rep.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class JCollectionController {

	@Autowired
	UserManager userManaer;
	
    @RequestMapping(value="/index", method=RequestMethod.GET)  
    public Object index()  
    {  
    	return "helloworld";
    }
    
    @RequestMapping(value="/register/{id}", method=RequestMethod.GET)  
    public Response register(@PathVariable("id") String id)  
    {  
    	User user = User.builder().id(id).userName("jassen").build();
    	userManaer.addUser(user);
    	System.out.println("add success!");
    	return Response.ok().build();
    }
    
    @RequestMapping(value="/users/{id}", method=RequestMethod.GET)  
    public Object findUser(@PathVariable("id") String id)  
    {  
    	return userManaer.findUser(id);
    }
}

