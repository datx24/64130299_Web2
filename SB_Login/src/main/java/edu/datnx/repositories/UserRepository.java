package edu.datnx.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.datnx.models.User;

@Repository
public class UserRepository {
	private List<User> users = new ArrayList<>();

	public UserRepository() {
		users.add(new User("64130299","Datnx123@","Nguyễn Xuân Đạt",2004,"Nam"));
		users.add(new User("63130300", "User123@", "Trần Văn An", 2003, "Nam"));
		users.add(new User("65130301", "Test456@", "Lê Thị Trang", 2005, "Nữ"));
		users.add(new User("62130302", "Admin789@", "Phạm Văn Cường", 2002, "Nam"));
		users.add(new User("61130303", "Demo000@", "Hoàng Thị Dung", 2001, "Nữ"));
	}
	
	//Lấy danh sách toàn bộ người dùng
	public List<User> getAllUsers() {
		return users;
	}
	
	//Tìm người dùng theo id
	public User findUserById(String id) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
	}
	
}
