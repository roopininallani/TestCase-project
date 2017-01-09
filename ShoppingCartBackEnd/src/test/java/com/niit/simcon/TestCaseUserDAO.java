package com.niit.simcon;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

import junit.framework.Assert;

public class TestCaseUserDAO {
	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User  user;
	
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	
	@BeforeClass   
	public static void init()
	{
		context = new  AnnotationConfigApplicationContext();
		context.scan("com.niit.simcon");
		context.refresh();
		
		user = (User) context.getBean("user");                      
		
		userDAO = (UserDAO) context.getBean("userDAOImpl");
		 
	}
	
	@Test
	public void getUserTestCase()
	{
		
		user = userDAO.get("niit");
		
		
		
	  Assert.assertNotNull("getUserTestCase", user);
		
	}
	
	
	@Test
	public void validateCredentials()
	{
	user=	userDAO.validate("niit", "niit");
	 Assert.assertNotNull("validateCredentials", user);
	}
	
	
	@Test
	public void inValidateCredentials()
	{
	user=	userDAO.validate("Vibhav", "Vibhav");
	 Assert.assertNull("inValidateCredentials", user);
	 
	 
	 
	}
	
	
	
	@Test
	public void getAllUsersTestCase()
	{
	 int size=	userDAO.list().size();
	 Assert.assertEquals(" length check ", 8 , size);
	 
	 
	}
	
	
	@Test
	public void saveTestCase()
	{
		user.setid("Roopini123");
		user.setname("Roopini");
	    user.setpassword("simcon");
		user.setmobile("ROLE_USER");
		
		
	 Assert.assertEquals("saveTestCase", true, 	userDAO.save(user));
		
	}
	
	
	@Test
	public void updateTestCase()
	{
		user = userDAO.get("Roopa");
		user.setname("Sandhya");
	 Assert.assertEquals("updateTestCase", true, userDAO.update(user));	
	}
}