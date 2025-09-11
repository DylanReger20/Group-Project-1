import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome To The New School Year!");
        System.out.println("For the following questions please use a number that correlates to the difficulty of your class(1-Regular,2-Honors,3-AP");
        System.out.println("");

        ArrayList<String> difficultyLevel = new ArrayList<>();


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
        Integer difficulty1 = sc.nextInt();
        difficultyLevel.add(difficulty1);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 2
        System.out.println("Please enter your Period 2 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty2 = sc.nextInt();
        difficultyLevel.add(difficulty2);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 3
        System.out.println("Please enter your Period 3 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty3 = sc.nextInt();
        difficultyLevel.add(difficulty3);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 4
        System.out.println("Please enter your Period 4 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty4 = sc.nextInt();
        difficultyLevel.add(difficulty4);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 5
        System.out.println("Please enter your Period 5 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty5 = sc.nextInt();
        difficultyLevel.add(difficulty5);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 6
        System.out.println("Please enter your Period 6 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty6 = sc.nextInt();
        difficultyLevel.add(difficulty6);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();
            //Period 7
        System.out.println("Please enter your Period 7 class: ");
        String name = sc.nextLine();
        System.out.println("Please enter the difficulty of the class: ");
        Integer difficulty7 = sc.nextInt();
        difficultyLevel.add(difficulty7);
        System.out.println("Now please enter your desired grade for this class: ");
        String grade = sc.nextLine();



        }
       }
    }