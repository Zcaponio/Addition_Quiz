import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Zack on 2017-09-24.
 */
public class AdditionQuiz {
    public static void main(String[] args) {

        HashSet<Integer> wrongAnswers = new HashSet<Integer>();
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);

        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int answer = input.nextInt();
        wrongAnswers.add(answer);

        // while the answer isn't correct ask user to keep trying
        while (num1 + num2 != answer) {
            System.out.println("Wrong answer. Try again. What is " + num1 + " + " + num2 + " ?");
            answer = input.nextInt();
            checkGuess(answer, wrongAnswers);
            wrongAnswers.add(answer);
        }
        System.out.println("You got it!!!");
    }

        //check if set contains already answers already guessed
        public static void checkGuess(int answer, HashSet wrongansweer){
            if(wrongansweer.contains(answer)){
                System.out.println("alredy guessed " + answer);
            }
    }
}

