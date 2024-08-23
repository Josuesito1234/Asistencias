package com.example.esfe.Asistencias.Repositorio;

import com.example.esfe.Asistencias.Entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
