import exemplo.Lote;
import exemplo.Produto;
import exemplo.ProdutoRepository;

public class Sistema {

	public static void main(String[] args) {
		
		Produto leite = new Produto("Leite", "Parmalat");
		Produto pao = new Produto( "Pão", "Pão Bom");
		Produto ovos = new Produto("Ovos", "Ovo Bom");

		Lote lote = new Lote(leite, 10L);
		ProdutoRepository catalogo = new ProdutoRepository();

		catalogo.addProduto(leite);
		catalogo.addProduto(pao);
		catalogo.addProduto(ovos);

		System.out.println(leite);
		System.out.println(lote);

		catalogo.listarProdutos();
	}
}
