package com.riwi.Map_Struture.api.controllers;

import com.riwi.Map_Struture.api.dto.requests.ReservationRequest;
import com.riwi.Map_Struture.api.dto.requests.Update.UReservationRequest;
import com.riwi.Map_Struture.api.dto.responses.ReservationResponse;
import com.riwi.Map_Struture.infraestructure.abstract_services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reservations")
@AllArgsConstructor
public class ReservationController {
    @Autowired
    private final IReservationService  reservationService;

    @PostMapping
    public ResponseEntity<ReservationResponse > insert(
            @Validated
            @RequestBody ReservationRequest request
    ){
        ReservationRequest reservationRequest = ReservationRequest.builder()
                .user_id(request.getUser_id())
                .book_id(request.getBook_id())
                .reservation_date(request.getReservation_date())
                .build();
        return ResponseEntity.ok(this.reservationService.create(reservationRequest));
    }

    @GetMapping
    public ResponseEntity<List<ReservationResponse>> getAll(){
        return ResponseEntity.ok(this.reservationService.getAll());
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(this.reservationService.getById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.reservationService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ReservationResponse> update(@PathVariable Long id,
                                                      @Validated
                                                      @RequestBody UReservationRequest request){
        ReservationRequest reservationRequest = ReservationRequest.builder()
                .status(request.getStatus())
                .reservation_date(request.getReservation_date())
                .build();
        return ResponseEntity.ok(this.reservationService.update(id,reservationRequest));
    }

    //Consulta avanzada
    @GetMapping(path = "/{user_id}/users")
    public ResponseEntity<List<ReservationResponse>> getByUser(@PathVariable Long user_id){
        return ResponseEntity.ok(this.reservationService.findByUserId(user_id));
    }

    @GetMapping(path = "/{book_id}/books")
    public ResponseEntity<List<ReservationResponse>> getByBook(@PathVariable Long book_id){
        return ResponseEntity.ok(this.reservationService.findByUserId(book_id));
    }

}
