public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Вонави Нави", 1, 50000);
        employees[1] = new Employee("Годжо Сатору", 2, 60000);
        employees[2] = new Employee("Сергей Талант", 3, 55000);
        employees[3] = new Employee("Быкова Наталия", 1, 70000);
        employees[4] = new Employee("Пиндер Кингви", 4, 45000);
        employees[5] = new Employee("Спардович Дэнчик", 5, 30000);
        employees[6] = new Employee("Мотивированный Виталик", 2, 80000);
        employees[7] = new Employee("Меривезер Санс", 3, 99999);
        employees[8] = new Employee("Щебень Толик", 4, 40000);
        employees[9] = new Employee("Неко Арк", 1, 1000000000);

        System.out.println("Все сотрудники:");
        Employee.printAllEmployees(employees);

        System.out.println("\nСумма затрат на зарплату в месяц: " + Employee.calculateTotalSalary(employees));
        Employee minSalaryEmployee = Employee.findEmployeeWithMinSalary(employees);
        System.out.println("\nСотрудник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = Employee.findEmployeeWithMaxSalary(employees);
        System.out.println("\nСотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        System.out.println("\nСреднее значение зарплат: " + Employee.calculateAverageSalary(employees));

        System.out.println("\nФИО всех сотрудников:");
        Employee.printEmployeeNames(employees);
    }
}