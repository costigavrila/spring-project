package com.test.springproject.service;

import com.test.springproject.common.UserDTO;
import com.test.springproject.model.User;
import com.test.springproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    public  UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers(){
        List<UserDTO> userDTOList = new ArrayList<>();
        List<User> users = userRepository.findAll();
        users.forEach(user->{
            UserDTO userDTO = new UserDTO();
            userDTO.firstName = user.name;
            userDTO.lastName = user.surname;
            userDTOList.add(userDTO);
        });
        return  userDTOList;
    }
}
