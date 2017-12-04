package grafo;

import matrizAdjacencia.GrafoMatrizAdjacencia;


public class Teste {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("############################################################");
        System.out.println("GRAFO NÃO VALORADO REPRESENTADO COM MATRIZ DE ADJACÊNCIA");
        System.out.println("############################################################");
        //Criando um grafo
        GrafoMatrizAdjacencia m = new GrafoMatrizAdjacencia(4, true);

        //Adiciona vertices
        m.addVertice("Brasil", new Object().getClass().getName());
        m.addVertice("Sérvia", new Object().getClass().getName());
        m.addVertice("Suíça", new Object().getClass().getName());
        m.addVertice("Costa Rica", new Object().getClass().getName());

        //Adiciona arestas
        m.addAresta(0, 1);
        m.addAresta(2, 3);
        m.addAresta(3, 2);

        //Imprime matriz de adjacência
        m.exibirMatriz();
        System.out.println(m.exibirRelacionamentos());

    }
}
