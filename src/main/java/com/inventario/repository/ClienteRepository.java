package com.inventario.repository;

import com.inventario.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
