import java.util.Random;

public class hormiga_azul_logica extends  Thread {
    int nivel;
    gui interfaz;

    Random r;


    public hormiga_azul_logica(int nivel, gui interfaz){
        this.nivel= nivel;
        this.interfaz = interfaz;
    }

    public void mov_nivel_1() throws InterruptedException {
       /* r = new Random();
        int inicio = 0;
        int fin = 14;
        int cambio;
        int peso = 0;
        if (inicio == 0) {
            cambio = r.nextInt(2) + 1;
            if (cambio == 1) {
                peso += 1;
                inicio = 1;
            } else {
                peso += 2;
                inicio = 2;
            }
            mov_nivel_1();
        }
        if (inicio == 1) {
            cambio = r.nextInt(3) + 1;
            if (cambio == 1) {
                peso += 1;
                inicio = 0;
            }
            if (cambio == 2) {
                peso += 2;
                inicio = 2;
            }
            if (cambio == 3) {
                peso += 2;
                inicio = 4;
            }
            mov_nivel_1();
        }
        if (inicio == 2) {
            cambio = r.nextInt(3) + 1;
            if (cambio == 1) {
                peso += 2;
                inicio = 0;

            }
            if (cambio == 2) {
                peso += 2;
                inicio = 1;
            }
            if (cambio == 3) {
                peso += 4;
            }
            mov_nivel_1();
        }
        System.out.println(peso);

*/
    }
}
