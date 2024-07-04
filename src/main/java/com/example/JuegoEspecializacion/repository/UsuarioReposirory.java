package com.example.JuegoEspecializacion.repository;

import com.example.JuegoEspecializacion.model.Usuario;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioReposirory extends JpaRepository<Usuario, Integer> {

}
