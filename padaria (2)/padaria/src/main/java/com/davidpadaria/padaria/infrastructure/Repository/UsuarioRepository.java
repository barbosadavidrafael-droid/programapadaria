package com.davidpadaria.padaria.infrastructure.Repository;

import com.davidpadaria.padaria.Business.UsuarioService;
import com.davidpadaria.padaria.infrastructure.Entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByCpf(String cpf);
    void deleteByCpf(String cpf);
    public UsuarioService (UsuarioRepository repository){this.repository = repository};
    public void salvarUsuario (Usuario usuario);

}
