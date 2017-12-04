package matrizAdjacencia;

import grafo.Aresta;
import grafo.IGrafo;
import grafo.Vertice;


public class GrafoMatrizAdjacencia<T> implements IGrafo<T> {

    boolean direcionado;
    int numeroDeVertices;
    int numeroDeArestas;
    Vertice<T>[] vertices;
    Aresta<T>[] arestas;
    int[][] matrizAdj;

    public GrafoMatrizAdjacencia(int maxVertices, boolean direcionado) {
            this.direcionado = direcionado;
            numeroDeVertices = 0;
            numeroDeArestas = 0;
            
            if(this.direcionado)
                arestas = new Aresta[maxVertices*(maxVertices-1)];
            else
                arestas = new Aresta[maxVertices*(maxVertices-1)/2];
            
            vertices = new Vertice[maxVertices];
            matrizAdj = new int[maxVertices][maxVertices];

            for (int i = 0; i < maxVertices; i++) {
                    for (int j = 0; j < maxVertices; j++) {
                            matrizAdj[i][j] = 0;
                    }
            }
    }

    @Override
    public Vertice<T> addVertice(String nome, T elemento) {
        int i = numeroDeVertices;
        vertices[i] = new Vertice(nome, elemento, i);
        numeroDeVertices++;
        return vertices[i];
    }

    @Override
    public Vertice<T> getVertice(int index) {
        return vertices[index];
    }

    public void addAresta(int u, int v) {
            
        matrizAdj[u][v] = 1;
        
        if (!direcionado)
            matrizAdj[v][u] = 1;
        
        arestas[numeroDeArestas] = new Aresta(vertices[u], vertices[v]);
        numeroDeArestas++;
            
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

    public void exibirMatriz(){

        for (int i = 0; i < matrizAdj.length; i++) {
            for (int j = 0; j < matrizAdj[i].length; j++) {
                System.out.print(matrizAdj[i][j] + " ");
            }
            System.out.println();
        }

    }

    public String exibirRelacionamentos() {
        String resultado = this.direcionado ? "Grafo direcionado {\n" : "Grafo ñ direcionado {\n";
        String tipoAresta = this.direcionado ? " -> " : " -- ";

        for (int i =0; i < this.arestas.length; i++) {
            if(arestas[i] != null)
                resultado += "\t" + arestas[i].getVerticeU().getnome()+ tipoAresta + arestas[i].getVerticeV().getnome() + ";\n";
        }
        resultado += "}";
        return resultado;
    }

}
