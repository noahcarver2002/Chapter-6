import java.util.Scanner;

public class CountByThrees {

public static void main(String[] args) {
    countByUserChoice();
}
    public static void countByThrees(){
            System.out.println("printing 3 to 300 how much fun is this!!!");
            for (int i =3; i <= 300; i = i + 3) {
                System.out.print(i + " ");
                if(i % 30 == 0 ){
                    System.out.println();
            }

            }

        }

    public static void countByUserChoice(){
            Scanner input = new Scanner(System.in);
            int userChoice;
            int userChoiceHigh;
            int count = 0;
            System.out.println("user chooses number to count by");
            userChoice = input.nextInt();
            System.out.println("user chooses number to count to must be higher than first number");
            userChoiceHigh = input.nextInt();
            for (int i = 0; i <= userChoiceHigh; i = userChoice + i){
                count = count +1;

                if(count % 10 == 0){
                    System.out.println(i);

                }
                else
                    System.out.print(i + " ");
            }
    }

}
