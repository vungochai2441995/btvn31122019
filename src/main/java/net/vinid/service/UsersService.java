package net.vinid.service;

import net.vinid.dao.UsersDAO;
import net.vinid.entity.Users;
import net.vinid.model.request.CreateUsersRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements IUsersService {
    @Autowired
    private UsersDAO usersDAO;

    public List<Users> getAllUsers() {
        List<Users> users = usersDAO.findAll();
        return users;
    }

    public int createUser(CreateUsersRequest createUsersRequest){
        Users users = usersDAO.findByUsername(createUsersRequest.getUsername());
        if (users != null){
            return 0;
        }else {
            users = new Users();
            users.setUsername(createUsersRequest.getUsername());
            users.setAddress(createUsersRequest.getAddress());
            users.setEmail(createUsersRequest.getEmail());
            usersDAO.save(users);
            return 1;
        }
    }

    public Users findUserByUsername(String u){
        return usersDAO.findByUsername(u);
    }
    public Users findUserByEmail(String e){
        return usersDAO.findByEmail(e);
    }

    public int deleteUserByUsername(String u){
        Users users = usersDAO.findByUsername(u);
        System.out.println(users);
        if(users != null){
            usersDAO.deleteById(users.getId());
            return 1;
        }else {
            return 0;
        }
    }

    public int updateUser(CreateUsersRequest createUsersRequest){
        Users users = usersDAO.findByUsername(createUsersRequest.getUsername());
        if (users == null){
            return 0;
        }else {
            users.setAddress(createUsersRequest.getAddress());
            users.setEmail(createUsersRequest.getEmail());
            usersDAO.save(users);
            return 1;
        }
    }
}
