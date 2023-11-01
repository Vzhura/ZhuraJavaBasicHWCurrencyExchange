public class CurrencyExchange {
    public static void main(String[] args) {

        Bank[] banks = new Bank[14];
        banks[0] = new Bank("ПРИВАТБАНК");
        banks[1] = new Bank("Сенс Банк");
        banks[2] = new Bank("Сітібанк");
        banks[3] = new Bank("ІНГ Банк Україна");
        banks[4] = new Bank("Ощадбанк");
        banks[5] = new Bank("Укрексімбанк");
        banks[6] = new Bank("УКРГАЗБАНК");
        banks[7] = new Bank("Райффайзен Банк");
        banks[8] = new Bank("УКРСИББАНК");
        banks[9] = new Bank("ПУМБ");
        banks[10] = new Bank("КРЕДІ АГРІКОЛЬ БАНК");
        banks[11] = new Bank("Південний");
        banks[12] = new Bank("КРЕДОБАНК");
        banks[13] = new Bank("Банк Кредит Дніпро");

        double bestRate = 0.0;
        String bestBanks = "";

        for (int i = 0; i < banks.length; i++) {
            double amountInUAH = banks[i].sellRate;
            if (amountInUAH > bestRate) {
                bestRate = amountInUAH;
                bestBanks = banks[i].name;
            }
        }

        System.out.println("Кращий банк для обміну: " + bestBanks);
        System.out.println("Кращий курс обміну: " + bestRate + " UAH");
    }
}



