package Exemplo.copaMundo.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Partida")

public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Long id;

    @Column(name = "data_partida", nullable = false)
    private LocalDate dataPartida;

    private Integer quantidade;

    @ManyToOne(fetch = FetchType.EAGER)
    private  Selecao selecao;
}
