package com.diogo.funcionarios.api.converter;

import java.util.List;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.diogo.funcionarios.api.dto.FuncionarioDTO;
import com.diogo.funcionarios.model.Funcionario;
import com.diogo.funcionarios.model.ModelMapperConverter;
import java.util.stream.Collectors;

@Component
public class FuncionarioConverter {
	
	@Autowired
	private ModelMapperConverter converter;

	public Funcionario convertFuncionarioDTOtoFuncionario(FuncionarioDTO funcionarioDTO) {
		return new ModelMapper().map(funcionarioDTO, Funcionario.class);
	}
	
	public FuncionarioDTO convertUsuarioToUsuarioDTO(Funcionario funcionario) {
		return new ModelMapper().map(funcionario, FuncionarioDTO.class);
	}
	
	public List<FuncionarioDTO> convertListUsuarioToListUsuarioDTO(List<Funcionario> listaFuncionario) {
		List<FuncionarioDTO> lista = listaFuncionario.stream().map(new Function<Funcionario, FuncionarioDTO>() {
			@Override
			public FuncionarioDTO apply(Funcionario funcionario) {
				FuncionarioDTO dto = FuncionarioConverter.this.converter.converter(funcionario, FuncionarioDTO.class);
				return dto;
			}
		}).collect(Collectors.toList());
		return lista;
	}
	
	
	
	
}
