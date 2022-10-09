
import java.util.ArrayList;
import java.util.Scanner;

class AccountHolder
{
    int age;
    double income;
    float experience;
    String citizenship;
    boolean eligiblity;

    // default constructor
    AccountHolder(int age, double income, float experience, String citizenship)
    {
        this.age=age;
        this.income=income;
        this.experience=experience;
        this.citizenship=citizenship;
    }

    // checks if the account holder is eligible for a loan or not
    public String eligiblity()         
    {
        if(age>=21 && age<=60 && income>=15000 && experience>=1 && citizenship.equals("India"))
        {
            System.out.println("Account details: ");
            System.out.println("Age: " + this.age);
            System.out.println("Income: " + this.income);
            System.out.println("Experience: " + this.experience);
            System.out.println("Citizenship: " + this.citizenship + "n");
            return "eligible.";
        }
        else
        {
            return "not eligible.";
        }
    }
}

public class Practical_3 
{
    public static void main(String[] args) 
    {
        
        // creating arraylist
        ArrayList<AccountHolder> ah = new ArrayList<>();

        int i=1;

        // loop to add account holder details
        while(i<6)
        {
            System.out.print("\nEnter Details of Account Holder " + i + ":\n");
            System.out.print("Enter age: ");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();

            System.out.print("Enter net monthly income: ");
            double income = input.nextDouble();

            System.out.print("Enter work experience in years: ");
            float experience = input.nextFloat();

            System.out.print("Enter name of your country: ");
            String citizenship = input.next();

            ah.add(new AccountHolder(age, income, experience, citizenship));

            i++;
        }

        // prints if the account is eligible or not and its details if it is eligible
        for(int j=1; j<ah.size()+1; j++)
        {
            System.out.println("\nAccount Holder " + j + " is " + ((AccountHolder) ah.get(j-1)).eligiblity());
        }
        System.out.println("prepared by 21CE153_grisha");
    }
}    

