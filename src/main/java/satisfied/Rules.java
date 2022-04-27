package satisfied;

import javax.management.remote.rmi.RMIConnectionImpl_Stub;
import java.util.*;

public class Rules {

  public final Rule[] all;

  public final HashMap<Item, Rule> solo_outputs;

  public Rules() {
    ArrayList<Rule> _all = new ArrayList<>();

    _all.add(Rule.start() //
        .out(Item.Assembly_Director_System.R(1, 0.75)) //
        .in(Item.Adaptive_Control_Unit.R(2, 1.5)) //
        .in(Item.Supercomputer.R(1, 0.75)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Adaptive_Control_Unit.R(1, 1.0)) //
        .in(Item.Automated_Wiring.R(15, 7.5)) //
        .in(Item.Circuit_Board.R(10, 5)) //
        .in(Item.Heavy_Modular_Frame.R(2, 1)) //
        .in(Item.Computer.R(2, 1)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Automated_Wiring.R(1, 2.5)) //
        .in(Item.Stator.R(1, 2.5)) //
        .in(Item.Cable.R(20, 50)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Circuit_Board.R(1, 7.5)) //
        .in(Item.Copper_Sheet.R(2, 15)) //
        .in(Item.Plastic.R(4, 30)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Computer.R(1, 2.5)) //
        .in(Item.Circuit_Board.R(10,25)) //
        .in(Item.Cable.R(9, 22.5)) //
        .in(Item.Plastic.R(18, 45)) //
        .in(Item.Screw.R(52, 130)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Cable.R(1, 30)) //
        .in(Item.Wire.R(2, 60)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Screw.R(4, 40)) //
        .in(Item.Iron_Rod.R(1, 10)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Iron_Rod.R(1, 15)) //
        .in(Item.Iron_Ingot.R(1, 15)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Supercomputer.R(1, 1.88)) //
        .in(Item.Computer.R(2, 3.75)) //
        .in(Item.AI_Limiter.R(2, 3.75)) //
        .in(Item.High_Speed_Connector.R(3, 5.63)) //
        .in(Item.Plastic.R(28, 52.5)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Copper_Sheet.R(1, 10)) //
        .in(Item.Copper_Ingot.R(2, 20)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Encased_Industrial_Beam.R(1, 6)) //
        .in(Item.Steel_Beam.R(4, 24)) //
        .in(Item.Concrete.R(5, 30)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Modular_Frame.R(2, 2)) //
        .in(Item.Reinforced_Iron_Plate.R(3, 3)) //
        .in(Item.Iron_Rod.R(12, 12)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Reinforced_Iron_Plate.R(1, 5)) //
        .in(Item.Iron_Plate.R(6, 30)) //
        .in(Item.Screw.R(12, 60)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Heavy_Modular_Frame.R(1, 2)) //
        .in(Item.Modular_Frame.R(5, 10)) //
        .in(Item.Encased_Industrial_Beam.R(5, 10)) //
        .in(Item.Screw.R(100, 200)) //
        .in(Item.Steel_Pipe.R(15, 30))
        .make());

    _all.add(Rule.start() //
        .out(Item.Stator.R(1, 5)) //
        .in(Item.Steel_Pipe.R(3, 15)) //
        .in(Item.Wire.R(8, 40)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Wire.R(2, 30)) //
        .in(Item.Copper_Ingot.R(1, 15)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.AI_Limiter.R(1, 5)) //
        .in(Item.Copper_Sheet.R(5, 25)) //
        .in(Item.Quickwire.R(20, 100)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.High_Speed_Connector.R(1, 3.75)) //
        .in(Item.Quickwire.R(56, 210)) //
        .in(Item.Cable.R(10, 37.5)) //
        .in(Item.Circuit_Board.R(1, 3.75)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Steel_Pipe.R(2, 20)) //
        .in(Item.Steel_Ingot.R(3, 30)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Iron_Plate.R(2, 20)) //
        .in(Item.Iron_Ingot.R(3, 30)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Quickwire.R(5, 60)) //
        .in(Item.Caterium_Ingot.R(1, 12)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Steel_Beam.R(1, 15)) //
        .in(Item.Steel_Ingot.R(4, 60)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Electromagnetic_Control_Rod.R(2, 4)) //
        .in(Item.Stator.R(3, 6)) //
        .in(Item.AI_Limiter.R(2, 4)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Versatile_Framework.R(2, 5)) //
        .in(Item.Modular_Frame.R(1, 2.5)) //
        .in(Item.Steel_Beam.R(12, 30)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Magnetic_Field_Generator.R(2, 1)) //
        .in(Item.Versatile_Framework.R(5, 2.5)) //
        .in(Item.Electromagnetic_Control_Rod.R(2, 1)) //
        .in(Item.Battery.R(10, 5)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Battery.R(1, 20))
        .in(Item.Sulfuric_Acid.R(2.5, 50)) //
        .in(Item.Alumina_Solution.R(2, 40)) //
        .in(Item.Aluminum_Casing.R(1, 20)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Aluminum_Casing.R(2, 60)) //
        .in(Item.Aluminum_Ingot.R(3, 90)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Heat_Sink.R(1, 7.5)) //
        .in(Item.Alclad_Aluminum_Sheet.R(5, 37.5)) //
        .in(Item.Copper_Sheet.R(3, 22.5)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Alclad_Aluminum_Sheet.R(3, 30)) //
        .in(Item.Aluminum_Ingot.R(3, 30)) //
        .in(Item.Copper_Ingot.R(1, 10)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Rotor.R(1, 4)) //
        .in(Item.Iron_Rod.R(5, 20)) //
        .in(Item.Screw.R(25, 100)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Motor.R(1, 5)) //
        .in(Item.Rotor.R(2, 10)) //
        .in(Item.Stator.R(2, 10)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Modular_Engine.R(1, 1)) //
        .in(Item.Motor.R(2, 2)) //
        .in(Item.Rubber.R(15, 15)) //
        .in(Item.Smart_Plating.R(2, 2)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Smart_Plating.R(1, 2)) //
        .in(Item.Reinforced_Iron_Plate.R(1, 2)) //
        .in(Item.Rotor.R(1, 2)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Thermal_Propulsion_Rocket.R(2, 1)) //
        .in(Item.Modular_Engine.R(5, 2.5)) //
        .in(Item.Turbo_Motor.R(2, 1)) //
        .in(Item.Cooling_System.R(6, 3)) //
        .in(Item.Fused_Modular_Frame.R(2, 1)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Turbo_Motor.R(1, 1.875)) //
        .in(Item.Cooling_System.R(4, 7.5)) //
        .in(Item.Radio_Control_Unit.R(2, 3.75)) //
        .in(Item.Motor.R(4, 7.5)) //
        .in(Item.Rubber.R(24, 45)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Cooling_System.R(1, 6)) //
        .in(Item.Heat_Sink.R(2, 12)) //
        .in(Item.Rubber.R(2, 12)) //
        .in(Item.Water.R(5, 30)) //
        .in(Item.Nitrogen_Gas.R(25, 150)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Fused_Modular_Frame.R(1, 1.5)) //
        .in(Item.Heavy_Modular_Frame.R(1, 1.5)) //
        .in(Item.Aluminum_Casing.R(50, 75)) //
        .in(Item.Nitrogen_Gas.R(25, 37.5)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Radio_Control_Unit.R(2, 2.5)) //
        .in(Item.Aluminum_Casing.R(32, 40)) //
        .in(Item.Crystal_Oscillator.R(1, 1.25)) //
        .in(Item.Computer.R(1, 1.25)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Crystal_Oscillator.R(2, 1)) //
        .in(Item.Quartz_Crystal.R(36, 18)) //
        .in(Item.Cable.R(28, 14)) //
        .in(Item.Reinforced_Iron_Plate.R(5, 2.5)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Pressure_Conversion_Cube.R(1, 1)) //
        .in(Item.Fused_Modular_Frame.R(1, 1)) //
        .in(Item.Radio_Control_Unit.R(2, 2)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Copper_Powder.R(5, 50)) //
        .in(Item.Copper_Ingot.R(30, 300)) //
        .make());

    _all.add(Rule.start() //
        .out(Item.Nuclear_Pasta.R(1, 0.5)) //
        .in(Item.Copper_Powder.R(200, 100)) //
        .in(Item.Pressure_Conversion_Cube.R(1, 0.5)) //
        .make());

    solo_outputs = new HashMap<>();

    for (Rule rule : _all) {
      if (rule.outputs.length == 1) {
        solo_outputs.put(rule.outputs[0].item, rule);
      }
    }

    all = _all.toArray(new Rule[_all.size()]);
  }

