package com.diogo.funcionarios.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.diogo.funcionarios.api.dto.FuncionarioDTO;
import com.diogo.funcionarios.service.FuncionarioService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("test")
public class FuncionarioRepositoryTest {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioService service; 
	
	@Test
	public void GravarFuncionario() {
		FuncionarioDTO funcionario = new FuncionarioDTO();
		funcionario.setEmail("DIOGO@DIOGO.COM");
		funcionario.setNome("DIOGO 2");
		funcionario.setSobrenome("ODELLI");
		funcionario.setNumeroNis(10);
		service.salvar(funcionario);
	}
	
	
	@Test
	public void RetornarFuncionarios() {
		service.retornarFuncionarios();
	}

}
