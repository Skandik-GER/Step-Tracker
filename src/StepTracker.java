import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();
    StepTracker(Scanner scan){
        scanner = scan;

        for (int i = 0;i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay(){
        System.out.println("Write number month ");
        int month = scanner.nextInt();
        if (month > 0 && month < 13){
            System.out.println("Write day from 1 to 30");
            int day = scanner.nextInt();
            if (day > 0 && day < 31){
                System.out.println("Write your steps");
                int steps = scanner.nextInt();
                MonthData monthData = monthToData[month - 1];
                monthData.days[day - 1] += steps;
            }
        }

    }
    // Red
    // Пользователь может задать цель меньше либо равную нулю
    void changeStepGoal(){
        System.out.println("CHANGE GOAL:");
        goalByStepsPerDay = scanner.nextInt();
    }

    // Red
    // Программа все ще вылетает с исключением при неправильном вводе месяца
    void  printStatistic(){
        System.out.println("Write Month");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];
        if (month <= 12 && month > 0) {
            monthData.printDaysAndStepsFromMonth();
            System.out.println("TOTTALY STEPS: " + monthData.sumStepsFromMonth());
            System.out.println("MAX STEPS: " + monthData.maxSteps());
            System.out.println("STEPS IN KM: " + converter.convertToKm(monthData.sumStepsFromMonth()));
            System.out.println("KILOCALORIES : " + converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
            System.out.println("BEST SERIES: " + monthData.bestSeries(goalByStepsPerDay));
        }else{
            System.out.println("WRONG MONTH");
        }
    }



}
