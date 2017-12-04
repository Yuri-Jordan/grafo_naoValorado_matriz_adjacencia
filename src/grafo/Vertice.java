package grafo;

public class Vertice<T> {

    String nome;
    T elemento;
    int index;

    public Vertice(String nome, T elemento, int index) {
        this.nome = nome;
        this.elemento = elemento;
        this.index = index;
    }

    public int getIndex(){
        return this.index;
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
