package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Produto;

public class TesteCapituloOnze {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Rodrigo Turini");
		nomes.add("Adriano Almeida");
		nomes.add("Paulo Silveira");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
	}
}
