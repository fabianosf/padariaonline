package br.com.padaria.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.padaria.domain.Funcionario;
import br.com.padaria.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios") 
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws Exception  {		
		Funcionario obj = funcionarioService.buscar(id);	
		return ResponseEntity.ok().body(obj);
	}

}
