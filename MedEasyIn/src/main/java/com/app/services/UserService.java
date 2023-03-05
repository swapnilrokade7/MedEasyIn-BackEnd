package com.app.services;

import java.util.List;

import javax.validation.Valid;

import com.app.dto.UsersDTO;
import com.app.entities.Users;

public interface UserService {
	UsersDTO addUserDetails(UsersDTO user);

	String deleteUserDetails(Long userId);

	Users updateUserDetails(@Valid UsersDTO user);

	List<Users> getAllUsers();
	

}
