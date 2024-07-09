package com.riwi.Map_Struture.infraestructure.services;

import com.riwi.Map_Struture.api.dto.requests.UserRequest;
import com.riwi.Map_Struture.api.dto.responses.UserResponse;
import com.riwi.Map_Struture.domain.entities.User;
import com.riwi.Map_Struture.domain.repositories.UserRepository;
import com.riwi.Map_Struture.infraestructure.abstract_services.IUserService;
import com.riwi.Map_Struture.infraestructure.helpers.UserMapper;
import com.riwi.Map_Struture.util.exceptions.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService  implements IUserService {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserMapper userMapper;
    @Override
    public void delete(Long aLong) {
        this.userRepository.delete(this.find(aLong));
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
    User user = this.userMapper.UserReqToEntity(userRequest);

    user.setReservations(new ArrayList<>());
    user.setLoans(new ArrayList<>());

    return this.userMapper.EntityToUserResp(this.userRepository.save(user));

    }

    @Override
    public UserResponse update(Long aLong, UserRequest userRequest) {
        User user = this.find(aLong);
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setEmail(userRequest.getEmail());
        user.setFull_name(userRequest.getFull_name());
        return this.userMapper.EntityToUserResp(this.userRepository.save(user));
    }

    @Override
    public List<UserResponse> getAll() {
        return this.userMapper.listEntitiesToUserResp(this.userRepository.findAll());
    }

    @Override
    public UserResponse getById(Long aLong) {
        return this.userMapper.EntityToUserResp(this.find(aLong));
    }
    private User find(Long id){
        return this.userRepository.findById(id).orElseThrow(()->new IdNotFoundException("User"));
    }
}
