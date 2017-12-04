package grafo;

public interface IGrafo<T> {

	public Vertice<T> addVertice(String name, T element);
	public Vertice<T> getVertice(int index);
        public void addAresta(int u, int v);
        public void addAresta(Vertice<T> u, Vertice<T> v);
	public int numeroDeVertices();
	public int numeroDeArestas();
	public boolean isDirecionado();

}
