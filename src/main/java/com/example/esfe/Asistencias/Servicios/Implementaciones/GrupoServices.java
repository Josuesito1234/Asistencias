package com.example.esfe.Asistencias.Servicios.Implementaciones;

import com.example.esfe.Asistencias.Entidades.Grupo;
import com.example.esfe.Asistencias.Repositorio.IGrupoRepository;
import com.example.esfe.Asistencias.Servicios.Interfaces.IGrupoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoServices implements IGrupoServices {

    @Autowired
    private IGrupoRepository grupoRepository;

    @Override
    public Page<Grupo> BuscarTodosPaginados(Pageable pageable) {
        return grupoRepository.findAll(pageable);
    }

    @Override
    public List<Grupo> ObtenerTodos() {
        return grupoRepository.findAll();
    }

    @Override
    public Grupo Crear(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public Optional<Grupo> BuscarPorId(Integer id) {
        return grupoRepository.findById(id);
    }

    @Override
    public void EliminarPorId(Integer id) {
        grupoRepository.deleteById(id);
    }
}
