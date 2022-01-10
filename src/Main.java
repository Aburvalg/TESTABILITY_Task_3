public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.calculate(1000000, 9.99, 12);
        double payment2 = service.calculate(1000000, 9.99, 24);
        double payment3 = service.calculate(1000000, 9.99, 36);
        System.out.println("Ваш ежемесячный платеж: " + payment1 + "рублей");
        System.out.println("Ваш ежемесячный платеж: " + payment2 + "рублей");
        System.out.println("Ваш ежемесячный платеж: " + payment3 + "рублей");
    }
}
