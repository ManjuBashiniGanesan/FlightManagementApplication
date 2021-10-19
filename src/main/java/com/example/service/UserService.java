package com.example.service;

import com.example.entities.Users;

public interface UserService {
	public abstract Users addNewUser(Users user);
	public abstract Users signIn(Users user);
	public abstract Users signOut(Users user);

}
