package grafo;

public interface IGrafo<T> {

    public Vertice<T> addVertice(String nome, T elemento);
    public Vertice<T> getVertice(int index);
    public void addAresta(int u, int v);
    public int numeroDeVertices();
    public int numeroDeArestas();
    public boolean isDirecionado();

}
