public class CreditPaymentService {
    public int calculate(int loanAmount, double annualRate, int loanTermMonths) {
        double monthlyRate = annualRate / 12 / 100; // перевод годовой ставки в ежемесячную
        double payment = loanAmount * (monthlyRate / (1 - Math.pow(1 + monthlyRate, -loanTermMonths)));
        return (int) payment; // приведение к целому числу
    }
}