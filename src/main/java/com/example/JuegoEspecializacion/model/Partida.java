package com.example.JuegoEspecializacion.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "partidas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn (name = "anfitrion", nullable = false)
    private Usuario anfitrion;


    @ManyToOne
    @JoinColumn (name = "ganador", nullable = false)
    private Usuario ganador;

    @ManyToOne
    @JoinColumn (name = "perdedor", nullable = false)
    private Usuario perdedor;

}
