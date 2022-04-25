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


  /*

  Versatile_Framewwork(50),
  Electromagnetic_Control_Rod(-1),
  Battery,

  Magnetic_Field_Generator,

  Modular_Engine,
  Turbo_Motor,
  Cooling_System,
  Fused_Modular_Frame,

  Thermal_Propulsion_Rocket,

  Copper_Powder,
  Pressure_Conversion_Cube,

  Nuclear_Pasta,
  */


  ;

  public final int stack;
  public final boolean solid;

  Item(int stack, boolean solid) {
    this.stack = stack;
    this.solid = solid;
  }

  public ItemFlow R(int count, double rate) {
    return new ItemFlow(this, count, rate);
  }
}
