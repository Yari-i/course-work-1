public class Employee {
    private static int counter = 1; // Статический счетчик для id
    private final int id; // Уникальный идентификатор сотрудника
    private final String fullName; // ФИО сотрудника
    private int department; // Отдел (1-5)
    private double salary; // Зарплата

    // Конструктор
    public Employee(String fullName, int department, double salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Сеттеры
    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}