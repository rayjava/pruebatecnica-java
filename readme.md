# Prueba Técnica Analista Programador Java

## Descripción
Esta prueba técnica está diseñada para evaluar las habilidades y conocimientos de un analista programador Java. La prueba consta de tres partes: ejercicios prácticos yanálisis de código.

## Instrucciones
1. Crear un fork del proyecto.
2. Pasar el enlace del fork una vez finalizado.



### Ejercicio 1: Manipulación de Streams y Lambdas en Java 8
Crea una clase `Employee` con los siguientes atributos:
- `id` (int)
- `name` (String)
- `salary` (double)
- `department` (String)

Luego, implementa una clase `EmployeeService` con los siguientes métodos utilizando Streams y Lambdas:
1. `List<Employee> getEmployeesWithSalaryAbove(double salaryThreshold)`
2. `Map<String, List<Employee>> groupEmployeesByDepartment()`
3. `Optional<Employee> getHighestPaidEmployee()`

### Ejercicio 2: Implementación de un Servicio REST
Crea un servicio REST utilizando Spring Boot que permita gestionar empleados. El servicio debe tener las siguientes funcionalidades:
1. Obtener todos los empleados.
2. Obtener un empleado por su ID.
3. Crear un nuevo empleado.
4. Actualizar un empleado existente.
5. Eliminar un empleado por su ID.


### Ejercicio 3: Corrección de Código
Se proporciona el siguiente código que tiene errores. Encuentra y corrige los errores para que el código funcione correctamente.

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 20));
        System.out.println("Division: " + calculator.divide(10, 0));
    }
}
```
### Ejercicio 4: Anagrama
Implementa un algoritmo en Java que determine si dos palabras son anagramas. Por ejemplo, "coleta" y "Lácteo" son anagramas.

``` java

public class AnagramChecker {
    public static boolean areAnagrams(String word1, String word2) {
        // Implementa el algoritmo aquí
    }

    public static void main(String[] args) {
        String word1 = "coleta";
        String word2 = "Lácteo";
        System.out.println("Are anagrams: " + areAnagrams(word1, word2));
    }
}

```
### Ejercicio 5 : Mejora de código

Dado el siguiente código, que mejorarias del mismo, para mejorar el manejo de cadenas en el algoritmo.

``` java
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        return wordCounts;
    }

    public static void main(String[] args) {
        String text = "hello world hello";
        Map<String, Integer> wordCounts = countWords(text);
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```