import java.util.*;

class Main {
    public static void main(String[] args) {
        Random randnum = new Random();
        Scanner sc = new Scanner(System.in);
        int randomnumber = randnum.nextInt(100) + 1;
        int count = 0;

        while (true) {
            System.out.println("Hey there! Can you guess the secret number?");
            int playerguess = sc.nextInt();
            count++;

            if (playerguess == randomnumber) {
                System.out.println("Congratulations! You've guessed the correct number.");

                if (count < 5) {
                    System.out.println("Wow, you're a genius! It only took you " + count + " tries.");
                } else {
                    System.out.print("You did it! It took you " + count + " tries.");
                }
                break;
            } else if (playerguess > randomnumber) {
                System.out.println("Nice try! You're getting closer, but the number is a bit lower than your guess.");
            } else {
                System.out.println(
                        "Good attempt! You're getting closer, but the number is a bit higher than your guess.");
            }
        }
    }
}
