package Practical_Project_6;

public class TaskTwo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Инженер", "ivanov@example.com", "123-456-7890", 50000.0, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Программист", "petrov@example.com", "234-567-8901", 60000.0, 28);
        employees[2] = new Employee("Сидоров Сидор Сидорович", "Аналитик", "sidorov@example.com", "345-678-9012", 55000.0, 35);
        employees[3] = new Employee("Козлова Елена Васильевна", "Дизайнер", "kozlova@example.com", "456-789-0123", 48000.0, 26);
        employees[4] = new Employee("Михайлов Михаил Михайлович", "Менеджер", "mikhailov@example.com", "567-890-1234", 52000.0, 32);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }
}
