package Adapter;

public class PowerAdapter implements IEnchufable {
  
  public Ligthbulb lg = new Ligthbulb();
  
  @Override
  public void enciende() {
    lg.turnOn(110);
  }
  
  @Override
  public void apga() {
    lg.turnOff();
  }
  
  @Override
  public boolean estaEncendido() {
    return lg.isPoweredOn();
  }
}
