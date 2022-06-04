package com.upchiapas.Pizza.modelos;

import java.util.Scanner;
import com.upchiapas.Pizza.modelos.Pizza;
import java.util.Scanner;

public class Pedido {
    Scanner entrada = new Scanner(System.in);
    Cliente cliente1;
    Cliente[] registarCli;
    Pizza pizza=new Pizza();
    Cliente cliente=new Cliente();
    CatalogoPizza catalogo=new CatalogoPizza();
    int[] pagos = new int[2];
    int pago;
    public void agregarPetido(){
        int turno=2;
        int tur;

        for (int i = 0; i < 1; i++) {
            System.out.println("ingrese el nombre ");
            String nom = entrada.next();
            cliente.setNombre(nom);
            System.out.println("agrega la cantidad de pizza");
            int cantidad = entrada.nextInt();
            pizza.setCantidad(cantidad);
            registarCli = new Cliente[2];
            turno=+1;
            tur=turno;
            cliente1 = new Cliente(nom, tur);
            registarCli[i] = cliente1;
            //VisualizarCliente();
            System.out.println("..................");
        }

    }
    public void VisualizarCliente(){
        for (int i = 0; i < 1; i++) {
            System.out.println("nombre del cliente: "+registarCli[i].getNombre());
            System.out.println("turno "+registarCli[i].getTurno());
            System.out.println(".....................................");
        }
    }
    public void Agregar() {
        catalogo.MostrarCatalogo();
        System.out.println("seleciona la pizza");
        int pizzas = entrada.nextInt();
        agregarPetido();


        if (pizzas==1){
            pizza.setPrecio(200);
            pago= pizza.getPrecio()*pizza.getCantidad();

            pagos[0]=pago;
            System.out.println("precio a pagar "+pagos[0] );
            System.out.println("Pizza comprada: "+catalogo.getPeperony());
            VisualizarCliente();
        }
        if (pizzas==2){
            pizza.setPrecio(150);
            pago= pizza.getPrecio()*pizza.getCantidad();

            pagos[1]=pago;
            System.out.println("precio a pagar "+pagos[1] );
            System.out.println("Pizza comprada: "+catalogo.getMexicana());
            VisualizarCliente();
        }

    }
    public void BuscarCliente(String nombre){
        for (int i=0;i<1;i++ ){
            if (registarCli[i].getNombre()==nombre){
                System.out.println("*+++++++++++++++++++++++++");
                System.out.println("Nombre del ciente: "+registarCli[i].getNombre());

                System.out.println("*+++++++++++++++++++++++++");
            }else{
                System.out.println("Nombre cliente: "+nombre);
            }
        }
    }

}
