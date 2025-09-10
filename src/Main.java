import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome To The New School Year!");
        System.out.println("For the following questions please use a number that correlates to the difficulty of your class(Regular,Honors,AP)");
        System.out.println("");

        ArrayList<String> difficultyLevel = new ArrayList<>();
        difficultyLevel.add("Regular");
        difficultyLevel.add("Honors");
        difficultyLevel.add("AP");

        ArrayList<String> letterGrade = new ArrayList<>();
        letterGrade.add("A+");
        letterGrade.add("A");
        letterGrade.add("A-");
        letterGrade.add("B+");
        letterGrade.add("B");
        letterGrade.add("B-");
        letterGrade.add("C+");
        letterGrade.add("C");
        letterGrade.add("C-");
        letterGrade.add("D+");
        letterGrade.add("D");
        letterGrade.add("D-");
        letterGrade.add("E");


        Scanner sc = new Scanner(System.in);
        {
            //Period 1
        System.out.println("Please enter your Period 1 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 2
        System.out.println("Please enter your Period 2 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 3
        System.out.println("Please enter your Period 3 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 4
        System.out.println("Please enter your Period 4 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 5
        System.out.println("Please enter your Period 5 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 6
        System.out.println("Please enter your Period 6 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 7
        System.out.println("Please enter your Period 7 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty = sc.nextInt();
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();



        }
       }
    }