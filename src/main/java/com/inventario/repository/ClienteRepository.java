package com.inventario.repository;

import com.inventario.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    public List<Cliente> findClienteByNombresLike(String nombres);
}
