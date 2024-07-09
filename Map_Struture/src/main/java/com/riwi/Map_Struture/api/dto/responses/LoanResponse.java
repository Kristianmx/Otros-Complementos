package com.riwi.Map_Struture.api.dto.responses;
import com.riwi.Map_Struture.api.dto.responses.ToEntity.BookToLoanResp;
import com.riwi.Map_Struture.api.dto.responses.ToEntity.UserBasicResp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanResponse {
    private Long id;
    private LocalDateTime loan_date;
    private LocalDateTime return_date;
    private String status;
    private UserBasicResp  user;
    private BookToLoanResp  book;
}
