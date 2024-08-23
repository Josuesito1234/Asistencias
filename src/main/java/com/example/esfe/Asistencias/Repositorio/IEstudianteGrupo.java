package com.example.esfe.Asistencias.Repositorio;

import com.example.esfe.Asistencias.Entidades.EstudianteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteGrupo extends JpaRepository<EstudianteGrupo, Integer> {
    Page<EstudianteGrupo> findByOrderByEstudianteDesc(Pageable pageable);

}
