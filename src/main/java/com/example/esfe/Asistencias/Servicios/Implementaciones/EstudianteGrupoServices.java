package com.example.esfe.Asistencias.Servicios.Implementaciones;


import com.example.esfe.Asistencias.Entidades.EstudianteGrupo;
import com.example.esfe.Asistencias.Repositorio.IEstudianteGrupo;
import com.example.esfe.Asistencias.Servicios.Interfaces.IEstudianteGrupoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteGrupoServices implements IEstudianteGrupoServices {
    @Autowired
    private IEstudianteGrupo estudianteGrupo;

    @Override
    public Page<EstudianteGrupo> BuscarTodosPaginados(Pageable pageable) {
        return estudianteGrupo.findByOrderByEstudianteDesc(pageable);
    }

    @Override
    public List<EstudianteGrupo> ObtenerTodos() {
        return estudianteGrupo.findAll();
    }

    @Override
    public EstudianteGrupo Crear(EstudianteGrupo estudiantesGrupo) {
        return estudianteGrupo.save(estudiantesGrupo);
    }

    @Override
    public Optional<EstudianteGrupo> BuscarPorId(Integer id) {
        return estudianteGrupo.findById(id);
    }

    @Override
    public void EliminarPorId(Integer id) {
        estudianteGrupo.deleteById(id);
    }
}
