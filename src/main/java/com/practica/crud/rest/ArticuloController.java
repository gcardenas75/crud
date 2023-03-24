package com.practica.crud.rest;

import com.practica.crud.models.Articulo;
import com.practica.crud.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("articulo")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;


    @GetMapping
    public List<Articulo> listArt (){
        return articuloService.listarProductos();
    }

    @PostMapping
    public Articulo crearArt (@RequestBody Articulo articulo){
        return articuloService.crearArticulo(articulo);
    }

    @PutMapping
    public Articulo editarArt (@RequestBody Articulo articulo){
        return articuloService.editarArticulo(articulo);
    }

    @DeleteMapping
    public void eliminarArt (@RequestBody Articulo articulo){
        articuloService.eliminarArticulo(articulo);
    }


}
