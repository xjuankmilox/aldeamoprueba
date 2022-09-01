package com.example.prueba.repositorio;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.prueba.modelo.Usuario;

@Repository
public interface Repositorio extends JpaRepository<Usuario,Integer>{

    
}

