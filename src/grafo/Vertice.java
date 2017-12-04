package grafo;

public class Vertice<T> {

	protected String nome;
	protected T elemento;

	public Vertice(String nome,T elemento) {
		this.nome = nome;
		this.elemento = elemento;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public T getelemento() {
		return elemento;
	}

	public void setelemento(T elemento) {
		this.elemento = elemento;
	}


	public String intoString() {
		return nome;
	}
}
