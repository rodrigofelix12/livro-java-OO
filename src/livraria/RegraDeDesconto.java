package livraria;

public class RegraDeDesconto {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.adicionaValor(59.90);
		
		System.out.println("Valor atual: " + livro.retornaValor());
		
		if (!livro.aplicaDescontoDe(0.4)) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.retornaValor());
		}
	}
}
