package com.company;

public class Docentes {
    public String name;
    public String lastname;
    public String years;
    public String profesion;
    public static void main(String[] args) {
        var docente = new Docentes();
        docente.name = "Julio ";
        docente.lastname = "Jaramillo, ";
        docente.years = "54 años, ";
        docente.profesion = "ingenieria, ";
        System.out.println("Datos del docente: " +docente.name +docente.lastname +docente.years +docente.profesion);

        var docenten = new Docentes();
        docenten.name = "Grace ";
        docenten.lastname = "Patiño, ";
        docenten.years = "34 años, ";
        docenten.profesion = "Maestria";
        System.out.println("Datos de la docente: " +docenten.name +docenten.lastname +docenten.years +docenten.profesion);
    }
}
