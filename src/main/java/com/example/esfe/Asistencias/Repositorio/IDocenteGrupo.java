package com.example.esfe.Asistencias.Repositorio;

import com.example.esfe.Asistencias.Entidades.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteGrupo  extends JpaRepository<DocenteGrupo, Integer> {
    Page<DocenteGrupo> findByOrderByDocenteDesc(Pageable pageable);
}
