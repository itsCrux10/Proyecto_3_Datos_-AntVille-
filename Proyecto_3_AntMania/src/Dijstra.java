public class Dijstra {

    public int mat_1[][], mat_2[][], mat_3[][];
    public int i, j, k, tamano, fin;

    int costo[];
    int camino[];
    boolean visitando[];
    public void nivel_1() {
        mat_1= new int[15][15];
        tamano = 15;
        fin = 14;
        for (i = 0; i < tamano; i++) {
            for (j = 0; j < tamano; j++) {
                if (i == 0) {
                    if (j != 0 || j != 1 || j != 2) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 0:
                            mat_1[i][j] = 0;
                            break;
                        case 1:
                            mat_1[i][j] = 1;
                            break;
                        case 2:
                            mat_1[i][j] = 2;
                            break;
                    }
                }
                if (i== 1){

                    if (j != 0 || j != 1 || j != 2|| j != 4) {
                        mat_1[i][j] = 99;
                    }
                    switch (j){
                        case 0:
                            mat_1[i][j] = 1;
                            break;
                        case 1:
                            mat_1[i][j]=0;
                            break;
                        case 2:
                            mat_1[i][j]=2;
                            break;
                        case 4:
                            mat_1[i][j]=2;
                            break;
                    }
                }
                if (i == 2) {
                    if (j != 0 || j != 1 || j != 2|| j != 3){
                        mat_1[i][j] = 99;
                    }
                    switch (j){
                        case 0:
                            mat_1[i][j]=2;
                            break;
                        case 1:
                            mat_1[i][j]=2;
                            break;
                        case 2:
                            mat_1[i][j]=0;
                            break;
                        case 3:
                            mat_1[i][j]=4;
                            break;
                    }
                }
                if (i == 3) {
                    if (j != 2 || j != 4|| j != 7|| j != 5 || j != 10 || j != 3) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 2:
                            mat_1[i][j] = 4;
                            break;
                        case 4:
                            mat_1[i][j] = 4;
                            break;
                        case 3:
                            mat_1[i][j] = 0;
                            break;
                        case 5:
                            mat_1[i][j] = 5;
                            break;
                        case 7:
                            mat_1[i][j]=5;
                            break;
                        case 10:
                            mat_1[i][j] = 2;
                            break;
                    }
                }
                if (i == 4) {
                    if (j != 1 || j != 4 || j != 11 || j != 3 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 1:
                            mat_1[i][j] = 2;
                            break;
                        case 4:
                            mat_1[i][j] = 0;
                            break;
                        case 3:
                            mat_1[i][j] = 4;
                            break;
                        case 11:
                            mat_1[i][j] = 10;
                            break;
                    }
                }
                if (i == 5) {
                    if (j != 3 || j != 7 || j !=5 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 3:
                            mat_1[i][j] = 5;
                            break;
                        case 5:
                            mat_1[i][j] = 0;
                            break;
                        case 7:
                            mat_1[i][j] = 5;
                            break;
                    }
                }
                if (i == 6) {
                    if (j != 7|| j != 6 || j !=8 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 7:
                            mat_1[i][j] = 9;
                            break;
                        case 6:
                            mat_1[i][j] = 0;
                            break;
                        case 8:
                            mat_1[i][j] = 5;
                            break;
                    }
                }
                if (i == 7) {
                    if (j != 3 || j != 7 || j !=5 || j !=6 || j !=9  ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 3:
                            mat_1[i][j] = 5;
                            break;
                        case 5:
                            mat_1[i][j] = 5;
                            break;
                        case 7:
                            mat_1[i][j] = 0;
                            break;
                        case 6:
                            mat_1[i][j] = 9;
                            break;
                        case 9:
                            mat_1[i][j]=2;
                            break;
                    }
                }
                if (i == 8) {
                    if (j != 6|| j != 9 || j !=8 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 9:
                            mat_1[i][j] = 1;
                            break;
                        case 6:
                            mat_1[i][j] = 5;
                            break;
                        case 8:
                            mat_1[i][j] = 0;
                            break;
                    }
                }
                if (i == 9) {
                    if (j != 7|| j != 8 || j !=9 || j != 13|| j != 14) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 7:
                            mat_1[i][j] = 2;
                            break;
                        case 9:
                            mat_1[i][j] = 0;
                            break;
                        case 8:
                            mat_1[i][j] = 1;
                            break;
                        case 14:
                            mat_1[i][j]=2;
                            break;
                        case 13:
                            mat_1[i][j]=10;
                            break;
                    }
                }
                if (i == 10) {
                    if (j != 3|| j != 10 || j !=11 || j != 12|| j != 13) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 3:
                            mat_1[i][j] = 2;
                            break;
                        case 10:
                            mat_1[i][j] = 0;
                            break;
                        case 11:
                            mat_1[i][j] = 4;
                            break;
                        case 12:
                            mat_1[i][j]=2;
                            break;
                        case 13:
                            mat_1[i][j]=10;
                            break;
                    }
                }
                if (i == 11) {
                    if (j != 10|| j !=11 || j !=4 || j != 12) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 4:
                            mat_1[i][j] = 10;
                            break;
                        case 11:
                            mat_1[i][j] = 0;
                            break;
                        case 10:
                            mat_1[i][j] = 4;
                            break;
                        case 12:
                            mat_1[i][j]=5;
                            break;
                    }
                }
                if (i == 12 ){
                    if (j != 11|| j != 10 || j !=12 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 10:
                            mat_1[i][j] = 2;
                            break;
                        case 11:
                            mat_1[i][j] = 5;
                            break;
                        case 12:
                            mat_1[i][j] = 0;
                            break;
                    }
                }
                if (i == 13) {
                    if (j != 10|| j != 9 || j !=13 ) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 9:
                            mat_1[i][j] = 10;
                            break;
                        case 10:
                            mat_1[i][j] = 10;
                            break;
                        case 13:
                            mat_1[i][j] = 0;
                            break;


                    }
                }
                if (i == 14) {
                    if (j != 9|| j != 14) {
                        mat_1[i][j] = 99;
                    }
                    switch (j) {
                        case 9:
                            mat_1[i][j] = 2;
                            break;
                        case 14:
                            mat_1[i][j] = 0;
                            break;
                    }
                }


                }
            }
        }

    public void printMatriz(){
        for (i=0;i<mat_1.length;i++)
            for (j=0;j<mat_1.length;j++) {
                if (j == 0) {
                    System.out.printf("[" + mat_1[i][j]);
                } if (j!=0) {
                    if (j + 1 != 15) {
                        System.out.printf(" " + String.valueOf(mat_1[i][j]));
                    } else  {
                        System.out.printf(" " + mat_1[i][j] + " ]");
                        System.out.println();
                    }
                }}}

    public void Dijstra1( ){
        this.costo=new  int[15];
        this.camino = new int[15];
        this.visitando = new boolean[15];
        this.mat_1= new int[15][15];

        visitando[0]= true;
        camino[0]=1;
        costo[0]=0;
    }

    public void caminos(){
        i=0;
        j=0;
        for (i=0;i<tamano;i++){
            for (j=0;j<tamano;j++){

            }
        }

    }}

   /* public static void main(String[] args) {
        Dijstra d = new Dijstra();
        d.nivel_1();
        d.printMatriz();


    }
}*/

