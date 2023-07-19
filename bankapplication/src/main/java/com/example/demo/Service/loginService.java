package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.login;
import com.example.demo.Repo.loginRepo;
@Service
public class loginService {
	@Autowired //extends another class
	loginRepo stRepo; //reference variable
	
	public loginRepo saveDetails(login a) {
		return stRepo.save(a);
	}
	public List <login>getDetails()

{
		return stRepo.findAll();
		
}
	public Bank UpdateDetails(login e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}



