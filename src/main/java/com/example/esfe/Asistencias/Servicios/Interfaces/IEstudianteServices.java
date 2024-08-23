package com.example.esfe.Asistencias.Servicios.Interfaces;

import com.example.esfe.Asistencias.Entidades.Docente;
import com.example.esfe.Asistencias.Entidades.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEstudianteServices {
    Page<Estudiante> BuscarTodosPaginados(Pageable pageable);
    List<Estudiante> ObtenerTodos();
    Estudiante Crear(Estudiante estudiante);
    Optional<Estudiante> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
