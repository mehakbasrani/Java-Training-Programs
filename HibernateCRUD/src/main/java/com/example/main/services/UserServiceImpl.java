package com.example.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.entities.User;
import com.example.main.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public boolean registerUser(User user) {
		try {
			userRepo.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
