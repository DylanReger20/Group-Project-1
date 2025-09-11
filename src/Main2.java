/*(public class Main2 {
    int gpa;
    int x;
    int total;
    int credits;
    int i;
    for (i = 0; i < 7; i++)
    {
        x = 0;
        for (int h = 0; h < 1; h++){
            if (difficultyLevel.get(i) == (1))
            {
                x = 0;
            }
            if (difficultyLevel.get(i) == (2))
            {
                x = 1;
            }
            if (difficultyLevel.get(i) == (3))
            {
                x = 1.5;
            }

            if (letterGrade.get(i).equals("A+"))
            {
                total+=((4.6 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("A"))
            {
                total+=((4.3 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("A-"))
            {
                total+=((4 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("B+"))
            {
                total+=((3.6 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("B"))
            {
                total+=((3.3 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("B-"))
            {
                total+=((3 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("C+))
            {
                total+=((2.6 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("C"))
            {
                total+=((2.3 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("C-"))
            {
                total+=((2 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("D+"))
            {
                total+=((1.6 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("D"))
            {
                total+=((1.3 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("D-"))
            {
                total+=((1 + x) * 5);
                credits+=5;
            }
            if (letterGrade.get(i).equals("F"))
            {
                total+=(0);
                credits+=5;
            }

        }

    }
    GPA = total / credits;
    return GPA;
}
