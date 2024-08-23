package com.example.esfe.Asistencias.Servicios.Implementaciones;

import com.example.esfe.Asistencias.Entidades.Estudiante;
import com.example.esfe.Asistencias.Repositorio.IEstudianteRepository;
import com.example.esfe.Asistencias.Servicios.Interfaces.IEstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServices implements IEstudianteServices{
    @Autowired
    private IEstudianteRepository estudianteRepository;

    @Override
    public Page<Estudiante> BuscarTodosPaginados(Pageable pageable) {
        return estudianteRepository.findAll(pageable);
    }

    @Override
    public List<Estudiante> ObtenerTodos() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante Crear(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Optional<Estudiante> BuscarPorId(Integer id) {
        return estudianteRepository.findById(id);
    }

    @Override
    public void EliminarPorId(Integer id) {
        estudianteRepository.deleteById(id);
    }
}
