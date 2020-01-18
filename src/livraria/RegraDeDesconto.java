package livraria;

public class RegraDeDesconto {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		
		Livro livro = new MiniLivro(autor);
		livro.adicionaValor(39.90);
		
//		if (!livro.aplicaDescontoDe(0.3)) {
//			System.out.println("Desconto não pode ser maior do que 30%");
//		} else {
//			System.out.println("Valor com desconto: " + livro.retornaValor());
//		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);
		
		if (!ebook.aplicaDescontoDe(0.15) ) {
			System.out.println("Desconto no ebook não pode ser maior do que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}
	}
}
