package trees.employee_tree;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

import static trees.employee_tree.Position.*;
import static trees.employee_tree.Position.DEV;

@Builder
@AllArgsConstructor
@Getter
public class Employee {

    private String name;
    private Position position;
    private int salary;
    private Employee boss;
    private ArrayList<Employee> employees;

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public static Employee createDefaultEmployeeTree() {
        Employee ceo = Employee.builder().name("Lara").salary(100_000_000).position(CEO).boss(null).build();

        // children siblings.
        Employee manager1 = Employee.builder().name("Morena").salary(10_000).position(MANAGER).boss(ceo).build();
        Employee manager2 = Employee.builder().name("Bedan").salary(10_000).position(MANAGER).boss(ceo).build();

        ceo.addEmployee(manager1);
        ceo.addEmployee(manager2);

        // leaf
        Employee dev1 = Employee.builder().name("Andrey").salary(100).position(DEV).boss(manager1).build();
        Employee dev2 = Employee.builder().name("Georgia").salary(100).position(DEV).boss(manager1).build();
        Employee dev3 = Employee.builder().name("Bevis").salary(100).position(DEV).boss(manager2).build();
        Employee dev4 = Employee.builder().name("Morias").salary(100).position(DEV).boss(manager2).build();

        manager1.addEmployee(dev1);
        manager1.addEmployee(dev2);

        manager2.addEmployee(dev3);
        manager2.addEmployee(dev4);

        return ceo;
    }
}
