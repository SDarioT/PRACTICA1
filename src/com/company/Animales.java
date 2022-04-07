package com.company;

public class Animales {
    public String name;
    public String color;
    public String type;
    public String alimento;

    public static void main(String[] args) {
        var animal = new Animales();
        animal.name = "vaca, ";
        animal.color = "black and white, ";
        animal.type = "domestico, ";
        animal.alimento = "herbivoro";

        System.out.println("Datos del animal: " +animal.name +animal.color +animal.type +animal.alimento);

        var animaln = new Animales();
        animaln.name = "leon, ";
        animaln.color = "amarillo, ";
        animaln.type = "salvaje, ";
        animaln.alimento = "carnivoro";

        System.out.println("Datos del animal: " +animaln.name +animaln.color +animaln.type +animaln.alimento);
    }
}