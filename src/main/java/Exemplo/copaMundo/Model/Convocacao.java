package Exemplo.copaMundo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Convocação")
public class Convocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;

    @Column(name = "data_convocacao", nullable = false)
    private LocalDate dataConvocacao;

    private Integer quantidade;

    @ManyToOne(fetch = FetchType.EAGER)
    private  Selecao selecao;

}
