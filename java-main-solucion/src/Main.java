import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // Ejecutar ejercicio 1
        System.out.println("Ejecutando Ejercicio 1: Manipulación de Streams y Lambdas en Java 8");
        main.ejercicio1();

        // Ejecutar ejercicio 2
        System.out.println("Ejecutando Ejercicio 2: Corrección de Código");
        main.ejercicio2();

        // Ejecutar ejercicio 3
        System.out.println("Ejecutando Ejercicio 3: Anagrama");
        main.ejercicio3();

        // Ejecutar ejercicio 4
        System.out.println("Ejecutando Ejercicio 4: Mejora de código");
        main.ejercicio4();
    }

    public void ejercicio1() {
        List<Employee> trabajadores = Arrays.asList(
                new Employee(1, "Alice", 70000, "IT"),
                new Employee(2, "Bob", 60000, "HR"),
                new Employee(3, "Charlie", 80000, "IT"),
                new Employee(4, "David", 75000, "Finance"),
                new Employee(5, "Eve", 90000, "HR")
        );

        EmployeeService service = new EmployeeService(trabajadores);

        // Ejecutar métodos de EmployeeService
        System.out.println("Empleados con salario por encima de 75000:");
        service.getEmployeesWithSalaryAbove(75000).forEach(System.out::println);

        System.out.println("\nEmpleados agrupados por departamento:");
        service.groupEmployeesByDepartment().forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        System.out.println("\nEmpleado con mayor salario:");
        Optional<Employee> highestPaid = service.getHighestPaidEmployee();
        highestPaid.ifPresent(System.out::println);
        System.out.println("Resultado del ejercicio 1 ####");
    }

    public void ejercicio2() {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Division: " + calculator.divide(10, 0));
        System.out.println("Resultado del ejercicio 2 ####");
    }

    public void ejercicio3() {

        String word1 = "coleta";
        String word2 = "Lácteo";
        System.out.println("Are anagrams: " + AnagramChecker.areAnagrams(word1, word2));
        System.out.println("Resultado del ejercicio 3 ####");
    }

    public void ejercicio4() {

        String text = "hello world hello";
        Map<String, Integer> wordCounts = WordCounter.countWords(text);
        /*for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/
        wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
        System.out.println("Resultado del ejercicio 4 ####");
    }

}