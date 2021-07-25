package com.diogo.funcionarios.service;

import java.util.List;

import com.diogo.funcionarios.api.dto.FuncionarioDTO;

public interface FuncionarioService {
	public FuncionarioDTO salvar (FuncionarioDTO funcionarioDTO);
	
	public FuncionarioDTO deletar (FuncionarioDTO funcionarioDTO);
	
	public List<FuncionarioDTO> retornarFuncionarios();
	
}
