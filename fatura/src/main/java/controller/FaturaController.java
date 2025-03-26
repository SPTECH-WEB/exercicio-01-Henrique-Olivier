package controller;

import model.Fatura;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.FaturaService;

import java.util.List;

@RestController
@RequestMapping("/api/faturas")
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
