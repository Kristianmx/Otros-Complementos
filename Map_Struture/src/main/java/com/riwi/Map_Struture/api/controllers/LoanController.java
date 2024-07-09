package com.riwi.Map_Struture.api.controllers;

import com.riwi.Map_Struture.api.dto.requests.LoanRequest;
import com.riwi.Map_Struture.api.dto.requests.Update.ULoanRequest;
import com.riwi.Map_Struture.api.dto.responses.LoanResponse;
import com.riwi.Map_Struture.infraestructure.abstract_services.ILoanService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "loans")
@AllArgsConstructor
public class LoanController {
    @Autowired
    private final ILoanService  loanService;

    @PostMapping
    public ResponseEntity<LoanResponse > insert(
            @Validated
            @RequestBody LoanRequest  request
    ){
        return ResponseEntity.ok(this.loanService.create(request));
    }

    @GetMapping
    public ResponseEntity<List<LoanResponse>> getAll(){
        return ResponseEntity.ok(this.loanService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<LoanResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(this.loanService.getById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.loanService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<LoanResponse> update(@PathVariable Long id,
                                               @Validated
                                               @RequestBody ULoanRequest request){
        LoanRequest loanRequest = new LoanRequest();
        loanRequest.setStatus(request.getStatus());
        loanRequest.setReturn_date(request.getReturn_date());
        return ResponseEntity.ok(this.loanService.update(id,loanRequest));
    }

    //Consulta avanzada
    @GetMapping(path = "/{user_id}/users")
    public ResponseEntity<List<LoanResponse>> getByUser(@PathVariable Long user_id){
        return ResponseEntity.ok(this.loanService.findByUserId(user_id));
    }
}
