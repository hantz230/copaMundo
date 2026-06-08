package Exemplo.copaMundo.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Selecao")
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;
    private String nome;
    private String grupo;
    private String fase;

    @Min(value = 0, message = "Quantidade não pode ser negativa")
    @Column(nullable = false)
    private Integer gols_marcados;

    @Min(value = 0, message = "Quantidade não pode ser negativa")
    @Column(nullable = false)
    private Integer gols_sofridos;

    @DecimalMin(value = "0.01", message = "Valor de Plantel deve ser maior que zero")
    @Column(name = "valor_plantel", nullable = false, precision = 10, scale = 2)
    private BigDecimal valor_plantel;








}
