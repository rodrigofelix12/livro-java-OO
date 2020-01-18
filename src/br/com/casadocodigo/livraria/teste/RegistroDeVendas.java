package br.com.casadocodigo.livraria.teste;


import java.util.List;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico livroFisico = new LivroFisico(autor);
		livroFisico.setNome("Test-Driven Development");
		livroFisico.setValor(59.90);
		if (livroFisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + livroFisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(livroFisico);
		carrinhoDeCompras.adiciona(ebook);
		
		System.out.println("Total: " + carrinhoDeCompras.getTotal());
		
		List<Produto> produtos = carrinhoDeCompras.getProdutos();
		
		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}
}
