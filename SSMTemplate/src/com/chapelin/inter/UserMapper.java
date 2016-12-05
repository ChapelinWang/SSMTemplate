package com.chapelin.inter;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.chapelin.model.User;

public interface UserMapper {
	public User selectUserById(int id);

	public User selectUserByName(String username);

	public void addUser(User user);

	public void deleteUser(int id);

	public void updateUser(User user);

	public List<User> selectUsers(String username);
}
