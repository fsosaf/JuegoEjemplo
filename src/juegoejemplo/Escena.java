package juegoejemplo;

import java.util.Scanner;

public class Escena {

    private Auto auto;
    private Pared pared;

    public Escena(Auto auto) {
        this.auto = auto;
        this.pared = new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public void jugar() {

        Scanner ingresar = new Scanner(System.in);
        System.out.println("Comenzamos a movernos...");

        String salir = "q";

        while (!salir.equalsIgnoreCase("e")) {
            switch (ingresar.nextLine()) {
                case "a":
                    auto.moverIzquierda();
                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        salir = "e";
                        auto.setChocado(true);

                    }
                    break;
                case "d":
                    auto.moverDerecha();
                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        salir = "e";
                        auto.setChocado(true);

                    }
                    break;
                case "s":
                    auto.moverAbajo();
                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        salir = "e";
                        auto.setChocado(true);

                    }
                    break;
                case "w":
                    auto.moverArriba();
                    if (auto.getPosX() == pared.getPosX() && auto.getPosY() == pared.getPosY()) {
                        salir = "e";
                        auto.setChocado(true);

                    }
                    break;

                case "e":
                    salir = "e";
                    break;

                /*default:
                    System.out.println("Presiona bien la direccion de movimiento.");
                    break;*/
            }
        }
        if (auto.isChocado() == true) {

            System.out.println("Chocaste! PERDISTE");
        } else if (salir == "e") {
            System.out.println("Saliste, hasta la proxima!");
        }

        //Utilizando Scanner
        //A ---Izquierda
        //S---Abajo
        //D--Derecha
        //W---Para arriba
        //E..Salir del juego
        //si el auto choca con la pared, el auto queda chocado.
    }

}
