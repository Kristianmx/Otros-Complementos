package com.riwi.Map_Struture.api.dto.responses.ToEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservationToBookResp {
    private Long id;
    private LocalDateTime reservation_date;
    private String status;

    //Relaciones
    private UserBasicResp user;

}
