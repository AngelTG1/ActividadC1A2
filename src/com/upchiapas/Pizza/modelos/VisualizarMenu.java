package com.upchiapas.Pizza.modelos;

import java.util.Scanner;

public class VisualizarMenu {
    public void verMenu(){
        Pedido cliente=new Pedido();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1.agregar cliente");
            System.out.println("2. buscar Cliente");
            System.out.println("3. Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:

                    cliente.Agregar();
                    break;
                case 2:
                    System.out.println("ingresa el nombre del cliente");
                    String nombre=entrada.next();
                    cliente.BuscarCliente(nombre);
                    break;
                case 3:

                    break;

            }
        }while (opcion!=3);


    }
}
