package com.jasdev.CrudService.user;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.jasdev.CrudService.exception.UserNotFoundException;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<User> userList = new ArrayList<User>(
            Arrays.asList(
            new User("Roshan", "male", 12),
            new User("Sita", "female", 22))
    );

    public List<User> getAllUsers() {
        return  userList;
    }

    public User getUser(String name) {
        for (User user: userList) {
            if (user.getName().toLowerCase().equals(name.toLowerCase())) {
                return user;
            }
        }
        throw new UserNotFoundException(name);
    }
    public void addNewUser(User user) {
        userList.add(user);
    }

    public void removeUser(String name) {
       User foundUser = null;
        for (User user: userList) {
            if (user.getName().toLowerCase().equals(name.toLowerCase())) {
                foundUser = user;
            }
        }
        if (foundUser != null) {
           System.out.println("service delete found user " + foundUser);
            userList.remove(foundUser);
        } else {
            throw new UserNotFoundException(name);
        }
    }

    public void throwErrorService() throws IOException {
        throw new IOException("");
    }

    public MappingJacksonValue ignoreProperty(String value) {
        SimpleFilterProvider filterProvider = new SimpleFilterProvider();
        filterProvider.addFilter("userFilter", SimpleBeanPropertyFilter.serializeAllExcept(value));
        MappingJacksonValue mapping = new MappingJacksonValue(userList);
        mapping.setFilters(filterProvider);
        return mapping;
    }

}
