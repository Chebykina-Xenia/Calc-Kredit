public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loan_sum = 1_000_000_000;          //сумма кредита
        int period = 2; //срок кредита
        double annual_interest_rate = 9.99;  //годовая процентная ставка по кредиту

        double monthly_payment = service.calculate(loan_sum, period, annual_interest_rate);
        System.out.println(monthly_payment);
    }
}