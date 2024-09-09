//R лишние импорты лучше удалять
import java.util.Scanner;

public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth(){
        for(int i = 0;i < days.length;i++){
            System.out.println((i + 1) + " Day: " + days[i]);
        }
    }
    int sumStepsFromMonth(){
        int sumStep = 0;
        for(int i = 0;i < days.length;i ++){
            sumStep += days[i];
        }
        return sumStep;
    }
    int maxSteps(){
        int maxSteps = 0;
        for(int i = 0;i < days.length;i++){
            if (days[i] > maxSteps ){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }
    //G алгоритм работает исправно при любых случаях, замечательно реализовано!:)
    int bestSeries(int goalByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0;i < days.length;i++){
            if (days[i] >= goalByStepsPerDay) {
                currentSeries += 1;
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
            }else{
                currentSeries = 0;
            }
        }
        return finalSeries;
    }
}
