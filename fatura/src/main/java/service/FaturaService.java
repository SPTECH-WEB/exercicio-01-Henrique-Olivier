package service;

import model.Fatura;
import org.springframework.stereotype.Service;
import repository.FaturaRepository;

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
