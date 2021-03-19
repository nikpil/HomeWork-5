package par1;

//import java.util.Arrays;

public class InfoPrint {
    public static void main(String[] args) {
        // Первая часть задания
        Worker user = new Worker("Иванов Иван Иваныч. ", "email@mail.ru ", "Страшный специалист. ",
                "+7123456789 ", 30, 30000);
        user.printWorker();


        // Вторая часть задания
        Worker[] arr = new Worker[5];
        arr[0] = new Worker("Сидоров Иван. ","email@mail.ru ", "Страшный специалист. ",
                "+7123456789 ",50 , 80000);
        arr[1] = new Worker("Смирнов Николай Алексеевич. ","email@mail.ru ", "Специалист. ",
                "+7123456789 ",41 , 54000);
        arr[2] = new Worker("Иванов Иван Иваныч. ","email@mail.ru ", "Не специалист. ",
                "+7123456789 ",30 , 33000);
        arr[3] = new Worker("Кочетов Владимир Сергеевич. ","email@mail.ru ", "Специалист. ",
                "+7123456789 ",36 , 47000);
        arr[4] = new Worker("Петушков Сергей Владимирович. ","email@mail.ru ", "Очень специалист. ",
                "+7123456789 ",56 , 60000);

        for (int i=0;i<arr.length; i++){
            if (arr[i].age> 40){
                arr[i].printWorker();
            }
        }
    }

}




