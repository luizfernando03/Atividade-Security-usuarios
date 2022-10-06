package com.seguranca.usuariosSeguranca.controller;

import com.seguranca.usuariosSeguranca.model.UsuariosModel;
import com.seguranca.usuariosSeguranca.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuariosModel>> buscar() {
        return ResponseEntity.ok(usuariosService.mostrarTodosUsuarios());
    }

    @PostMapping(value = "/usuarios/create")
    public ResponseEntity<UsuariosModel> cadastrar(@RequestBody UsuariosModel usuarioModel){
        UsuariosModel usuario = usuariosService.cadastrarUsuario (usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }
}
