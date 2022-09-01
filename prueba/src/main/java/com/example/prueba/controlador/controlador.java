package com.example.prueba.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.Servicio.UsuarioServicio;
import com.example.prueba.modelo.Usuario;



@RestController
@RequestMapping("/Usuarios")
public class controlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping
    public List<Usuario> Listar(){
        return usuarioServicio.Listar();
    }
    @PostMapping
    public Usuario Insertar(@RequestBody Usuario usuario){
        return usuarioServicio.Insertar(usuario);
    }
    @DeleteMapping
    public void Borrar(@RequestBody Usuario usuario){
        usuarioServicio.Borrar(usuario);
    }
    @PutMapping
    public Usuario Actualizar(@RequestBody Usuario usuario){
        return usuarioServicio.Actualizar(usuario);
    }

}
