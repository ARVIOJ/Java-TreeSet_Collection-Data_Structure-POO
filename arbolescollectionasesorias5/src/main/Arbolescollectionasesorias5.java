package main;

import java.util.Iterator;
import java.util.TreeSet;

/*
headSet ↑
tailSet ↑
contains(BUSCAR) ↑
insertar ↑
imprimir ↑
eliminar ↑  
 */
public class Arbolescollectionasesorias5 {

    public static void main(String[] args) {
        TreeSet<Profesores> TreeProfesores = new TreeSet<>();

        Profesores auxProfesores;

        //insertar, no puede haber datos repetidos
        TreeProfesores.add(new Profesores("Ariel", "Paginas web", 5000.00));
        TreeProfesores.add(new Profesores("Delion", "Artes", 3000.00));
        TreeProfesores.add(new Profesores("Aldair", "Quimica", 3500.00));
        TreeProfesores.add(new Profesores("Cristopher", "Fisica", 3501.00));
        TreeProfesores.add(new Profesores("Lizet", "Cyberseguridad", 5001.00));
        TreeProfesores.add(new Profesores("Danira", "Aplicaciones moviles", 4000.00));
        TreeProfesores.add(new Profesores("Israel", "Estructura de datos", 6000.00));
        TreeProfesores.add(new Profesores("Juan", "Computo en la nube", 2000.00));
        TreeProfesores.add(new Profesores("Maria", "Salud y nutricion", 1999.00));
        TreeProfesores.add(new Profesores("Jocelin", "Computacion", 1000.00));

        //imprimir
        System.out.printf("%nProfesores ordenados%n");
        for (Profesores ProfeActual : TreeProfesores) {
            System.out.println(ProfeActual);
        }

        // ↓↓↓↓↓↓↓ busca una persona ↓↓↓↓↓↓↓   
        Profesores auxBuscar = new Profesores("Israel", "Estructura de datos", 6000.00);

        if (TreeProfesores.contains(auxBuscar) == true) {
            System.out.println("DATOS DEL PROFESOR\n" + auxBuscar.toString());
        } else {
            System.out.println("Esta persona no existe");
        }
        // ↑↑↑↑↑↑↑ busca una persona ↑↑↑↑↑↑↑ 

        // ↓↓↓↓↓↓ Uso de tailSet (devuelve valores mayores a cantidad especificada)↓↓↓↓↓↓
        // Creación del árbol tailSet
        TreeSet<Profesores> tail_set = new TreeSet<Profesores>();

        // Limitación de los valores hasta X
        tail_set = (TreeSet<Profesores>) TreeProfesores.tailSet(new Profesores("Eliud", "algebra", 3002.00));
        // Creamos el iterador
        Iterator iterate;
        iterate = tail_set.iterator();
        // Visualización de los datos del conjunto de árboles
        System.out.println("Los valores resultantes tailSet: ");
        // Iterando a través del tailSet
        while (iterate.hasNext()) {
            System.out.println(iterate.next() + " ");
        }

        // ↑↑↑↑↑↑ Uso de tailSet ↑↑↑↑↑↑
        // ↓↓↓↓↓↓ Uso de headSet (devuelve valores menores a cantidad especificada)↓↓↓↓↓↓
        // Creación del árbol HeadSet
        TreeSet<Profesores> head_set = new TreeSet<Profesores>();
        // Limitación de los valores hasta X
        head_set = (TreeSet<Profesores>) TreeProfesores.headSet(new Profesores("Matus", "mates", 3000.00));
        // Creamos el iterador
        Iterator iterate2;
        iterate2 = head_set.iterator();
        // Visualización de los datos del conjunto de árboles
        System.out.println("Los valores resultantes de head set: ");
        // Iterando a través del HeadSet
        while (iterate2.hasNext()) {
            System.out.println(iterate2.next() + " ");
        }
        // ↑↑↑↑↑↑ Uso de headSet ↑↑↑↑↑↑
        
        // ↓↓↓↓↓↓ Uso de subSet Devuelve una vista de la parte de este conjunto cuyos elementos van desdeElemento, inclusive, hastaElemento, exclusive.↓↓↓↓↓↓
        // Creación del árbol subSet
        System.out.println("Los valores resultantes de sub_Set: ");
        TreeSet<Profesores> sub_Set = new TreeSet<Profesores>();
        // Limitación de los valores hasta X
        sub_Set = (TreeSet<Profesores>) TreeProfesores.subSet(new Profesores("Matus", "mates", 3000.00), new Profesores("dsds", "matdedees", 5000.00));
        System.out.println(sub_Set);
        // ↑↑↑↑↑↑ Uso de subSet ↑↑↑↑↑↑

        //↓↓↓↓↓↓↓ Eliminar profesor ↓↓↓↓↓↓↓
        Profesores auxEliminar = new Profesores("Cristopher", "Fisica", 3501.00);

        if (TreeProfesores.contains(auxEliminar)) {
            TreeProfesores.remove(auxEliminar);
            System.out.println("Profesor eliminado\n" + auxEliminar.toString());
        } else {
            System.out.println("Este Profesor no existe");
        }
        // ↑↑↑↑↑↑↑ Eliminar profesor ↑↑↑↑↑↑↑   
        System.out.println(TreeProfesores);

        //↓↓↓↓ uso de ceiling() ↓↓↓↓ 
        //imprimira new Profesores("Delion", "Artes", 3000.00) porque coincide con 3000.00
        System.out.println(TreeProfesores.ceiling(new Profesores("Cristopher", "Fisica", 3000.00)));

        //↓↓↓↓ uso de descendingSet() ↓↓↓↓ 
        // Devuelve una vista en orden inverso de los elementos contenidos en este conjunto.
        System.out.println(TreeProfesores.descendingSet());

    }

}
