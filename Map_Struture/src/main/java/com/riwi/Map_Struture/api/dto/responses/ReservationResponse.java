package com.riwi.Map_Struture.api.dto.responses;

import com.riwi.Map_Struture.api.dto.responses.ToEntity.BookToReservationResp;
import com.riwi.Map_Struture.api.dto.responses.ToEntity.UserBasicResp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationResponse {
    private LocalDateTime reservation_date;
    private String status;

    private UserBasicResp  user;
    private BookToReservationResp book;
}
