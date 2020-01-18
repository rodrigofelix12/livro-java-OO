package br.com.casadocodigo.livraria.teste;


import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private ArrayList<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	
	public void adiciona(Produto produto) {
		System.out.println("Adicionando: " + produto);
		this.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getTotal() {
		return total;
	}
	
}
