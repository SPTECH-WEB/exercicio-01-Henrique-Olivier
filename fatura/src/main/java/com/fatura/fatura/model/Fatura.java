package com.fatura.fatura.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Fatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartao é obrigatório")
    @Pattern(regexp = "\\d{16}", message = "O número do cartão deve conter 16 dígitos")
    private String numeroCartao;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor é obrigatório")
    @DecimalMax(value = "5000", message = "O valor máximo é 5.000")
    @DecimalMin(value = "10", message = "O valor mínimo é 10")
    private double valor;

    @NotNull(message = "A data é obrigatória")
    @FutureOrPresent(message = "A data de vencimento deve ser a data atual ou futura")
    private LocalDate dataPagamento;

    @NotNull(message = "O email é obrigatório")
    @Email(message = "O email deve ser válido")
    private String emailContato;


}
