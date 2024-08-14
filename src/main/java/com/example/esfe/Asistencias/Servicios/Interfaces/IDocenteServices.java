package com.example.esfe.Asistencias.Servicios.Interfaces;

import com.example.esfe.Asistencias.Entidades.Docente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteServices {
    Page<Docente> BuscarTodosPaginados(Pageable pageable);
    List<Docente> ObtenerTodos();
    Docente Crear(Docente docente);
    Optional<Docente> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
