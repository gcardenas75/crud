package com.practica.crud.service;

import com.practica.crud.models.Cliente;
import com.practica.crud.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository iClienteRepository;

    public List<Cliente> listarCliente(){
        return iClienteRepository.findAll();
    }

    public Cliente guardarCliente (Cliente cliente){
        return iClienteRepository.save(cliente);
    }

    public Cliente editarCliente (Cliente cliente){
        return iClienteRepository.save(cliente);
    }

    public void eliminarCliente (Cliente cliente){
        iClienteRepository.delete(cliente);
    }



}
