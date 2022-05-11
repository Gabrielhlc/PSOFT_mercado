package exemplo;

import java.util.HashMap;
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
}