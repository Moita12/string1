package com.senai.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.cliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}