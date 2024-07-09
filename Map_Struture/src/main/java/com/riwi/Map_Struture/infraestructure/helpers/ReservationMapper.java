package com.riwi.Map_Struture.infraestructure.helpers;

import com.riwi.Map_Struture.api.dto.requests.ReservationRequest;
import com.riwi.Map_Struture.api.dto.responses.ReservationResponse;
import com.riwi.Map_Struture.domain.entities.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ReservationMapper {
    Reservation reservationToEntity(ReservationRequest reservationRequest);

    ReservationResponse entityToResponse(Reservation reservation);

    List<ReservationResponse> toListReservationResponse(List<Reservation> reservations);
}
