package college.pb.pbmanagementsystem.service;

import college.pb.pbmanagementsystem.model.dto.UserDto;
import college.pb.pbmanagementsystem.model.entity.User;

public interface UserService {

    User createUser(UserDto user);
    User getUserById(Long id);
    User updateUser(UserDto user);
    void deleteUserById(Long id);

}
