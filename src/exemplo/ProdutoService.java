package exemplo;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private LoteRepository loteRepository;
    private ProdutoRepository produtoRepository;

    public List<Produto> listProdsLote(String nome) {
        List<Lote> lotes = loteRepository.getAll();

        List<Produto> prods = getProdsFromLotes(lotes);
        List<Produto> prodsOk = getProdsByName(nome, prods);
        return prodsOk;
    }

    public List<Produto> listProdsByName(String nome) {
        List<Produto> prods = produtoRepository.getAll();
        List<Produto> prodOk = getProdsByName(nome, prods);
        return prodOk;
    }

    private List<Produto> getProdsFromLotes(List<Lote> lotes) {
        List<Produto> prods = new ArrayList<Produto>();
        for (Lote lote: lotes) {
            prods.add(lote.getProduto());
        }
        return prods;
        }
    private List<Produto> getProdsByName(String nome, List<Produto> prods) {
        List<Produto> prodsOk = new ArrayList<Produto>();
        for (Produto p: prods) {
            if (p.getNome().contains(nome)) {
                prodsOk.add(p);
            }
        }
        return prodsOk;
    }
}
