package br.com.casadocodigo.livraria.produtos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GerenciadorDeCupons {

//	private Set<String> cupons;
//
//	public GerenciadorDeCupons() {
//		this.cupons = new HashSet<String>();
//		cupons.addAll(Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21", "CUP221", "CUP91"));
//	}
//
//	public boolean validaCupom(String cupom) {
//		return this.cupons.contains(cupom);
//	}
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("cab11", 10.0);
		cupons.put("cab22", 12.0);
		cupons.put("cab33", 13.0);
		cupons.put("cab44", 14.0);
	}
	
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}
}