  public void totalInto(Item item, double count, HashMap<Item, Double> accumulator) {
    {
      // account for the ask
      Double v = accumulator.get(item);
      if (v == null) {
        v = 0.0;
      }
      v += count;
      accumulator.put(item, v);
    }

    Rule rule = solo_outputs.get(item);
    if (rule != null) {
      for (ItemFlow input : rule.inputs) {
        totalInto(input.item, count * input.count, accumulator);
      }
    } else {
      switch (item) {
        case Iron_Ingot:
        case Copper_Ingot:
        case Steel_Ingot:
        case Plastic:
        case Caterium_Ingot:
        case Concrete:
        case Aluminum_Ingot:
        case Sulfuric_Acid:
        case Alumina_Solution:
        case Rubber:
        case Water:
        case Nitrogen_Gas:
        case Quartz_Crystal:
          return;
      }
      System.err.println("Failed finding: " + item);
    }
  }

  public HashMap<Item, Integer> seed(Set<Item> items, int start) {
    HashMap<Item, Integer> initial = new HashMap<>();
    for (Item item : items) {
      initial.put(item, start);
    }
    return initial;
  }

  public double maxTime(HashMap<Item, Double> total, HashMap<Item, Integer> counts) {
    double maxTimeMinutes = -1;
    for (Map.Entry<Item, Double> need : total.entrySet()) {
      Rule rule = solo_outputs.get(need.getKey());
      Integer count = counts.get(need.getKey());
      if (count == null) {
        count = 1;
      }
      if (rule != null) {
        double rate = count * rule.outputs[0].rate; // units per minute
        double minutes = need.getValue() / rate;
        if (minutes > maxTimeMinutes) {
          maxTimeMinutes = minutes;
        }
      }
    }
    return maxTimeMinutes;
  }

