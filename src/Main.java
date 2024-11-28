public class Main {
    public static void main(String[] args) {


        // Объявление переменных для входа данных
        // Стоимость билета (руб.)
        int ticketPrice = 13_676;
        // Стоимость одной мили (руб.)
        int priceOneMile = 20;

        // Расчет количества бонусных милей
        int milesReceived = (ticketPrice / priceOneMile);

        // Вывод ответа
        System.out.println("Спасибо за покупку. Количество бонусных милей за покупку: " + milesReceived);

    }




}