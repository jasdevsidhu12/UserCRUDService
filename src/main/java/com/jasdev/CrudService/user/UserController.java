package com.jasdev.CrudService.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(path = "users")
    public List<User> getAllUsers() {
         return userService.getAllUsers();
    }

    @GetMapping(path = "users/{name}")
    public User getUser(@PathVariable String name) {
         return userService.getUser(name);
    }

    @PostMapping(path = "users")
    public void addNewUser(@Valid @RequestBody User user) {
         userService.addNewUser(user);
    }
    @DeleteMapping(path = "users/{name}")
    public void removeUser(@PathVariable String name) {
        userService.removeUser(name);
    }
    @GetMapping(path="/throwerror")
    public void throwError() throws IOException {
        userService.throwErrorService();
    }
    @GetMapping(path="users/ignore/{value}")
    public MappingJacksonValue getIgnoreUserPropertyResponse(@PathVariable String value) {
        return userService.ignoreProperty(value);
    }
}
