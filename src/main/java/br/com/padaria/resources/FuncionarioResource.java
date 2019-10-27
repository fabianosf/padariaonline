package br.com.padaria.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/funcionarios") //endpointRest
public class FuncionarioResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "REST esta legal";
	}

}
