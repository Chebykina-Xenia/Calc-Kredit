public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loanSum = 1_000_000;          //сумма кредита
        int period = 3; //срок кредита в годах
        double annualInterestRate = 9.99;  //годовая процентная ставка по кредиту
        //расчёт ежемесячной выплаты
        double monthlyPayment = service.calculate(loanSum, period, annualInterestRate);

        System.out.println(Math.floor(monthlyPayment));
    }
}