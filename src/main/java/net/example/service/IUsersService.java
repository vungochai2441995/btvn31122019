package net.example.service;

import net.example.entity.Users;
import net.example.model.request.CreateUsersRequest;

import java.util.List;

public interface IUsersService {
    public List<Users> getAllUsers();
    public int createUser(CreateUsersRequest createUsersRequest);
    public Users findUserByUsername(String u);
    public Users findUserByEmail(String e);
    public int deleteUserByUsername(String u);
    public int updateUser(CreateUsersRequest createUsersRequest);

}