package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.model.Salaire;

public interface SalaireRepository extends JpaRepository<Salaire, Long> {

}
