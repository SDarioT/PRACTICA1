package com.company;

public class Cosas {
    public String name;
    public String color;
    public String made;
    public String marca;

    public static void main(String[] args) {
        var cosa = new Cosas();
        cosa.name = "phone";
        cosa.color = "black";
        cosa.made = "china";
        cosa.marca = "samsung";

        System.out.println("Datos del objeto: " +cosa.name +cosa.color +cosa.made +cosa.marca);

        var cosan = new Cosas();
        cosan.name = "Laptop";
        cosan.color = "black";
        cosan.made = "china";
        cosan.marca = "lenovo";

        System.out.println("Datos del objeto: " +cosan.name +cosan.color +cosan.made +cosan.marca);
    }
}
