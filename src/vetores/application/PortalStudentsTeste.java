package vetores.application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class PortalStudentsTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Set<Integer> totalA = new HashSet<>();

        System.out.println("COURSE A");
        System.out.println("How many students for couse A? ");
        int nA = scan.nextInt();

        for (int i = 0; i < nA; i++) {
            System.out.println("Student id: " + (i+1));
            int tA = scan.nextInt();
            totalA.add(tA);
        }
        System.out.println("Id students course A: " + totalA);

        Set<Integer> totalB = new HashSet<>();

        System.out.println("COURSE B");
        System.out.println("How many students for couse B? ");
        int nB = scan.nextInt();

        for (int i = 0; i < nB; i++) {
            System.out.println("Student id: " + (i+1));
            int tB = scan.nextInt();
            totalB.add(tB);
        }
        System.out.println("Id students course B: " + totalB);

        Set<Integer> totalC = new HashSet<>();

        System.out.println("COURSE C");
        System.out.println("How many students for couse C? ");
        int nC = scan.nextInt();

        for(int i = 0; i < nC; i++) {
            System.out.println("Student id: " + (i+1));
            int tC = scan.nextInt();
            totalC.add(tC);
        }

        System.out.println("Id students course C: " + totalC);

        Set <Integer> total = new HashSet<>();
        total.addAll(totalA);
        total.addAll(totalB);
        total.addAll(totalC);


        System.out.println("Total students: " + total.size());
        System.out.println("Id students courses: " + total);

        scan.close();
    }
}
