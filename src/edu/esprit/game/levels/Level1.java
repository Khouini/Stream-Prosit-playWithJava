package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Afficher tous les employ�s */
        System.out.println("TO DO 1: Afficher tous les employ�s");
        employees.stream().forEach((t) -> System.out.println(t));

        /*
		 * TO DO 2: Afficher les employ�s dont le nom commence par la lettre n
         */
        System.out.println("TO DO 2: Afficher les employ�s dont le nom commence par la lettre n");
        employees.stream().filter((t) -> t.getName().toLowerCase().startsWith("n")).forEach((t) -> System.out.println(t));

        /*
		 * TO DO 3: Afficher les employ�s dont le nom commence par la lettre n
		 * et le salaire> 1000
         */
        System.out.println("TO DO 3: Afficher les employ�s dont le nom commence par la lettre n\n"
                + "		 * et le salaire> 1000");
        employees.stream().filter((t) -> t.getName().toLowerCase().startsWith("n")).filter((t) -> t.getSalary() > 1000)
                .forEach((t) -> System.out.println(t));

        /*
		 * TO DO 4: Afficher les employ�s dont le nom commence par la lettre s
		 * tri�s par salaire
         */
        System.out.println("TO DO 4: Afficher les employ�s dont le nom commence par la lettre s\n"
                + "		 * tri�s par salaire");
        employees.stream().filter((t) -> t.getName().toLowerCase().startsWith("n")).sorted((t1, t2) -> t1.getSalary() - t2.getSalary())
                .forEach((t) -> System.out.println(t));

        System.out.println("TO DO 5: Afficher les noms des employ�s dont le salaire > 600 avec 2\n"
                + "		 * mani�res diff�rentes");
        /*
		 * TO DO 5: Afficher les noms des employ�s dont le salaire > 600 avec 2
		 * mani�res diff�rentes
         */
 /* First Way */
        System.out.println("first way");
        employees.stream().filter((e) -> e.getSalary() > 600).forEach((t) -> System.out.println(t.getName()));
        /* Second Way */
        System.out.println("second way");
        employees.stream().filter((e) -> e.getSalary() > 600).map((e) -> e.getName())
                .forEach((t) -> System.out.println(t));

        /*
		 * TO DO 6: Ajouter 200 D pour les employ�s dont le nom commence avec m
		 * et les affich�s ensuite
         */
        System.out.println("tpdp6");
        employees.stream().filter((e) -> e.getName().toLowerCase().startsWith("m"))
                .forEach((e) -> {
                    e.setSalary(e.getSalary() + 200);
                    System.out.println(e);
                });

    }
}
