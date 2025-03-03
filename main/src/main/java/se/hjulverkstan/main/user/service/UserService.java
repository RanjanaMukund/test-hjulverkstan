package se.hjulverkstan.main.user.service;


import se.hjulverkstan.main.user.dto.request.SignupRequest;
import se.hjulverkstan.main.user.dto.response.GetAllUserDto;
import se.hjulverkstan.main.user.dto.response.UserResponse;

public interface UserService {

    UserResponse createUser(SignupRequest signUpRequest);

    GetAllUserDto getAllUsers();

    UserResponse getUserById(Long id);

    UserResponse updateUser(Long id, SignupRequest userDetail);

    UserResponse deleteUser(Long id);
}
