package br.com.padaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.padaria.domain.Funcionario;
import br.com.padaria.repository.FuncionarioRepository;
import br.com.padaria.service.exceptions.ObjectNotFoundException;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	public Funcionario buscar(Integer id) {
		/*
		 * //se id existe retorno o objeto,
			 //senao ele retorna a ObjectNotFoundException, a classe que fiz de erro
		 */
		Funcionario obj = funcionarioRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException
			("Objeto nao encontrado ! Id: "+ id + ", Tipo: " + Funcionario.class.getName());
		}
		return obj;
	}

}
