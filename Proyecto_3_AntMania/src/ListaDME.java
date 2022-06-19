import javax.swing.*;
import java.util.List;

public class ListaDME {

   private  NodoLDE inicio, fin;

   private  crearXml dato;

    private int tamano;


    public ListaDME(){
        inicio =fin;
    }


    public void insetarInicio(){
        if (inicio == null){
            inicio = new NodoLDE(dato,null,null);
            fin=inicio;
            tamano++;
        }else{
            NodoLDE nuevo = new NodoLDE(dato,null,inicio);
            inicio.setAnterior(nuevo);
            inicio=nuevo;
            tamano++;
        }
    }
    public void  insertarFin(crearXml xml){
        if (inicio == null){
            fin = new NodoLDE(xml,null,null);
            inicio=fin;
            tamano++;
        }else{
            NodoLDE nuevo = new NodoLDE(xml,fin,null);
            fin.setAnterior(nuevo);
            fin=nuevo;
            tamano++;

        }

    }

    public crearXml extraerInicio() {
        crearXml xml = inicio.getDato();
        System.out.println(inicio.getDato());
        tamano--;
        inicio = inicio.getSiguiente();
        if (inicio != null) {
            inicio.setAnterior(null);
        } else {
            fin = null;
        }
        System.out.println("Se esxtrajo el inicio");

        return xml;
    }
}
