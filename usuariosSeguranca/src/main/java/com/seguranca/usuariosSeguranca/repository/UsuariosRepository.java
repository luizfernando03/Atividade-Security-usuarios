package com.seguranca.usuariosSeguranca.repository;

import com.seguranca.usuariosSeguranca.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long> {

}
