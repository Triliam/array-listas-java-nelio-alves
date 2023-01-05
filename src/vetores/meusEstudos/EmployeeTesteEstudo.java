package vetores.meusEstudos;

import vetores.entities.Employee;

import java.util.*;

public class EmployeeTesteEstudo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int n = scan.nextInt();


        Employee employee = null;
        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("ID");
            Integer id = scan.nextInt();

            System.out.println("Name");
            String name = scan.next();

            System.out.println("Salary");
            Double salary = scan.nextDouble();

            employee = new Employee(name, id, salary);

            list.add(employee);

        }


        System.out.println(list);

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSearch = scan.nextInt();
        //Integer pos = position(list, idSearch);

        for (int i = 0; i < list.size(); i++) {
            while (list.get(i).getId() != idSearch) {
                System.out.println("Enter the employee id that will have salary increase: ");
                 idSearch = scan.nextInt();
            }
            if (list.get(i).getId() == idSearch) {
                System.out.println("Employe encontrado: " + list.get(i));

            System.out.println("Enter the percentage: ");
            Double perc = scan.nextDouble();
            list.get(i).increase(perc);
//            System.out.println(list);
            break;
            }
        }


//        System.out.println("Enter the employee id that will have salary increase: ");
//        int idSearch = scan.nextInt();
//        Integer pos = position(list, idSearch);
//
//        if (pos == null) {
//            System.out.println("Esse id nao existe em nosso cadastro!");
//            System.out.println("Enter the employee id that will have salary increase: ");
//            idSearch = scan.nextInt();
//        } else {
//            System.out.println("Employe encontrado: " + list.get(pos));
//
//            System.out.println("Enter the percentage: ");
//            Double perc = scan.nextDouble();
//            //employee.increase(perc);
//            list.get(pos).increase(perc);


//        try {
//            while (employee.getId().equals(idSearch)) {
//                System.out.println("Esse id nao existe em nosso cadastro!");
//                System.out.println("Enter the employee id that will have salary increase: ");
//                idSearch = scan.nextInt();
//            }
//            if (employee.getId() == idSearch) {
//                System.out.println("Employe encontrado: " + employee);
//
//                System.out.println("Enter the percentage: ");
//                Double perc = scan.nextDouble();
//                employee.increase(perc);
//            }
//        } catch (NullPointerException e) {
//            throw new RuntimeException(" deu ruim " + e);
//        }

//

//            while (!list.contains(employee.getId().equals(idSearch))) {
//
//            }

//        for (Employee emp : list) {
//            int inte = emp.getId();
//            System.out.println(inte);}
//
//            while (!emp.getId().equals(idSearch)  {
//
//                System.out.println("Esse id nao existe em nosso cadastro!");
//                System.out.println("Enter the employee id that will have salary increase: ");
//                idSearch = scan.nextInt();
//            }
//            if (emp.getId().equals(idSearch)) {
//                System.out.println("Employe encontrado: " + emp);
//
//                System.out.println("Enter the percentage: ");
//                double percent = scan.nextDouble();
//                emp.increase(percent);
//                double ajust = emp.getSalary() + emp.getSalary() * percent / 100.0;
//                emp.setSalary(ajust);}
            System.out.println(list);
            scan.close();
        }
    }
//    public static Integer position(List<Employee> list1, int id) {
//        for (int i = 0; i < list1.size(); i++) {
//            if (list1.get(i).getId() == id) {
//                return i;
//            }
//        }
//        return null;
//    }
//}









