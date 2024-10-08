package com.example.esfe.Asistencias.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre de usuario es requerido")
    private String login;

    @NotBlank(message = "La contraseña es requerida")
    private String clave;

    private int status;

    //Establece una relacion muchos a muchos entre la entidad Usuario y la entidad Rol.
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "usuario_rol",
          joinColumns = @JoinColumn(name = "usuario_id"),
          inverseJoinColumns = @JoinColumn(name = "rol_id")
    )
    private List<Rol> roles;
}
