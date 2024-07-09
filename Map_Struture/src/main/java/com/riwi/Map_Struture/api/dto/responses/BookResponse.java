package com.riwi.Map_Struture.api.dto.responses;
import java.util.List;

import com.riwi.Map_Struture.api.dto.responses.ToEntity.LoanToBookResp;
import com.riwi.Map_Struture.api.dto.responses.ToEntity.ReservationToBookResp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {
    private Long id;
    private String title;
    private String author;
    private int publication_year;
    private String genre;
    private String isbn;

    List<ReservationToBookResp > reservations;
    List<LoanToBookResp > loans;
}
