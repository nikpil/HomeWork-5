package par1;

public class Worker {
    private String name;
    private String email;
    private String position;
    private String telephone;
    private int salary;
    int age;   // Александр, изначально переменаая была private. Но пришлось её изменить, т.к. не работает  if (arr[i].age> 40)
               // Как надо было сделать, чтобы переменная была private?

      public Worker(String name, String email, String position, String telephone, int age, int salary) {
        this.name = name;
        this.email = email;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void printWorker() {
        System.out.println("");
        System.out.println("Имя сотрудника: " + name + "Возраст: " + age);
        System.out.println("Email: " + email+ "Телефон: "+ telephone);
        System.out.println("Должность: " + position+ "Зарплата: "+ salary);
        System.out.println("");
    }
}



