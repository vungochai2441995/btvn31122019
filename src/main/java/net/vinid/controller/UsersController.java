package net.vinid.controller;

import net.vinid.entity.Users;
import net.vinid.model.request.CreateUsersRequest;
import net.vinid.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService usersService;

    @GetMapping("")
    public List<Users> test(){
        return usersService.getAllUsers();
    }

    @PostMapping("")
    public int createUser(@RequestBody @Valid CreateUsersRequest createUserRequest) {
        int result = usersService.createUser(createUserRequest);
        return result;
    }

    @PutMapping("")
    public int updateUser(@RequestBody @Valid CreateUsersRequest createUserRequest) {
        int result = usersService.updateUser(createUserRequest);
        return result;
    }

    @GetMapping("/username")
    public Users findUsersByUsername(@RequestParam(value = "key",required = true) String key){
        Users users = usersService.findUserByUsername(key);
        return users;
    }

    @GetMapping("/email")
    public Users findUsersEmail(@RequestParam(value = "key",required = true) String key){
        Users users = usersService.findUserByEmail(key);
        return users;
    }


    @DeleteMapping("")
    public int deleteUsername(@RequestParam(value = "key",required = true) String key){
        return usersService.deleteUserByUsername(key);
    }
}
