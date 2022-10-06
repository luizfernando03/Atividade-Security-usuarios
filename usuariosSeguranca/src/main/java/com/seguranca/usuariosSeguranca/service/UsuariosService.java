package com.seguranca.usuariosSeguranca.service;

import com.seguranca.usuariosSeguranca.model.UsuariosModel;
import com.seguranca.usuariosSeguranca.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    //Criptografando a minha senha
    //Dentro dessa classe temos um método que utiliza o salt para criptografrar a senha
    private BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    public List<UsuariosModel> mostrarTodosUsuarios(){
        return usuariosRepository.findAll();
    }

    public Optional<UsuariosModel> buscarPorId(Long id){
        return usuariosRepository.findById(id);
    }

    public UsuariosModel cadastrarUsuario(UsuariosModel usuarioModel){
        //O Encode sobrescrever a senha pela senha criptografada.
        usuarioModel.setSenha(passwordEncoder().encode(usuarioModel.getSenha()));
        return usuariosRepository.save(usuarioModel);
    }

    public UsuariosModel alterarUsuario (UsuariosModel usuarioModel){
        return usuariosRepository.save(usuarioModel);
    }

    public void deletarUsuario (Long id) {
        usuariosRepository.deleteById (id);
    }

}
