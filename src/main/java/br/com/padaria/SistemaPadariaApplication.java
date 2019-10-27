package br.com.padaria;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.padaria.domain.Funcionario;
import br.com.padaria.repository.FuncionarioRepository;

@SpringBootApplication
public class SistemaPadariaApplication implements CommandLineRunner{

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SistemaPadariaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		Funcionario f1 = new Funcionario(1, "Maria Flores","maria@email.com",sdf.parse("25/10/2010 10:30"));
		f1.getTelefones().addAll(Arrays.asList("22645587","969693366"));
		
		Funcionario f2 = new Funcionario(2, "Pedro Rocha", "pedro@email.com", sdf.parse("24/12/2011 12:44"));
		f2.getTelefones().addAll(Arrays.asList("24811588","980003636"));
		
		funcionarioRepository.save(Arrays.asList(f1, f2)); 
		
		 
		
	}

}
