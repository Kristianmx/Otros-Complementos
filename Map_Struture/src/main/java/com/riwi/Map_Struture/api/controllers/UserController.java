package com.riwi.Map_Struture.api.controllers;

import com.riwi.Map_Struture.api.dto.requests.UserRequest;
import com.riwi.Map_Struture.api.dto.responses.UserResponse;
import com.riwi.Map_Struture.infraestructure.abstract_services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "users")
@AllArgsConstructor
public class UserController {
    @Autowired
    private final IUserService  userService;

    @PostMapping
    public ResponseEntity<UserResponse> insert(
            @Validated
            @RequestBody UserRequest request){
        return ResponseEntity.ok(this.userService.create(request));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAll(){
        return ResponseEntity.ok(this.userService.getAll());
    }

    @GetMapping(path ="/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(this.userService.getById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable Long id,
                                               @Validated
                                               @RequestBody UserRequest request){
        return  ResponseEntity.ok(this.userService.update(id, request));
    }
}
