package net.vinid.service;

import net.vinid.entity.Users;
import net.vinid.model.request.CreateUsersRequest;

import java.util.List;

public interface IUsersService {
    public List<Users> getAllUsers();
    public int createUser(CreateUsersRequest createUsersRequest);
    public Users findUserByUsername(String u);
    public Users findUserByEmail(String e);
    public int deleteUserByUsername(String u);
    public int updateUser(CreateUsersRequest createUsersRequest);

}
