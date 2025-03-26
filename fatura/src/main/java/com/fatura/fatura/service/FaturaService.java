package com.fatura.fatura.service;

import com.fatura.fatura.model.Fatura;
import org.springframework.stereotype.Service;
import com.fatura.fatura.repository.FaturaRepository;

import java.util.List;

@Service
public class FaturaService {

    private FaturaRepository faturaRepository;
    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<Fatura> listarTodos() {
        return faturaRepository.findAll();
    }

    public Fatura cadastraFatura(Fatura fatura) {
        return faturaRepository.save(fatura);
    }
}
