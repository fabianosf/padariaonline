package br.com.padaria.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.padaria.domain.Funcionario;

@RestController
@RequestMapping(value = "/funcionarios") //endpointRest
public class FuncionarioResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Funcionario> listar() throws Exception  {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		
		Funcionario f1 = new Funcionario(1, "Maria Flores","maria@email.com",sdf.parse("25/10/2010 10:30"));
		f1.getTelefones().addAll(Arrays.asList("22645587","969693366"));
		
		Funcionario f2 = new Funcionario(2, "Pedro Rocha", "pedro@email.com", sdf.parse("24/12/2011 12:44"));
		f2.getTelefones().addAll(Arrays.asList("24811588","980003636"));
		
		List<Funcionario> lista = new ArrayList<>();
		lista.add(f1);
		lista.add(f2);
		
		
		
		return lista;
	}

}
