package com.auction.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auction.entity.UserEntity;
import com.auction.repository.IUserRepository;
import com.auction.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public List<UserEntity> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}