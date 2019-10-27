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
@RequestMapping(value = "/funcionarios") //endpointRest
public class FuncionarioResource {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws Exception  {
		
		Funcionario obj = funcionarioService.buscar(id);
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		
		Funcionario f1 = new Funcionario(1, "Maria Flores","maria@email.com",sdf.parse("25/10/2010 10:30"));
		f1.getTelefones().addAll(Arrays.asList("22645587","969693366"));
		
		Funcionario f2 = new Funcionario(2, "Pedro Rocha", "pedro@email.com", sdf.parse("24/12/2011 12:44"));
		f2.getTelefones().addAll(Arrays.asList("24811588","980003636"));
		
		List<Funcionario> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		*/
		
		
		return ResponseEntity.ok().body(obj);
	}

}
