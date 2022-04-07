package com.company;

public class Main {
    public String name;
    public String lastname;
    public String years;
    public String profesion;
    public static void main(String[] args) {
	// write your code here
        var persona = new Main();
        persona.name = "Dario";
        persona.lastname = "Tenezaca, ";
        persona.years = "25 años, ";
        persona.profesion = "Estudiante";

        System.out.println("Datos de la persona: " +persona.name +persona.lastname +persona.years +persona.profesion);

        var personan = new Main();
        personan.name = "Juan";
        personan.lastname = "Perez ";
        personan.years = "21 años, ";
        personan.profesion = "Estudiante";

        System.out.println("Datos de la persona: " +personan.name +personan.lastname +personan.years +personan.profesion);

    }
}
