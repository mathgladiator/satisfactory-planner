import satisfied.Item;
import satisfied.Rules;

import java.util.HashMap;
import java.util.Map;

public class Tool {

  public static void main(String[] args) {
    Rules rules = new Rules();
    HashMap<Item, Integer> request = new HashMap<>();
    rules.totalInto(Item.Assembly_Director_System, 4000, request);

    System.out.println("Item,Total,Industrial Storage");
    for (Map.Entry<Item, Integer> part : request.entrySet()) {
      int slots = (int) Math.ceil(part.getValue() / (1.0 * part.getKey().stack));
      int industrial = slots / 48;

      System.out.println(part.getKey() + "," + part.getValue() + "," + industrial);
    }
  }
}
