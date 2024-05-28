package com.springBootJPASec10.Service.impl;

import org.springframework.stereotype.Service;

import com.springBootJPASec10.Enitity.User;
import com.springBootJPASec10.Repository.UserRepository;
import com.springBootJPASec10.Service.UserService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	@Override
	public User createUser(User user) {
		
		return userRepository.save(user);
	}

}
