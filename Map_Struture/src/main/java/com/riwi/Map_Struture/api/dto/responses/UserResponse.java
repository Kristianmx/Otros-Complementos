package com.riwi.Map_Struture.api.dto.responses;

import com.riwi.Map_Struture.api.dto.responses.ToEntity.LoanToUserResp;
import com.riwi.Map_Struture.api.dto.responses.ToEntity.ReservationToUserResp;
import com.riwi.Map_Struture.util.enums.RoleUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private Long id;
    private String username;
    private String password;
    private String email;
    private String full_name;
    private RoleUser  role;
    private List<LoanToUserResp > loans;
    private List<ReservationToUserResp > reservations;
}
