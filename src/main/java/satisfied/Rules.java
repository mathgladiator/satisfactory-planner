package satisfied;

import java.util.ArrayList;
import java.util.HashMap;

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


    solo_outputs = new HashMap<>();

    for (Rule rule : _all) {
      if (rule.outputs.length == 1) {
        solo_outputs.put(rule.outputs[0].item, rule);
      }
    }

    all = _all.toArray(new Rule[_all.size()]);
  }

  public void totalInto(Item item, int count, HashMap<Item, Integer> accumulator) {
    {
      // account for the ask
      Integer v = accumulator.get(item);
      if (v == null) {
        v = 0;
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
          return;
      }
      System.err.println("Failed finding: " + item);
    }
  }
}
