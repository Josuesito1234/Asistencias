package com.example.esfe.Asistencias.Servicios.Interfaces;

import com.example.esfe.Asistencias.Entidades.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IGrupoServices {
    Page<Grupo> BuscarTodosPaginados(Pageable pageable);
    List<Grupo> ObtenerTodos();
    Grupo Crear(Grupo grupo);
    Optional<Grupo> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
