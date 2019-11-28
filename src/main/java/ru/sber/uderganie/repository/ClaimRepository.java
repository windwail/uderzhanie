package ru.sber.uderganie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sber.uderganie.model.Claim;
import ru.sber.uderganie.model.Employee;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, Long> {

}
