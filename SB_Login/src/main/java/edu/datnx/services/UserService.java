package edu.datnx.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.datnx.models.User;
import edu.datnx.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	//Phương thức xác thực người dùng trước khi đăng nhập
	public User authenticate(String id, String password) {
		User user = userRepository.findUserById(id);
		if(user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
}
