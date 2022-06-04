package com.upchiapas.Pizza.modelos;

public class CatalogoPizza extends Pizza{
    private String peperony;
    private String mexicana;



    public String getPeperony() {
        return peperony;
    }

    public void setPeperony(String peperony) {
        this.peperony = peperony;
    }

    public String getMexicana() {
        return mexicana;
    }

    public void setMexicana(String mexicana) {
        this.mexicana = mexicana;
    }
    public void MostrarCatalogo(){
        String Mexicana="mexicana";
        String peprini="peperony";
        setPrecio(200);
        setPeperony(peprini);
        setMexicana(Mexicana);
        System.out.println("***1.pizza: "+getPeperony());
        System.out.println("***precio $"+getPrecio());

        System.out.println("***2.pizza:"+getMexicana());
        setPrecio(150);
        System.out.println("***precio $"+getPrecio());
        System.out.println("++++++++++++++++++++++++++++++");

    }

}
