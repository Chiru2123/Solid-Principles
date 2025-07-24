class OpenClosedPrinciple {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Generic Method.");
    }
}

class DebitCardPayment extends OpenClosedPrinciple {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card.");
    }
}

class NetBankingPayment extends OpenClosedPrinciple {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking.");
    }

    public static void main(String[] args) {
        OpenClosedPrinciple debit = new DebitCardPayment();
        debit.makePayment(1500);

        OpenClosedPrinciple netBanking = new NetBankingPayment();
        netBanking.makePayment(3000);
    }
}