  public HashMap<Item, Double> times(HashMap<Item, Double> total, HashMap<Item, Integer> counts) {
    HashMap<Item, Double> report = new HashMap<>();
    for (Map.Entry<Item, Double> need : total.entrySet()) {
      Rule rule = solo_outputs.get(need.getKey());
      Integer count = counts.get(need.getKey());
      if (count == null) {
        count = 1;
      }
      if (rule != null) {
        double rate = count * rule.outputs[0].rate; // units per minute
        double minutes = need.getValue() / rate;
        report.put(need.getKey(), minutes);
      }
    }
    return report;
  }

  public Item[] nextItems(HashMap<Item, Double> total, HashMap<Item, Integer> counts) {
    double current = maxTime(total, counts);
    Item winner = null;
    for (Item consider : total.keySet()) {
      Integer prior = counts.get(consider);
      if (prior == null) {
        prior = 1;
      }
      counts.put(consider, prior + 1);
      double newTime = maxTime(total, counts);
      if (newTime < current) {
        current = newTime;
        winner = consider;
      }
      counts.put(consider, prior);
    }
    if (winner == null) {
      ArrayList<Item> winners = new ArrayList<>();
      for (Map.Entry<Item, Double> consider : times(total, counts).entrySet()) {
        if (consider.getValue() == current) {
          winners.add(consider.getKey());
        }
      }
      if (winners.size() == 0) {
        throw new UnsupportedOperationException();
      }
      return winners.toArray(new Item[winners.size()]);
    }
    return new Item[] { winner };
  }

  public void removeWithoutRules(HashMap<Item, Integer> counts) {
    Iterator<Map.Entry<Item, Integer>> it = counts.entrySet().iterator();
    while (it.hasNext()) {
      if (!solo_outputs.containsKey(it.next().getKey())) {
        it.remove();
      }
    }
  }

  public HashMap<Item, Double> inputs(HashMap<Item, Integer> counts) {
    HashMap<Item, Double> input = new HashMap<>();
    for (Map.Entry<Item, Integer> need : counts.entrySet()) {
      Rule rule = solo_outputs.get(need.getKey());
      if (rule != null) {
        for (ItemFlow in : rule.inputs) {
          Double prior = input.get(in.item);
          if (prior == null) {
            prior = 0.0;
          }
          input.put(in.item, prior + in.rate * need.getValue());
        }
      }
    }
    return input;
  }
}
