package com.example.esfe.Asistencias.Servicios.Implementaciones;

import com.example.esfe.Asistencias.Entidades.DocenteGrupo;
import com.example.esfe.Asistencias.Repositorio.IDocenteGrupo;
import com.example.esfe.Asistencias.Servicios.Interfaces.IDocenteGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteGrupoService implements IDocenteGrupoService {

    @Autowired
    private IDocenteGrupo docenteGrupo;

    @Override
    public Page<DocenteGrupo> BuscarTodosPaginados(Pageable pageable) {
        return docenteGrupo.findByOrderByDocenteDesc(pageable);
    }

    @Override
    public List<DocenteGrupo> ObtenerTodos() {
        return docenteGrupo.findAll();
    }

    @Override
    public DocenteGrupo Crear(DocenteGrupo docentegrupo) {
        return docenteGrupo.save(docentegrupo);
    }

    @Override
    public Optional<DocenteGrupo> BuscarPorId(Integer id) {
        return docenteGrupo.findById(id);
    }

    @Override
    public void EliminarPorId(Integer id) {
       docenteGrupo.deleteById(id);
    }
}
