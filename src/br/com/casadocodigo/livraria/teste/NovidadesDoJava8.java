package br.com.casadocodigo.livraria.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.ComparadorPorNome;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java O.O");
		
		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8 Prático");
		
		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");
		
		List<Livro> livros = Arrays.asList(javaoo, java8, ruby);
		
//		Collections.sort(livros, new ComparadorPorNome());
//		
//		for (Livro livro : livros) {
//			System.out.println(livro.getNome());
//		}
		
//		livros.sort(new Comparator<Livro>() {
//			@Override
//			public int compare(Livro l1, Livro l2) {
//				return l1.getNome().compareTo(l2.getNome());
//			}
//		});
		
//		livros.sort((Livro l1, Livro l2) -> {
//			return l1.getNome().compareTo(l2.getNome());
//		});
		
//		List<Livro> filtrados = new ArrayList<>();
		
//		for (Livro livro : livros) {
//			if (livro.getNome().contains("Java")) {
//				filtrados.add(livro);
//			}
//		}
		
		Stream<Livro> stream = livros.stream();
		
		livros.stream().filter(l -> l.getNome().contains("Java"))
		.forEach(l -> System.out.println(l.getNome()));
		
//		for (Livro livro : livros) {
//			System.out.println(livro.getNome());
//		}
	}
}
