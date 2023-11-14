public class Main {
    public static void main(String[] args) {
       task1p1();
       task2p1();
       task3p1();
       task4p1();
       task5p1();
       task6p1();
       task7p1();
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
    }
}