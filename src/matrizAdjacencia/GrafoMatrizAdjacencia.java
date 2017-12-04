package matrizAdjacencia;

import grafo.IGrafo;
import grafo.Vertice;
import grafo.VerticeIndexado;


public class GrafoMatrizAdjacencia<T> implements IGrafo<T> {

	protected boolean direcionado;
	protected int numeroDeVertices;
	protected int numeroDeArestas;
	protected Vertice<T>[] vertices;
	protected int[][] matrizAdj;

	public GrafoMatrizAdjacencia(int maxVertices, boolean direcionado) {
		this.direcionado = direcionado;
		numeroDeVertices = 0;
		numeroDeArestas = 0;
		vertices = new Vertice[maxVertices];
		matrizAdj = new int[maxVertices][maxVertices];
                
		for (int i = 0; i < maxVertices; i++) {
			for (int j = 0; j < maxVertices; j++) {
				matrizAdj[i][j] = 0;
			}
		}
	}

	@Override
	public Vertice<T> addVertice(String name, T element) {
                int i = numeroDeVertices;
		vertices[i] = new Vertice<T>(name, element);
                numeroDeVertices++;
		return vertices[i];
	}

	@Override
	public Vertice<T> getVertice(int index) {
		return vertices[index];
	}

	@Override
	public void addAresta(int u, int v) {
		matrizAdj[u][v] = 1;
		if (!direcionado) {
			matrizAdj[v][u] = 1;
		}
		numeroDeArestas++;
	}
        
        @Override
        public void addAresta(Vertice<T> u, Vertice<T> v) {
           addAresta(((VerticeIndexado<T>)u).getIndex(), ((VerticeIndexado<T>)v).getIndex());
        }

	@Override
	public int numeroDeVertices() {
		return numeroDeVertices;
	}

	@Override
	public int numeroDeArestas() {
		return numeroDeArestas;
	}

	@Override
	public boolean isDirecionado() {
		return direcionado;
	}
        
        public String exibirMatriz(){
            
            return "";
        }

	@Override
	public String toString() {
		String resultado = this.direcionado ? "Grafo direcionado {\n" : "Grafo ñ direcionado {\n";
		String aresta = this.direcionado ? " -> " : " -- ";

		for (Vertice<T> vertice : this.vertices) {
			for (Vertice<T> verticeAdjacente : this.matrizAdj.length()){
				resultado += "\t" + vertice.getnome() + aresta + verticeAdjacente.getnome() + ";\n";
			}
		}

		resultado += "}";
		return resultado;
	}




}
