public class Main {
    private static final Employee[] employees = new Employee[10];
    private static final int count = 0;

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 21_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 75_000);
        employees[2] = new Employee("Иванова Анна Иванова", 2, 80_000);
        employees[3] = new Employee("Михайлов Михаил Михайлович", 1, 55_750);
        employees[4] = new Employee("Андреев Андрей Андреевич", 3, 45_000);
        employees[5] = new Employee("Петрова Мария Петровна", 3, 20_000);
        employees[6] = new Employee("Олегов Олег Олегович", 4, 79_999);
        employees[7] = new Employee("Соколов Александр Григорьевич", 5, 50_750);
        employees[8] = new Employee("Сидоров Алексей Николаевич", 4, 40_000);
        employees[9] = new Employee("Николаев Николай Николаевич", 5, 50_000);

        printAllEmployees();
        System.out.println("Сумма ЗП всех сотрудников: " + calculateTotalSalary());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя зарплата сотрудниов: " + calculateAverageOfSalaries());
        printAllFullNames();
    }

    //Метод для распечатки ФИО всех сотридников
    private static void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    //Метод для распечатки всех сотрудников
    private static void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    //Метод для расчета суммы затрат на ЗП
    private static double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary();
        }
        return total;
    }

    //Метод для нахождения минимальной ЗП
    private static Employee findEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMinSalary == null || employee.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }
        return employeeWithMinSalary;
    }

    //Метод для нахождения максимальной ЗП
    private static Employee findEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees) {
            if (employeeWithMaxSalary == null || employee.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        return employeeWithMaxSalary;
    }

    //Метод для расчета средней ЗП
    private static double calculateAverageOfSalaries() {
        return (double) calculateTotalSalary() / employees.length;
    }
}