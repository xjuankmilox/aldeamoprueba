package com.example.prueba.Servicio;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.prueba.modelo.Usuario;
import com.example.prueba.repositorio.Repositorio;

@Service
public class UsuarioServicio{

    @Autowired
    private Repositorio repositorio;

    public List<Usuario> Listar(){
        return repositorio.findAll();
    }
    public Usuario Insertar(Usuario usuario){
        return repositorio.save(usuario);
    }
    public void Borrar(Usuario usuario){
        repositorio.delete(usuario);
    }
    public Usuario Actualizar(Usuario usuario){
        return repositorio.save(usuario);
    }
}
