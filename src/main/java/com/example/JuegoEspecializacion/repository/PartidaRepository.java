package com.example.JuegoEspecializacion.repository;

import com.example.JuegoEspecializacion.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartidaRepository extends JpaRepository<Partida, Integer> {
    List<Partida> findAllByAnfitrionNameAndGanadorName(String anfitrion, String ganador);

    List<Partida> findAllByAnfitrionNameAndPerdedorName(String anfitrion, String ganador);
    
    List<Partida> findAllByAnfitrionName(String anfitrion);
}
