import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Input JSON-like structure
        Map<String, Double> data = new LinkedHashMap<>();
        data.put("amount1", 92.67300);
        data.put("amount2", 93.40200);
        data.put("amount3", 22605.08340);
        data.put("amount4", 428256.35425);
        data.put("amount5", 73.14900);

        // Round each value to 2 decimal places
        Map<String, Double> roundedData = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            double roundedValue = BigDecimal.valueOf(entry.getValue())
                    .setScale(2, RoundingMode.DOWN)
                    .doubleValue();
            roundedData.put(entry.getKey(), roundedValue);
        }

        // Print rounded JSON-like structure
        System.out.println(roundedData);
        BigDecimal number = new BigDecimal("93.40900");
        System.out.println("HALF_UP: " + number.setScale(2, RoundingMode.DOWN));
        System.out.println(new BigDecimal("93.90").subtract(new BigDecimal("90.10")).abs());
    }
}