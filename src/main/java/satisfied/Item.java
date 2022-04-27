package satisfied;

public enum Item {
  Iron_Ore(100, true),
  Iron_Ingot(100, true),
  Copper_Ore(100, true),
  Copper_Ingot(100, true),
  Caterium_Ingot(100, true),
  Wire(500, true),
  Steel_Ingot(100, true),

  Iron_Rod(200, true),

  Screw(500, true),
  Iron_Plate(200, true),

  Reinforced_Iron_Plate(100, true),
  Modular_Frame(50, true),

  Heavy_Modular_Frame(50, true),

  Copper_Sheet(200, true),
  Plastic(200, true),

  Circuit_Board(200, true),

  Computer(50, true),
  AI_Limiter(100, true),
  High_Speed_Connector(100,true),

  Steel_Pipe(200, true),

  Quickwire(500, true),

  Steel_Beam(200, true),

  Concrete(500, true),
  Encased_Industrial_Beam(100, true),

  Stator(100, true),
  Cable(200, true),

  Automated_Wiring(50, true),

  Adaptive_Control_Unit(50, true),
  Supercomputer(50, true),

  Assembly_Director_System(50, true),

  Sulfuric_Acid(-1, false),
  Alumina_Solution(-1, false),
  Water(-1, false),
  Nitrogen_Gas(-1, false),

  Aluminum_Casing(200, true),
  Aluminum_Ingot(100, true),

  Electromagnetic_Control_Rod(100, true),
  Battery(200, true),
  Versatile_Framework(50, true),

  Magnetic_Field_Generator(50, true),

  Thermal_Propulsion_Rocket(50, true),

  Modular_Engine(50, true),
  Turbo_Motor(50, true),
  Cooling_System(100, true),
  Fused_Modular_Frame(50, true),

  Motor(50, true),
  Rotor(100, true),
  Rubber(200, true),
  Smart_Plating(50, true),

  Radio_Control_Unit(50, true),

  Heat_Sink(100, true),

  Alclad_Aluminum_Sheet(200, true),

  Quartz_Crystal(100, true),
  Crystal_Oscillator(100, true),


  Pressure_Conversion_Cube(50, true),

  Copper_Powder(500, true),
  Nuclear_Pasta(50, true),





  ;

  public final int stack;
  public final boolean solid;

  Item(int stack, boolean solid) {
    this.stack = stack;
    this.solid = solid;
  }

  public ItemFlow R(double count, double rate) {
    return new ItemFlow(this, count, rate);
  }
}
