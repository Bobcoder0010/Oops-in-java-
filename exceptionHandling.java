class MainBalanceException extends Exception {

    public MainBalanceException() {
        System.out.println("Balance is low");
    }
}

class UserDefinedExample {
    public static void main(String[] args) {
        try {
            int acc[] = { 100, 101, 102, 103, 104, 105, 106 };
            double balance[] = { 900, 200, 1500, 1765.50, 3000 };
            for (int i = 0; i < 6; i++) {
                System.out.println("Account No: " + acc[i] + "" + "Balance :" + balance[i]);
                if (balance[i] < 1000) {
                    throw new MainBalanceException();
                }
            }
        } catch (MainBalanceException e) {
            System.out.print("exception");
        }
    }
}