public class arista<T> {
    private T sucesor;
    private  int costo;

    public arista(T sucesor, int costo){
        this.costo= costo;
        this.sucesor = sucesor;

    }

    public int getCosto() {
        return costo;
    }

    public T getSucesor() {
        return sucesor;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setSucesor(T sucesor) {
        this.sucesor = sucesor;
    }

}
