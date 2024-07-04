package com.example.JuegoEspecializacion.model;


import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    @Column
    private String pasword;

    @OneToMany(mappedBy = "anfitrion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Partida> partidasHosteadas;

    @OneToMany(mappedBy = "ganador", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Partida> partidasGanadas;

    @OneToMany(mappedBy = "perdedor", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Partida> partidasPerdidas;






}
