package par1;

public class InfoPrint
{
    public static void main(String[] args) {
        Worker user = new Worker("Иванов Иван Иваныч. ","email@mail.ru ", "Страшный специалист. ",
                "+7123456789 ",30 , "За еду. ");
        user.printWorker();
    }
}
