public class Main {
    public static void main(String[] args) {
       task1p1();
       task2p1();
       task3p1();
       task4p1();
       task5p1();
       task6p1();
       task7p1();
       task1p2();
       task2p2();
       task3p2();
       task4p2();
       task5p2();
    }

    public static void task1p1(){
        System.out.println("---task1---");
        int age = 15;
        if (age >= 18){
            System.out.println("Если возраст чеовека равен " + age + ", то он совершеннолетний!");
        }
        else {
            System.out.println("Если возраст чеовека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать!");
        }
        System.out.println();
    }

    public static void task2p1(){
        System.out.println("---task2---");
        int cels = 15;
        if (cels <= 5){
            System.out.println("На улице " + cels + " градусов, нужно надеть шапку!");
        }
        else {
            System.out.println("На улице " + cels + " градусов, можно идти без шапки!");
        }
        System.out.println();
    }

    public static void task3p1(){
        System.out.println("---task3---");
        int speed = 69;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4p1(){
        System.out.println("---task4---");
        int age = 5;
        if (age >= 2 && age <= 6){
            System.out.println("Если возраст ребенка " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст ребенка " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст ребенка " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст ребенка " + age + ", то ему нужно ходить на работу");
        }
        System.out.println();
    }

    public static void task5p1(){
        System.out.println("---task5---");
        int age = 14;
        if (age <= 5){
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        } else if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослого");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе");
        }
        System.out.println();
    }

    public static void task6p1(){
        System.out.println("---task6---");
        int allPeople = 120;
        int seats = 60;
        int people = 61;
        if (people <= 120){
            if (people <= 60){
                System.out.println("В вагоне " + people + ", значит остались только стоячие места");
            }
            else {
                System.out.println("В вагоне " + people + ", значит остались еще сидячие места");
            }
        }
        else {
            System.out.println("В вагоне " + people + ", значит мест в вагоне больше нет!");
        }
        System.out.println();
    }

    public static void task7p1(){
        System.out.println("---task7---");
        int one = 2;
        int two = 3;
        int three = 1;
        if (one >= two){
            if (one >= three){
                System.out.println("one > three");
            }
            else {
                System.out.println("three > one");
            }
            System.out.println("one > two");
        }
        else {
            if (two >= three){
                System.out.println("two > three");
            }
            else {
                System.out.println("three > two");
            }
            System.out.println("two > one");
        }
        System.out.println();
    }

    public static void task1p2(){
        System.out.println("---task1---");
        int clientOS = 1;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        System.out.println();
    }

    public static void task2p2(){
        System.out.println("---task2---");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1){
            if (clientDeviceYear <= 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0){
            if (clientDeviceYear <= 2015){
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        }
        System.out.println();
    }

    public static void task3p2(){
        System.out.println("---task3---");
        int year = 2023;
        if (year >= 1584) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println(year + " - високосный год");
            }
            else {
                System.out.println(year + " - не високосный год");
            }
        }
        System.out.println();
    }

    public static void task4p2(){
        System.out.println("---task4---");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется 1 день для доставки");
        } else if (deliveryDistance > 25 && deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня для доставки");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня для доставки");
        }
        else {
            System.out.println("Доставки нет!");
        }
        System.out.println();
    }

    public static void task5p2(){
        System.out.println("---task5---");
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
}