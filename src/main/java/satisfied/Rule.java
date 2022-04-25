package satisfied;

import java.util.ArrayList;

public class Rule {
  public final Facility facility;
  public final ItemFlow[] inputs;
  public final ItemFlow[] outputs;

  public Rule(Facility facility, ItemFlow[] inputs, ItemFlow[] outputs) {
    this.facility = facility;
    this.inputs = inputs;
    this.outputs = outputs;
  }

  public static Builder start() {
    return new Builder();
  }

  public static class Builder {
    private final Facility facility = null;
    private ArrayList<ItemFlow> inputs = new ArrayList<>();
    private ArrayList<ItemFlow> outputs = new ArrayList<>();

    public Builder in(ItemFlow input) {
      this.inputs.add(input);
      return this;
    }

    public Builder out(ItemFlow out) {
      this.outputs.add(out);
      return this;
    }

    private Facility infer() {
      if (facility != null) {
        return facility;
      }
      int countSolid = 0;
      int countLiquid = 0;
      for (ItemFlow in : inputs) {
        if (in.item.solid) {
          countSolid++;
        } else {
          countLiquid++;
        }
      }
      switch (countSolid + "x" + countLiquid) {
        case "1x0":
          return Facility.Constructor;
        case "2x0":
          return Facility.Assembler;
        case "3x0":
        case "4x0":
          return Facility.Manufacturer;
        default:
          throw new UnsupportedOperationException("didn't understand:" + countSolid + "x" + countLiquid);
      }
    }

    public Rule make() {
      return new Rule(infer(), inputs.toArray(new ItemFlow[inputs.size()]), outputs.toArray(new ItemFlow[outputs.size()]));
    }
  }
}
