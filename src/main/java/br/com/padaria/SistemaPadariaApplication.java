package br.com.padaria;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.padaria.domain.Funcionario;
import br.com.padaria.domain.ItemPedido;
import br.com.padaria.domain.Produto;
import br.com.padaria.repository.FuncionarioRepository;
import br.com.padaria.repository.ItemPedidoRepository;
import br.com.padaria.repository.ProdutoRepository;

@SpringBootApplication
public class SistemaPadariaApplication implements CommandLineRunner{

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	
	
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
		
		
		//MANYTOMANY RELACIONAMENTO
		ItemPedido item1 = new ItemPedido(null, 10, 8.00F);
		ItemPedido item2 = new ItemPedido(null, 15, 15.00F);
		ItemPedido item3 = new ItemPedido(null, 10, 12.00F);

		
		
		Produto p1 = new Produto(null, "Farinha",5.00F, 100);
		Produto p2 = new Produto(null, "Leite HP",10.00F, 50);
		Produto p3 = new Produto(null, "Queijo", 10.00F, 45);
		
		//itemX tem uma associacao com produtoX
		item1.getProdutos().add(p1);
		item2.getProdutos().add(p2);
		item3.getProdutos().add(p3);
		
		//produtoX tem uma associacao com itemX
		p1.getItensPedido().add(item1);
		p2.getItensPedido().add(item2);
		p3.getItensPedido().add(item3);
		
		//salvando dados no banco H2
		itemPedidoRepository.save(Arrays.asList(item1, item2, item3));
		produtoRepository.save(Arrays.asList(p1, p2, p3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
