package com.riwi.Map_Struture.domain.repositories;

import com.riwi.Map_Struture.domain.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
