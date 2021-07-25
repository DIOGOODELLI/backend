package com.diogo.funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diogo.funcionarios.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{}
