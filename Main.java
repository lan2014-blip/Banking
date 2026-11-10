import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] balance=new double[1000];
        String[] names=new String[1000];
        int size=100, option;

        while (true){
            System.out.println("\nWelcome to Codingal banking services:");
            System.out.println("1. Add customer");
            System.out.println("2. Change customer name");
            System.out.println("3. Check account balance");
            System.out.println("4. Update account balance");
            System.out.println("5. Summary of all accounts");
            System.out.println("6. Quit");

            System.out.println("Enter option: ");
            option=sc.nextInt();

            switch(option){
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Customer name:");
                    names[size] = sc.nextLine();

                    System.out.println("Enter opening balance: ");
                    balance[size]=sc.nextDouble();

                    System.out.println("Account created successfully");
                    System.out.println("Account number:" + size);
                    System.out.println("Name:"+names[size]);
                    System.out.println("Balance:" + balance[size]);

                    size ++;
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("Enter account number: ");
                    int index=sc.nextInt();

                    if (index < 100 || index >=size){
                        System.out.println("account number does not exist");
                        break;
                    }
            }
        }
    }
}