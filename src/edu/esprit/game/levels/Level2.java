package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Level2 {

    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Retourner le nombre des employ�s dont le nom commence avec n */
        long nbr = employees.stream().filter(e -> e.getName().toLowerCase().startsWith("n")).count();
        System.out.println("Le nombre des etudiants dont le nom commence par n est: " + nbr);
        /* TO DO 2: Retourner la somme des salaires de tous les employ�s (hint: mapToInt) */
        long sum = employees.stream().mapToInt(e -> e.getSalary()).sum()/* TO DO 2 */;
        System.out.println("La somme des salaires de tout les employes est: " + sum + " dt");
        /* TO DO 3: Retourner la moyenne des salaires des employ�s dont le nom commence avec s */
        double average = employees.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();/* TO DO 3 */
        System.out.println("la moyenne des salaires des employ�s dont le nom commence avec s est: " + average + " dt");
        /* TO DO 4: Retourner la liste de tous les employ�s  */
        List<Employee> emps = employees.stream().collect(Collectors.toList())/* TO DO 4 */;
        System.out.println("Les liste est: " + emps);
        /* TO DO 5: Retourner la liste des employ�s dont le nom commence par s */
        List<Employee> emps2 = employees.stream().filter(e -> e.getName().toLowerCase().startsWith("s")).collect(Collectors.toList());/* TO DO 5 */;
        System.out.println("la liste des employ�s dont le nom commence par s est: " + emps2);
        /* TO DO 6: Retourner true si il y a au min un employ�s dont le salaire > 1000, false si non
         */
        boolean test = employees.stream().anyMatch(e -> e.getSalary() > 10000);/* TO DO 6 */
        System.out.println("Retourner true si il y a au min un employ�s dont le salaire > 1000: " + test);
        /* TO DO 7: Afficher le premier employ� dont le nom commence avec s avec deux mani�res diff�rentes */
 /*First way*/
        System.out.println("Afficher le premier employ� dont le nom commence avec s aves deux methodes");

        employees.stream().filter(e -> e.getName().toLowerCase().startsWith("s")).findFirst().ifPresent(e -> System.out.println(e));/* TO DO 7 */
 /*Second way*/
        System.out.println("second way");
 employees.stream().filter(e -> e.getName().toLowerCase().startsWith("s")).limit(1).forEach(e-> System.out.println(e));
 
 /* TO DO 8: Afficher le second employ� dont le nom commence avec s */
        System.out.println("le second employ� dont le nom commence avec s : ");
        employees.stream().filter(e -> e.getName().toLowerCase().startsWith("s")).skip(1).findFirst().ifPresent(e -> System.out.println(e));/* TO DO 7 */
    }
}
