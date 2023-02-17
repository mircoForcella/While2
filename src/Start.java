import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String checkCommand;
        do{
            System.out.println("Write command :");
            checkCommand = input.nextLine();
            System.out.printf("Input command is: %s \n", checkCommand);
        }while(!checkCommand.equals("stop"));

        /*while (true) {
            System.out.println("Number: ");
            int userInt = input.nextInt();
            input.nextLine();
            System.out.println("Please enter a command: ");
            String checkStop = input.nextLine();
            System.out.println(checkStop);
            if (checkStop == "stop") break;
        }*/
    }
}

