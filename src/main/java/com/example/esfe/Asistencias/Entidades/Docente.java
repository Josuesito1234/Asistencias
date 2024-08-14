package com.example.esfe.Asistencias.Entidades;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "docentes")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ingrese el nombre del docente" )
    private String nombre;
    @Nullable
    private String apellido;
    @Nullable
    private String email;
    @Nullable
    private Integer telefono;
    @Nullable
    private String escuela;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "Ingrese el nombre del grupo") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "Ingrese el nombre del grupo") String nombre) {
        this.nombre = nombre;
    }

    @Nullable
    public String getApellido() {
        return apellido;
    }

    public void setApellido(@Nullable String apellido) {
        this.apellido = apellido;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(@Nullable Integer telefono) {
        this.telefono = telefono;
    }

    @Nullable
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(@Nullable String escuela) {
        this.escuela = escuela;
    }
}
