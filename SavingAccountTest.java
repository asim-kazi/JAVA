class SavingAccount
{
    private
    static double annualIntrestRate = 10;
    double m_intrest;
    double savingBalance;

    public void MonthlyIntrest(double savingBalance)
    {
        this.savingBalance=savingBalance;
        double ai1=annualIntrestRate/12;
        m_intrest=(savingBalance * ai1);
        System.out.println("Monthly Intrest (10) : "+ m_intrest);
        double modifysalary1 = savingBalance + m_intrest;
        System.out.println("After Monthly Intrest Monthly Salary Is : "+modifysalary1);
    }
    public void modifyIntrestRate(double savingBalance)
    {
        SavingAccount.annualIntrestRate=8;
        this.savingBalance=savingBalance;
        double ai2=annualIntrestRate/12;
        m_intrest=(savingBalance * ai2);
        System.out.println("Monthly Intrest (8) : "+ m_intrest);
        double modifysalary2 = savingBalance + m_intrest;
        System.out.println("After Monthly Intrest Monthly Salary Is : "+modifysalary2);
    }    
}

class SavingAccountTest
{
    public static void main(String[] args) 
    {
        SavingAccount saver1= new SavingAccount();
        saver1.MonthlyIntrest(1000);
        saver1.modifyIntrestRate(1000);
        SavingAccount saver2= new SavingAccount();
        saver2.MonthlyIntrest(5000);
        saver2.modifyIntrestRate(5000);
    }
}