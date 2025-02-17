import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> empleados;

    public EmployeeService(List<Employee> empleados) {
        this.empleados = empleados;
    }

    public List<Employee> getEmployeesWithSalaryAbove(double salaryThreshold) {
        return empleados.stream()
                .filter(e -> e.getSalary() > salaryThreshold)
                .collect(Collectors.toList());
    }

    public Map<String, List<Employee>> groupEmployeesByDepartment() {
        return empleados.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    public Optional<Employee> getHighestPaidEmployee() {
        return empleados.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    }

    }
