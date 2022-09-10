package Adapter;

public class Horno implements IEnchufable {
  
  boolean encendido = false;
  
  @Override
  public void enciende() {
    encendido = true;
  }
  
  @Override
  public void apga() {
    encendido = false;
  }
  
  @Override
  public boolean estaEncendido() {
    return false;
  }
}
