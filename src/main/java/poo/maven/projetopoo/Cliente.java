package poo.maven.projetopoo;

public class Cliente{

	private String nome;
	private String id;
	public Cliente(String nome,String id) {
		this.nome = nome;
		this.id = id;
	}

	public String toString(){
		return "Nome - "+this.nome+" ID - "+this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public String getId() {
		return this.id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(String id) {
		this.id = id;
	}

}
