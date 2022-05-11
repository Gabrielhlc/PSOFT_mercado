package exemplo;

import java.util.HashMap;
import java.util.Map;

public class LoteRepository {

    private Map<String, Lote> lotes = new HashMap<>();

    public String addLote(Lote lote) {
        lotes.put(lote.getId(), lote);
        return lote.getId();
    }

    public void editarLote(Lote novoLote) {
        addLote(novoLote);
    }

    public Lote removeLote(String loteId) {
        Lote lote = lotes.get(loteId);
        lotes.remove(loteId);
        return lote;
    }

    public Lote recuperarLote(String loteId) {
        return lotes.get(loteId);
    }
}
