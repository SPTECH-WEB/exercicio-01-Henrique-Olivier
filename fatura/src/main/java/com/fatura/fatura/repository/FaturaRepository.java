package com.fatura.fatura.repository;

import com.fatura.fatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Integer> {
}
