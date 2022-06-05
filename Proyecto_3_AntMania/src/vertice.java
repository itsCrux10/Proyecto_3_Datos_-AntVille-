import java.util.ArrayList;

public class vertice<T> {
    private  T vertice;
    private ArrayList<arista<T>> aristas = new ArrayList<>();

    public void addArista(arista<T> arista){
        aristas.add(arista);

    }
    public int costo(int pos){
        return aristas.get(pos).getCosto();
    }
    public  vertice(T vertice){
        this.vertice = vertice;

    }
}

