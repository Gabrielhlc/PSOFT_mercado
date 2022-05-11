package exemplo;
import java.util.UUID;

public class Produto {
	
	private String id;
	
	private String nome; 
	
	private String fabricante;

	public Produto(String nome, String fabricante) {
		this.id = UUID.randomUUID().toString();
		this.nome = nome;
		this.fabricante = fabricante;
	}
	
	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String novoFabricante) {
		this.fabricante = novoFabricante;
	}

	public void setNome( String novoNome) {
		this.nome = novoNome;
	}
	
	public String toString() {
		return "Produto ID: " + getId() + " - Fabricante: " + getFabricante();
	}
}
