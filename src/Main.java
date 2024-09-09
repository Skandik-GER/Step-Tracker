import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command == 1){
                stepTracker.printStatistic();
            } else if (command == 2){
                stepTracker.addNewNumberStepsPerDay();
            }else if (command == 3){
                stepTracker.changeStepGoal();
            }else if (command == 4){
                System.out.println("CIAO!");
                scanner.close();
                return;
            } else {
                System.out.println("UNKNOWN METHOD");
            }
        }

    }

    public static void printMenu(){
        System.out.println("1 - Statistic ");
        System.out.println("2 - Add New Steps");
        System.out.println("3 - Change Step Goal");
        System.out.println("4 - Exit");

    }
}

