package com.fatura.fatura.controller;

import com.fatura.fatura.model.Fatura;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fatura.fatura.service.FaturaService;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public List<Fatura> listarTodos() {
        return faturaService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Fatura> criarFatura(@RequestBody Fatura fatura) {
        Fatura novaFatura = faturaService.cadastraFatura(fatura);

        return ResponseEntity.ok(novaFatura);
    }
}
