import java.util.*;
class Employee {
int id;
String name;
double salary;
public Employee(int id, String name, double salary) {
this.id = id;
this.name = name;
this.salary = salary;
}
public String toString() {
return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
}
}
public class EmployeeManagement {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
List<Employee> employees = new ArrayList<>();
while (true) {
System.out.println("1. Add Employee");

Syst…chId) {
System.out.println("Employee Found: " + emp);
foundSearch = true;
break;
}
}
if (!foundSearch) {
System.out.println("Employee not found!");
}
break;
case 5:
if (employees.isEmpty()) {
System.out.println("No employees found.");
} else {
System.out.println("Employee List:");
for (Employee emp : employees) {
System.out.println(emp);

}
}
break;
case 6:
System.out.println("Exiting program...");
scanner.close();
return;
default:
System.out.println("Invalid choice! Please try again.");
}
}
}
}
