package com.practica.crud.rest;


import com.practica.crud.models.Articulo;
import com.practica.crud.models.Cliente;
import com.practica.crud.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("cliente")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public List <Cliente> list(){
        return clienteService.listarCliente();
    }

    @PostMapping
    public Cliente crearC(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping
    public Cliente editarC (@RequestBody Cliente cliente){
        return clienteService.editarCliente(cliente);
    }

    @DeleteMapping
    public void eliminarC (@RequestBody Cliente cliente){
        clienteService.eliminarCliente(cliente);
    }


}
