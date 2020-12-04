package com.programacion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto para aprender a hacer un Singleton");

        //intento instanciar un objeto con el constructor privado
        // esto es un error
        // Singleton miUnicaInstancia = new Singleton();

        // creamos un objeto
        Singleton obx1 = Singleton.getInstance();
        // rellenamos los atributos
        obx1.setEdad(20);
        obx1.setNombre("Pepe");
        System.out.println(obx1.getNombre() +obx1.getEdad());


        // creamos otro objeto Singleton
        // como la única manera es con getInstance(), este método se encargará
        // de devolvernos el objeto creado anteriormente
        Singleton obx2 = Singleton.getInstance();
        // podemos cambiar la edad
        System.out.println(obx2.getNombre() +obx2.getEdad());
        // comprobar con el debug que los dos objetos:
        // miUnicaInstancia y otraInstanciaSeraLaMisma son el mismo
        obx2.setEdad(34);
        obx2.setNombre("Jose");
        System.out.println(obx2.getNombre() +obx2.getEdad());
        System.out.println(obx1.getNombre() +obx1.getEdad());
        //versión 1.1 del progrma con otra instancia
        Singleton versionInstancia = Singleton.getInstance();
        versionInstancia.setNombre("versión 1.1");



    }
}
