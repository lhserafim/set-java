package application;

import java.util.*;

//import Entities.Product;
public class Program {
    public static void main(String[] args) {
        // HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
        //Set<String> set = new HashSet<>();

        //TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
        //compareTo do objeto (ou Comparator)
        //Set<String> set = new TreeSet<>();

        //LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
        Set<String> set = new LinkedHashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        set.add("iPhone");
        set.add("Mac");

        set.remove("TV");
        set.removeIf(x -> x.length() >= 4); // expressão lambda
        set.removeIf(x -> x.charAt(0) == 'T'); // expressão lambda

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
        System.out.println("-------------------------------");
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);
        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);
        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}