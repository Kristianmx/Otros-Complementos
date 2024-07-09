package com.riwi.Map_Struture.domain.repositories;

import com.riwi.Map_Struture.domain.entities.Loan;
import com.riwi.Map_Struture.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long> {
    List<Loan> findByUser(User user);
}
