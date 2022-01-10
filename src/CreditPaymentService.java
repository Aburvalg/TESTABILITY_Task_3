public class CreditPaymentService {
    public long calculate(double debt, double percent, int period) { // сумма кредита, годовой процент, срок кредита в месяцах
        double percentPerMonth = percent / 100 / 12; // проценты в месяц
        double payment = debt * (percentPerMonth + (percentPerMonth / (Math.pow((1 + percentPerMonth), (period)) - 1)));
        return (long) payment;
    }
}
