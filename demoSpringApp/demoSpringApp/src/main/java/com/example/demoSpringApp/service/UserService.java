package com.example.demoSpringApp.service;

import com.example.demoSpringApp.dto.UserDto;
import com.example.demoSpringApp.model.RegistrationRequest;
import com.example.demoSpringApp.model.User;

import java.util.List;

public interface UserService {

    boolean checkEmail(String email);

    UserDto registerUser(RegistrationRequest registrationRequest);

    UserDto getLoginUser();

    UserDto getUserById(Integer id);

    List<UserDto> getAllUsers();

    UserDto createUser(User user);

    UserDto updateUser(User user);

    void deleteUser(User user);
}
