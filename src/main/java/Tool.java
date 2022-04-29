import satisfied.Item;
import satisfied.Rules;

import java.util.HashMap;
import java.util.Map;

public class Tool {

  public static void main(String[] args) {
    Rules rules = new Rules();
    HashMap<Item, Double> request = new HashMap<>();
    rules.totalInto(Item.Assembly_Director_System, 4000, request);
    rules.totalInto(Item.Magnetic_Field_Generator, 4000, request);
    rules.totalInto(Item.Thermal_Propulsion_Rocket, 1000, request);
    rules.totalInto(Item.Nuclear_Pasta, 1000, request);


    System.out.println("Item,Total,Industrial Storage");
    for (Map.Entry<Item, Double> part : request.entrySet()) {
      int slots = (int) Math.ceil(part.getValue() / (1.0 * part.getKey().stack));
      int industrial = slots / 48;
      System.out.println(part.getKey() + "," + part.getValue() + "," + industrial);
    }

    System.out.println("----");
    HashMap<Item, Integer> build = rules.seed(request.keySet(), 1);
    System.out.println("Days,Next");
    double cutOff = 24 * 60;
    double time = cutOff * 2;
    while (time > cutOff) {
      time = rules.maxTime(request, build);
      Item[] nextItems = rules.nextItems(request, build);
      if (nextItems == null) {
        System.out.println(time);
        break;
      }
      System.out.print((time / (24 * 60)) + ",");
      for (Item next : nextItems) {
        System.out.print(next + " ");
        build.put(next, build.get(next) + 1);
      }
      System.out.println();
    }

    System.out.println("----");

    rules.removeWithoutRules(build);
    System.out.println("Maker,Count");
    for (Map.Entry<Item, Integer> toBuild : build.entrySet()) {
      System.out.println(toBuild.getKey() + "," + toBuild.getValue());
    }
    System.out.println("----");

    System.out.println("Input,Rate");
    for (Map.Entry<Item, Double> rate : rules.inputs(build).entrySet()) {
      System.out.println(rate.getKey() + "," + rate.getValue());
    }

  }
}
