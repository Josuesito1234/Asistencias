package com.example.esfe.Asistencias.Servicios.Interfaces;

import com.example.esfe.Asistencias.Entidades.DocenteGrupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IDocenteGrupoService {

    Page<DocenteGrupo> BuscarTodosPaginados(Pageable pageable);
    List<DocenteGrupo> ObtenerTodos();
    DocenteGrupo Crear(DocenteGrupo docentegrupo);
    Optional<DocenteGrupo> BuscarPorId(Integer id);
    void EliminarPorId(Integer id);
}
