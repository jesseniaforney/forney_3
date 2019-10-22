public class forney_p2 {
    private static double annualInterestRate;

    private double savingsBalance;

    public void calculateMonthlyInterest()
    {
        savingsBalance += (savingsBalance * annualInterestRate / 12.0);
    }

    public static void setInterestRate(double rate)
    {
        annualInterestRate = rate;
    }

    public void setSavingsBalance(double balance)
    {
        savingsBalance = balance;
    }

    public forney_p2(double balance)
    {
        setSavingsBalance(balance);
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }
}

/* TestSavings.java */
class TestSavings
{
    public static void main(String [] arg) {
        forney_p2 saver1 = new forney_p2(2000.0);
        forney_p2 saver2 = new forney_p2(3000.0);

        forney_p2.setInterestRate(0.04); // set to 4%

        int i;


        System.out.println("Savings Account Balances");

        System.out.format("%-8s %9s %9s\n", "Month", "Saver1", "Saver2");

        for(i = 0; i < 13; i ++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.format("%-8d %9.2f %9.2f\n", i + 1,
                    saver1.getSavingsBalance(),
                    saver2.getSavingsBalance() );

            if(i == 11)
            { //change rate after 12th iteration
                forney_p2.setInterestRate(0.05);
            }
        }

    }
}