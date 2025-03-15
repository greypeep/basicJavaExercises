import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int[] rightAnswers = {4,2,2,1,2};
    int[] userAnswers = new int[5];
    int count=0;
    System.out.println("A quizz will show up,please input the number of what you believe to be the correct answers");
    String[] questions = {"1.What java variable type would allow us to store in in \"0.2\"","2.In java what will be the result of the operation \"6/2.0\"",
            "3.Having a double variable named cat with the value of 0.1,how do we print \"0.1\",using printf?",
            "4.How can we convert a int into a double?","5.Whats the answer to the universe?"};
    String [][] answers = {{"1->int","2->short","3->byte","4->double"},{"1->3","2->3.0","3->1","4->NaN"},{"1->.printf(\"%.1d\",cat)","2->.printf(\"%.1f\",cat)","3->.printf(%cat)","4->.printf(%f.cat)"},
            {"1->double = int_name","2->double.parseDouble(int_name)","3->int_name.toDouble()","4->Not possible"}, {"1->420","2->42","3->21","4->24"}};
    for (int i = 0; i < 5;i++) {
        System.out.println(questions[i]);
        for (int x =0; x<4;x++) {
            System.out.println(answers[i][x]);
        }
        userAnswers[i]= scanner.nextInt();
        if (userAnswers[i] == rightAnswers[i]) {
            count++;
            System.out.println("You got this one right!");
        } else {
            System.out.println("Failure,do better!!!");
        }
    }
    System.out.print("You got "+count+" answers right!");

        scanner.close();
}
}
