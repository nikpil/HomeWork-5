package par1;

public class Worker {
    private String name;
    private String email;
    private String position;
    private String telephone;
    private String salary;
    private int age;

    public Worker(String name, String email, String position, String telephone, int age, String salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void printWorker() {
        System.out.println("Имя сотрудника: " + name + "Возраст: " + age);
        System.out.println("Email: " + email+ "Телефон: "+ telephone);
        System.out.println("Должность: " + position+ "Зарплата: "+ salary);
    }
}

