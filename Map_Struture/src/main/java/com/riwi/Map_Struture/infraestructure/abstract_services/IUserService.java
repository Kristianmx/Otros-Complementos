package com.riwi.Map_Struture.infraestructure.abstract_services;

import com.riwi.Map_Struture.api.dto.requests.UserRequest;
import com.riwi.Map_Struture.api.dto.responses.UserResponse;

public interface IUserService extends CrudService<UserRequest, UserResponse,Long>{
}
