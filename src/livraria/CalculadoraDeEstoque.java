package livraria;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
//		double livroJava8 = 59.90;
//		double livroTDD =  59.90;
//		
//		double soma = livroJava8 + livroTDD;
//		
//		System.out.println("O total em estoque é " + soma);
//		
//		if (soma < 150) {
//			System.out.println("Seu estoque está muito baixo!");
//		} else if (soma >= 2000) {
//			System.out.println("Seu estoque está muito alto!");
//		} else {
//			System.out.println("Seu estoque está bom");
//		}
		
		double soma = 0;
//		int contador = 0;
		
//		while (contador < 35) {
//			double valorDoLivro = 59.90;
//			soma += valorDoLivro;
//			contador ++;
//		}
		
		for (double i = 0; i < 35; i++) {
			soma += 59.90;
		}
		
		System.out.println("O total em estoque é "+ soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom");
		}
	}
}
