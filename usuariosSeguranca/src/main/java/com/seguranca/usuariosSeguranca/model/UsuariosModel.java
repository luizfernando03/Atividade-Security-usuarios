package com.seguranca.usuariosSeguranca.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int idade;

    @Column(length = 11, nullable = false)
    private String telefone;

    @Column(length = 15, nullable = false)
    private String login;

    @Column(length = 20, nullable = false)
    private String senha;

}
