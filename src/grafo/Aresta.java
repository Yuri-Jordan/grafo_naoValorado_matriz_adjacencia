package grafo;

public class Aresta<T> {

	protected Vertice<T> u;
	protected Vertice<T> v;

	public Aresta(Vertice<T> u, Vertice<T> v) {
		this.u = u;
		this.v = v;
	}

	public Vertice<T> getVerticeU() {
		return u;
	}

	public void setVerticeU(Vertice<T> u) {
		this.u = u;
	}

	public Vertice<T> getVerticeV() {
		return v;
	}

	public void setVerticeV(Vertice<T> v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "("+u+", "+v+")";
	}

}
