package grafo;

import matrizAdjacencia.GrafoMatrizAdjacencia;


public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println("GRAFO NÃO PONDERADO REPRESENTADO COM MATRIZ DE ADJACENCIA");
		System.out.println("*******************************************************");
		//Criando um grafo
		GrafoMatrizAdjacencia m = new GrafoMatrizAdjacencia(5, true);

		//Adicionando vertices
		m.addVertice("0", 0);
		m.addVertice("1", 1);
		m.addVertice("2", 2);
		m.addVertice("3", 3);
		m.addVertice("4", 4);

		//Adicionando as arestas
		m.addAresta(0, 1);
		m.addAresta(1, 3);
		m.addAresta(1, 4);
		m.addAresta(2, 3);
		m.addAresta(3, 2);
		m.addAresta(4, 4);

		//Imprimir vértices adjacentes
		System.out.println(m.exibirMatriz());

        }
}
