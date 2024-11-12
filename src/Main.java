public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int loanAmount = 1_000_000;
        double annualRate = 9.99;

// 1 год (12 месяцев)
        int monthlyPayment1Year = service.calculate(loanAmount, annualRate, 12);
        System.out.println("Ежемесячный платеж на 1 год: " + monthlyPayment1Year); // ожидаем 87911

// 2 года (24 месяца)
        int monthlyPayment2Years = service.calculate(loanAmount, annualRate, 24);
        System.out.println("Ежемесячный платеж на 2 года: " + monthlyPayment2Years); // ожидаем 46140

// 3 года (36 месяцев)
        int monthlyPayment3Years = service.calculate(loanAmount, annualRate, 36);
        System.out.println("Ежемесячный платеж на 3 года: " + monthlyPayment3Years); // ожидаем 32262
    }
}
