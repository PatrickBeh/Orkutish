package com.example.Orkutish.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserModel map(UserDTO userDTO) {
        UserModel userModel = new UserModel();
        userModel.setId(userDTO.getId());
        userModel.setName(userDTO.getName());
        userModel.setEmail(userDTO.getEmail());
        userModel.setPassword(userDTO.getPassword());
        userModel.setBio(userDTO.getBio());
        userModel.setProfileImageUrl(userDTO.getProfileImageUrl());
        userModel.setCreatedAt(userDTO.getCreatedAt());
        userModel.setUpdatedAt(userDTO.getUpdatedAt());

        return userModel;
    }

    public UserDTO map(UserModel userModel) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userModel.getId());
        userDTO.setName(userModel.getName());
        userDTO.setEmail(userModel.getEmail());
        userDTO.setPassword(userModel.getPassword());
        userDTO.setBio(userModel.getBio());
        userDTO.setProfileImageUrl(userModel.getProfileImageUrl());
        userDTO.setCreatedAt(userModel.getCreatedAt());
        userDTO.setUpdatedAt(userModel.getUpdatedAt());

        return userDTO;
    }
}
