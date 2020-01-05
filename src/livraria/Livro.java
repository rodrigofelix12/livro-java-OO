package livraria;

public class Livro {

	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição:" + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		
		if (this.temAutor() ) {
			autor.mostrarDetalhes();			
		}
		System.out.println("--");
	}
	
	private boolean temAutor() {
		return this.autor != null;
	}

	public void aplicaDescontoDe(double porcentagem) {
		valor -= this.valor * porcentagem;
	}
}
