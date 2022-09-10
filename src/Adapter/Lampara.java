package Adapter;

public class Lampara implements IEnchufable {
  
  boolean isEncendido = false;
  
  @Override
  public void enciende() {
    this.isEncendido = true;
  }
  
  @Override
  public void apga() {
    this.isEncendido = false;
  }
  
  @Override
  public boolean estaEncendido() {
    return isEncendido;
  }
}
