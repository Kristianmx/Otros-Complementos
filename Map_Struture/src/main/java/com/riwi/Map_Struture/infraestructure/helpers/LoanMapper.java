package com.riwi.Map_Struture.infraestructure.helpers;
import com.riwi.Map_Struture.api.dto.requests.LoanRequest;
import com.riwi.Map_Struture.api.dto.responses.LoanResponse;
import com.riwi.Map_Struture.domain.entities.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoanMapper {

    Loan loanReqToEntity(LoanRequest  loanReq);

    LoanResponse entityToLoanResp(Loan loan);

    List<LoanResponse> toListLoanResp(List<Loan> loans);
}
