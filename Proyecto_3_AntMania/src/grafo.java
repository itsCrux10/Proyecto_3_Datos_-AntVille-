import java.util.*;

class Grafo{
    List<List<Vertice>> adj_list= new ArrayList<>();


    static class Vertice{
        int valor,peso;
        Vertice(int valor, int peso){
            this.peso=peso;
            this.valor= valor;
        }

    }

    public Grafo(List<Arista> aristas){
        for (int i=0; i< aristas.size();i ++){
            adj_list.add(i,new ArrayList<>());
        }
        for(Arista e: aristas){
            adj_list.get(e.ini).add(new Vertice(e.fin,e.peso));

        }
    }

    public void printGrafo(Grafo grafo){
        int ini_vertice= 0;
        int list_size = grafo.adj_list.size();

        System.out.println("El contenido del grafo es:");
        while (ini_vertice<list_size){
            for (Vertice node: grafo.adj_list.get(ini_vertice)){
                System.out.print( "Inicio = " + ini_vertice + " Destino= " + node.valor+ " peso = " + node.peso+ " ");
            }
            System.out.println();
            ini_vertice++;
        }
    }
    public void printPesos(Grafo grafo){
        int i,j;
        int l_grafo =  grafo.adj_list.size();

        System.out.println("Pesos del grafo");
        for(i=0;i<l_grafo;i++){
            for (Vertice nodo: grafo.adj_list.get(i)){

            }



        }

    }
}





