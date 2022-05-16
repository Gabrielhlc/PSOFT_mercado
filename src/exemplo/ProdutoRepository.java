package exemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutoRepository {

    private Map<String, Produto> catalogo = new HashMap<>();

    public String addProduto(Produto p) {
        catalogo.put(p.getId(), p);
        return p.getId();
    }

    public void editarProduto(Produto novoProduto) {
        addProduto(novoProduto);
    }

    public Produto removeProduto(String Pid) {
        Produto produto = catalogo.get(Pid);
        catalogo.remove(Pid);
        return produto;
    }

    public Produto recuperarProduto(String Pid) {
        return catalogo.get(Pid);
    }

    public List<Produto> getProdsByName(String nome) {
        List<Produto> prods = new ArrayList<Produto>();
        for (Produto p: catalogo.values()) {
            if (p.getNome().contains(nome)) {
                prods.add(p);
            }
        }
        return prods;
    }

    public List<Produto> getAll() {
        List<Produto> list = new ArrayList<Produto>();
        for (Produto produto: catalogo.values()) {
            list.add(produto);
        }
        return list;
    }
}