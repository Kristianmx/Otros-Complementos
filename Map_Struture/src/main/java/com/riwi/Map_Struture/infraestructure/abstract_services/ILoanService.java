package com.riwi.Map_Struture.infraestructure.abstract_services;

import com.riwi.Map_Struture.api.dto.requests.LoanRequest;
import com.riwi.Map_Struture.api.dto.responses.LoanResponse;

import java.util.List;

public interface ILoanService extends CrudService<LoanRequest, LoanResponse,Long>{
    List<LoanResponse> findByUserId(Long user_id);
}
