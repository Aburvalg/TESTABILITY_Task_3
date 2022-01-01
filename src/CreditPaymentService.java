public class CreditPaymentService {
    public long calculate(double pay) {
        double debt = 1000000; // сумма кредита
        double percent = 9.99; // годовые проценты
        int period = 36; // срок кредита в месяцах

        double percentPerMonth = percent / 100 / 12; // проценты в месяц
        double payment = debt * (percentPerMonth + (percentPerMonth / (Math.pow((1 + percentPerMonth), (period)) - 1)));
        return (long) payment;
    }
}
