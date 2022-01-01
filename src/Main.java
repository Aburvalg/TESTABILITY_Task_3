public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double pay = 0;
        double payment = service.calculate(pay);
        System.out.println("Ваш ежемесячный платеж: " + payment + "рублей");
    }
}
