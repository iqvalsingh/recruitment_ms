package com.ism.job.recruitment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ism.job.recruitment.entity.User;
import com.ism.job.recruitment.model.AppUserDetails;
import com.ism.job.recruitment.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findAllByEmailAndStatusIsFalse(username);

		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}

		return new AppUserDetails(user);
	}

}