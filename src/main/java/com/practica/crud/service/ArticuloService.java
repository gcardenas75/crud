package com.practica.crud.service;

import com.practica.crud.models.Articulo;
import com.practica.crud.repository.IArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloService {


    @Autowired
    private IArticuloRepository iArticuloRepository;

    public List<Articulo> listarProductos(){
        return iArticuloRepository.findAll();
    }

    public Articulo crearArticulo (Articulo articulo){
        return iArticuloRepository.save(articulo);
    }

    public Articulo editarArticulo (Articulo articulo){
        return iArticuloRepository.save(articulo);
    }

    public void eliminarArticulo (Articulo articulo){
        iArticuloRepository.delete(articulo);
    }


}
