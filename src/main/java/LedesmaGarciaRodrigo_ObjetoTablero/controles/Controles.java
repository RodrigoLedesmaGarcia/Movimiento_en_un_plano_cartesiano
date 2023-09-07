package LedesmaGarciaRodrigo_ObjetoTablero.controles;

import LedesmaGarciaRodrigo_ObjetoTablero.Tablero;

import java.util.Scanner;

public class Controles {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Tablero t1;

        double x, y;
        int opcion;
        double incremento = 0;

        System.out.println("Digite la coordenada inicial de X =>");
        x = entrada.nextDouble();
        System.out.println("Digite la coordenada inicial de Y =>");
        y = entrada.nextDouble();

        t1 = new Tablero(x, y);

        do {
            System.out.println("============= MENU =============");
            System.out.println("1. mover hacia arriba");
            System.out.println("2. mover hacia abajo");
            System.out.println("3. mover hacia la derecha");
            System.out.println("4. mover hacia la izquierda");
            System.out.println("5. salir");
            opcion = entrada.nextInt();

            if (opcion != 5){
                System.out.println("Digite la cantidad de espacios a moverse");
                incremento = entrada.nextDouble();
            }
            switch (opcion){
                case 1: t1.moverArriba(incremento);
                break;
                case 2: t1.moverAbajo(incremento);
                break;
                case 3: t1.moderDerecha(incremento);
                break;
                case 4: t1.moderIzquierda(incremento);
                break;
                default:
                    System.out.println("Esa opcion no existe");

            }
            System.out.println(" ");
            System.out.println("Posicion Actual (X,Y)=> ("+t1.getX()+", "+t1.getY()+")");
        }while(opcion != 5);


    }
}
