package com.inventario.service;

import com.inventario.modelo.Cliente;
import com.inventario.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clRepo;
    public List<Cliente> listar(){
        return clRepo.findAll();

    }

    public Cliente crear(Cliente cliente){
        return clRepo.save(cliente);
    }

    public void eliminar(Long idCliente){
        clRepo.deleteById(idCliente);
    }

    public Cliente buscarClienteId(Long idCliente){

          return clRepo.findById(idCliente).get();

    }

    public List<Cliente> buscarNombres(String nombres){
        return clRepo.findClienteByNombresLike("%"+nombres+"%");
    }

}
