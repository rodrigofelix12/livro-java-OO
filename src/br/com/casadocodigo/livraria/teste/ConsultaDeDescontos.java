package br.com.casadocodigo.livraria.teste;

import java.util.HashSet;

import br.com.casadocodigo.livraria.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
		Double desconto = gerenciador.validaCupom("cab11");
		
		if (desconto != null) {
			System.out.println("Cupom de desconto valido.");
			System.out.println("Valor " + desconto);
		} else {
			System.out.println("Esse cupom não existe.");
		}
		
//		if (gerenciador.validaCupom("CUP1234")) {
//			System.out.println("Cupom de desconto válido!");
//		} else {
//			System.out.println("Esse cupom não existe!");
//		}
		
	}
}
