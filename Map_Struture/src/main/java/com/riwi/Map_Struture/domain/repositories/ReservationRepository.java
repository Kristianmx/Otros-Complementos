package com.riwi.Map_Struture.domain.repositories;

import com.riwi.Map_Struture.domain.entities.Book;
import com.riwi.Map_Struture.domain.entities.Reservation;
import com.riwi.Map_Struture.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    List<Reservation> findByUser(User user);
    List<Reservation> findByBook(Book book);
}
