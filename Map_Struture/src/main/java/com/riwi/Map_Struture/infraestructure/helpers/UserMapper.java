package com.riwi.Map_Struture.infraestructure.helpers;
import com.riwi.Map_Struture.api.dto.requests.UserRequest;
import com.riwi.Map_Struture.api.dto.responses.UserResponse;
import com.riwi.Map_Struture.domain.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    User UserReqToEntity(UserRequest  userReq);

    UserResponse EntityToUserResp(User  user);

    List<UserResponse> listEntitiesToUserResp(List <User> users);
}
