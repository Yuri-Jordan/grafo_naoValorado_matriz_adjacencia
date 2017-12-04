
package grafo;

public class VerticeIndexado<T> extends Vertice<T>{
    
    int index;

    public VerticeIndexado(String nome, T elemento, int index) {
        super(nome, elemento);
        this.index = index;
    }
    
    public int getIndex(){
        return this.index;
    }
    
}
