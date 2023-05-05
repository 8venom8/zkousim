import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //PROMĚNNÉ
         String item;
         item = "Trekové boty Sedmimílovky";

         int quantity;
         quantity = 3;

        double weight;
         weight = 0.45;

         BigDecimal pricePerPiece;
         pricePerPiece = BigDecimal.valueOf(1800);

        LocalDate date;
        date = LocalDate.of(2023,5,5);

         boolean isDiscounted;
         isDiscounted = true;

         quantity = 2;

         pricePerPiece = BigDecimal.valueOf(1990);

         LocalDate dateOfIssues;
         dateOfIssues = date;

        // TODO Vypiš všechny položky
        for (int i = 1; i <= quantity; i++) {
            System.out.println(item);
        }

         /* TODO Vypočti a vypiš na obrazovku celkovou cenu zásilky — vynásob cenu jednoho
             kusu celkovým počtem kusů a vypiš výsledek na obrazovku.*/

        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        /* vytvořím novou proměnou totalPrice, potom cenu(pricePerPiece) vynásobím proměnou quantity
        která je převedená na BigDecimal. Multiply je jako *. Takže výsledek je 1990*2=3980 */


        // TODO Uprav výpočet celkové ceny: k celkové ceně zásilky přičti cenu dopravy 45 Kč.

        totalPrice = totalPrice.add(BigDecimal.valueOf(45)); //add slouží jako plus? Takže sčítám 3980 + 45(doprava)

        System.out.println("Celková cena zásilky: " + totalPrice + " Kč");
        System.out.println("Hmotnost zásilky je: " + weight * quantity);


        //NÁROK NA SLEVU
        if (isDiscounted) {

            System.out.println("Máte nárok na slevu:");
            double sleva = 0.15; //0.15
            BigDecimal vypocetSlevy = totalPrice.multiply(BigDecimal.valueOf(sleva)); //totalPrice * 0.15
            System.out.println("Sleva je: " + vypocetSlevy + " Kč");

            BigDecimal cenaPoSleve = totalPrice.subtract(vypocetSlevy);
            System.out.println("Cena po slevě: " + cenaPoSleve + " Kč");
        } else {
            System.out.println(totalPrice);
        }


    }
}