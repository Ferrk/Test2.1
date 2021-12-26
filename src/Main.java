public class Main {
    public static void main(String[] args) {
        int sumTickets = 2216; // Сумма билета
        int oneMiles = 20;     // 1 миля = 20р
        int totalSum = sumTickets/oneMiles; // Кол-во миль,которые начисляться за сумму билета
        int result = (int)Math.floor(totalSum); // При дробном числе округление в меньшую сторону

        System.out.println(totalSum);
    }
}

