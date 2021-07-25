package com.diogo.funcionarios.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diogo.funcionarios.api.dto.FuncionarioDTO;
import com.diogo.funcionarios.service.FuncionarioService;

@CrossOrigin
@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService service; 
	
	public FuncionarioController (FuncionarioService service) {
		this.service = service;
	}
	
	@PostMapping("api/funcionarios/gravarFuncionarios")
	public FuncionarioDTO gravarFuncionario(@RequestBody FuncionarioDTO dto ) {
		return this.service.salvar(dto);
	}
	
	@PostMapping("api/funcionarios/deletarFuncionarios")
	public FuncionarioDTO deletarFuncionario(@RequestBody FuncionarioDTO dto ) {
		return this.service.deletar(dto);
	}
	
	@GetMapping("api/funcionarios/retornarFuncionarios")
	public List<FuncionarioDTO> retornarFuncionarios(){
		return this.service.retornarFuncionarios();
	}
}
