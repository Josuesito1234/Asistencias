package com.example.esfe.Asistencias.Servicios.Interfaces;

import com.example.esfe.Asistencias.Entidades.EstudianteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEstudianteGrupoServices {
    Page<EstudianteGrupo> BuscarTodosPaginados(Pageable pageable);
    List<EstudianteGrupo> ObtenerTodos();
    EstudianteGrupo Crear(EstudianteGrupo estudianteGrupo);
    Optional<EstudianteGrupo> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
