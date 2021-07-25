package com.diogo.funcionarios.service.impl;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diogo.funcionarios.api.converter.FuncionarioConverter;
import com.diogo.funcionarios.api.dto.FuncionarioDTO;
import com.diogo.funcionarios.model.Funcionario;
import com.diogo.funcionarios.repository.FuncionarioRepository;
import com.diogo.funcionarios.service.FuncionarioService;

@Service
public class FuncionarioImp implements FuncionarioService {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioConverter converter;
	
	public FuncionarioImp(FuncionarioRepository funcionarioRepository) {
		super();
		this.funcionarioRepository = funcionarioRepository;
	}

	@Override
	@Transactional
	public FuncionarioDTO salvar(FuncionarioDTO funcionarioDTO) {
		Funcionario funcionario = this.converter.convertFuncionarioDTOtoFuncionario(funcionarioDTO);
		try {
			this.funcionarioRepository.save(funcionario);
		} catch (Exception e) {}
		
		return funcionarioDTO;
	}

	@Override
	public FuncionarioDTO deletar(FuncionarioDTO funcionarioDTO) {
		Funcionario funcionario = this.converter.convertFuncionarioDTOtoFuncionario(funcionarioDTO);
		this.funcionarioRepository.delete(funcionario);
		return funcionarioDTO;
	}

	@Override
	public List<FuncionarioDTO> retornarFuncionarios() {
		List<FuncionarioDTO> listaUsuarios = this.converter.convertListUsuarioToListUsuarioDTO(this.funcionarioRepository.findAll()) ;
		if (Objects.nonNull(listaUsuarios)) {
			return listaUsuarios;
		}
		return null;
	}
	
	
	
	
	
	
	
	


	

}
