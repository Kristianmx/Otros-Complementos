package com.riwi.Map_Struture.infraestructure.services;

import com.riwi.Map_Struture.api.dto.requests.ReservationRequest;
import com.riwi.Map_Struture.api.dto.responses.ReservationResponse;
import com.riwi.Map_Struture.domain.entities.Book;
import com.riwi.Map_Struture.domain.entities.Reservation;
import com.riwi.Map_Struture.domain.entities.User;
import com.riwi.Map_Struture.domain.repositories.BookRepository;
import com.riwi.Map_Struture.domain.repositories.ReservationRepository;
import com.riwi.Map_Struture.domain.repositories.UserRepository;
import com.riwi.Map_Struture.infraestructure.abstract_services.IReservationService;
import com.riwi.Map_Struture.infraestructure.helpers.ReservationMapper;
import com.riwi.Map_Struture.util.exceptions.IdNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService  {

    @Autowired
    private final ReservationRepository  reservationRepository;

    @Autowired
    private final UserRepository  userRepository;

    @Autowired
    private final BookRepository  bookRepository;

    @Autowired
    private final ReservationMapper  reservationMapper;
    @Override
    public void delete(Long id) {
        this.reservationRepository.delete(this.find(id));
    }

    @Override
    public ReservationResponse  create(ReservationRequest  reservationRequest) {
        Reservation  reservation = this.reservationMapper.reservationToEntity(reservationRequest);

        //Se crea activo
        reservation.setStatus("Activo");
        //Se rectifica si hay user
        reservation.setUser(this.userRepository.findById(reservationRequest.getUser_id()).orElseThrow(()-> new IdNotFoundException("User") ));
        //Se rectifica si hay book
        reservation.setBook(this.bookRepository.findById(reservationRequest.getBook_id()).orElseThrow(()-> new IdNotFoundException("Book")));
        //Se guarda en la base de datos
        reservation = this.reservationRepository.save(reservation);
        return this.reservationMapper.entityToResponse(reservation);
    }

    @Override
    public ReservationResponse update(Long id, ReservationRequest reservationRequest) {
        //Se crea objeto
        Reservation reservation = new Reservation();
        reservation = this.find(id);
        reservation.setReservation_date(reservationRequest.getReservation_date());
        reservation.setStatus(reservationRequest.getStatus());

        return this.reservationMapper.entityToResponse(reservation);
    }

    @Override
    public List<ReservationResponse> getAll() {
        return this.reservationMapper.toListReservationResponse(this.reservationRepository.findAll());
    }

    @Override
    public ReservationResponse getById(Long id) {
        return this.reservationMapper.entityToResponse(this.find(id));
    }

    private Reservation find(Long id){
        return this.reservationRepository.findById(id).orElseThrow(()-> new IdNotFoundException("Reservation"));
    }

    @Override
    public List<ReservationResponse> findByUserId(Long user_id) {
        User  user = this.userRepository.findById(user_id).orElseThrow(() -> new IdNotFoundException("user"));
        return this.reservationMapper.toListReservationResponse(this.reservationRepository.findByUser(user));
    }

    @Override
    public List<ReservationResponse> findByBookId(Long book_id) {
        Book book = this.bookRepository.findById(book_id).orElseThrow(() -> new IdNotFoundException("book"));
        return this.reservationMapper.toListReservationResponse(this.reservationRepository.findByBook(book));
    }
}

