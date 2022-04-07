package com.company;

public class Famosos {
    public String name;
    public String lastname;
    public String years;
    public String profesion;
    public static void main(String[] args) {
        // write your code here
        var famosa = new Famosos();
        famosa.name = "Elizabeth ";
        famosa.lastname = "Olsen, ";
        famosa.years = "28 años, ";
        famosa.profesion = "actriz";

        System.out.println("Datos de la famosa: " +famosa.name +famosa.lastname +famosa.years +famosa.profesion);

        var famoso = new Famosos();
        famoso.name = "Franco ";
        famoso.lastname = "Escamilla, ";
        famoso.years = "40 años, ";
        famoso.profesion = "comediante";

        System.out.println("Datos del famoso: " +famoso.name +famoso.lastname +famoso.years +famoso.profesion);

    }
}
