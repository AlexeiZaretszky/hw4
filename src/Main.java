public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");


        }

        //Задание 2

        int productionYear = 2015;
        int clientDeviceYear = 2018;
        if (clientDeviceYear < productionYear) {
            System.out.println("Установите облекчёную версию для ");
        } else {
            System.out.println("Установите версию приложения для ");
            if (clientOS == 1) {
                System.out.println("Андройд по ссылке ");
            } else {
                System.out.println("IOS по ссылке ");
            }



            //Задание 3
            int year = 2022;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " Год является висакосным");
            } else {
                System.out.println(year + " Год не является високосным");
            }


        }


        //Задани 4


        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval ) / (double) interval);
            System.out.println("Потребуеться дней  " + deliveryDistance);
        }


        //Задание 5


        int monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца неь");


        }





    }}


