public class CreditPaymentService {
    public double calculate(int loanSum, int period, double annualInterestRate) {

        double monthlyInterestRate = annualInterestRate / 12 / 100;   //месячная процентная ставка по кредиту
        int numberPeriods = period * 12; //количество месяцев
        double i = Math.pow((1 + monthlyInterestRate), numberPeriods);
        //коэффициент аннуитета
        double annuityRatio = monthlyInterestRate + (monthlyInterestRate / (i - 1));
        //ежемесячный аннуитетный платеж
        double monthlyPayment = annuityRatio * loanSum;

        return monthlyPayment;
    }
}

