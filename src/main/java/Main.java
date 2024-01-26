public class Main {

    public static void main(String[] args) {
        LoanManager m1 = new LoanManager();
        m1.addLoan("Alice Betsy", 100, 0.1);
        m1.addLoan("Ben Chee", 50, 0.2);
        m1.addLoan("Chris Davis", 30, 0.3);
        m1.setAsPaid("Ben Chee");
        m1.listLoans();
        System.out.println("profit from m1: " + m1.calculateProfitEarned());

        LoanManager m2 = new LoanManager();
        m2.addLoan("Alice Betsy", 500, 0.05);
        m2.addLoan("Emily Hee", 25, 0.15);
        m2.setAsPaid("Alice Betsy");
        m2.listLoans();
        System.out.println("profit from m2: " + m2.calculateProfitEarned());
    }

    public static void listLoans() {
        for (int i = 0; i < loansCount; i++) {
            if (!isPaid[i]) {
                System.out.println(borrowers[i] + ": " + amounts[i]);
            }
        }
    }

    public static double calculateProfitEarned() {
        double profit = 0;
        for (int i = 0; i < loansCount; i++) {
            // if the loan was repaid, add the interest to profit
            if (isPaid[i]) {
                profit = profit + (amounts[i] * interestRates[i]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        addLoan("Alice Betsy", 100, 0.1);
        addLoan("Ben Chee", 50, 0.2);
        addLoan("Chris Davis", 30, 0.3);
        setAsPaid("Ben Chee");
        listLoans();
        System.out.println("profit: " + calculateProfitEarned());
        Loan newLoan = new Loan();
    }
}
