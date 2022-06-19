import javax.swing.*;

public class NodoLDE {
    NodoLDE siguiente, anterior;

    crearXml dato;

    public NodoLDE(crearXml ele, NodoLDE ant, NodoLDE sig){
        siguiente = sig;
        anterior = ant;
        dato = ele;
    }

    /**
     * Funcion la cual se encarga de obtener el valor del nodo anterior de la lista
     * @return retorna el valor  anterior en la lista
     */
    public NodoLDE getAnterior() {
        return anterior;
    }

    /**
     * Funcion la cual se encarga de obtener el valor siguiente de la lista.
     * @return retorna el siguiente valor en la lista
     */

    public NodoLDE getSiguiente() {
        return siguiente;
    }

    /**
     * Funcion la cual se encarga de obtener  al imagen que se ingreso a la lista
     * @return dato
     */

    public crearXml getDato(){
        return dato;
    }

    /**
     * Funcion encargada de establecer el valor anterior en la lista
     * @param anterior  digito anterior de la lista
     */

    public void setAnterior(NodoLDE anterior) {
        this.anterior = anterior;
    }

    /**
     * Funcion encargadad de cambiar el valor de un dato
     * @param dato nuevo dato a ingresar
     */

    public void setDato(crearXml dato) {
        this.dato = dato;
    }

    /**
     * Funcion encargada de establecer el siguiente valore en la lista.
     * @param siguiente el valor del nuevo nodo siguiente
     */

    public void setSiguiente(NodoLDE siguiente) {
        this.siguiente = siguiente;
    }
}
