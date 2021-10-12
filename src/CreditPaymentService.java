public class CreditPaymentService {
    public double calculate(int loan_sum, int period, double annual_interest_rate) {

        double monthly_interest_rate = annual_interest_rate / 12 / 100;   //месячная процентная ставка по кредиту
        //String i = String.format("%.3f", monthly_interest_rate);     //месячная процентная ставка по кредиту — округление

        //double i = Double.parseDouble(String.valueOf(monthly_interest_rate).substring(0,3));

        double scale = Math.pow(10, 3);
        double i = Math.round (monthly_interest_rate * scale) / scale;
        int number_periods = period * 12; //количество месяцев

        //коэффициент аннуитета

        double annuity_ratio = ((1+i) * i * number_periods) / (((1+i) * number_periods) - 1);

        //ежемесячный аннуитетный платеж
        double monthly_payment = annuity_ratio * loan_sum;

        return monthly_payment;
    }
}

       /* 2. Коэффициент аннуитета:

        K=i*(1+i)n/(1+i)n-1,

        где:

        K - коэффициент аннуитета,

        i - месячная процентная ставка по кредиту (= годовая ставка/12 месяцев),

        n - количество периодов, в течение которых выплачивается кредит.

        */