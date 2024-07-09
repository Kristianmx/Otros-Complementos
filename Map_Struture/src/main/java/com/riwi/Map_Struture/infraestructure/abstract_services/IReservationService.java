package com.riwi.Map_Struture.infraestructure.abstract_services;

import com.riwi.Map_Struture.api.dto.requests.ReservationRequest;
import com.riwi.Map_Struture.api.dto.responses.ReservationResponse;

import java.util.List;

public interface IReservationService extends CrudService<ReservationRequest, ReservationResponse, Long> {
    List<ReservationResponse> findByUserId(Long user_id);

    List<ReservationResponse> findByBookId(Long book_id);
}
