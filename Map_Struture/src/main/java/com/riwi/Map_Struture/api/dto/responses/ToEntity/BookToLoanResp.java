package com.riwi.Map_Struture.api.dto.responses.ToEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookToLoanResp {
    private Long id;
    private String title;
    private String author;
    private int publication_year;
    private String genre;
    private String isbn;

    List<ReservationToBookResp> reservations;
}
