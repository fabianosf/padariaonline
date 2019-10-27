package br.com.padaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.padaria.domain.Funcionario;
import br.com.padaria.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	public Funcionario buscar(Integer id) {
		Funcionario obj = funcionarioRepository.findOne(id);
		return obj;
	}

}
