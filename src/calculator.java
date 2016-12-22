import java.util.Scanner;

class Calculator{
    public static void main(String[] args)
    {
        System.out.println("Welcome to CSC 210 Calculator by Bob the Builder!");
        System.out.println("Enter an integer operation: ");

    Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String operation= input.next();
        int y = input.nextInt();

            while(x + y != 0){

        if(operation.equals("+")){
            System.out.println(x + y);
        }

        else if(operation.equals("-")){
            System.out.println(x - y);
        }

        else if(operation.equals("*")){
            System.out.println(x * y);
        }   

        else if(operation.equals("/")){
            System.out.println(x / y);
        }

        else if(operation.equals("%")){
            System.out.println(x % y + y);
        }


        else {
            System.out.println("Operation is invalid.");
        }


                System.out.println("Enter an integer operation: ");
                if(x + y != 0);
                                break;
        }
    }
}
