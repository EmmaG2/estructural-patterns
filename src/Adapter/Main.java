package Adapter;

public class Main {
  public static void main(String[] args) {
    Horno h = new Horno();
    Lampara l = new Lampara();
    PowerAdapter bulb = new PowerAdapter();
  
    enciende(h);
    enciende(l);
    enciende(bulb);
  }
  
  public static void enciende(IEnchufable enchufable) {
    enchufable.enciende();
  }
  
  public static void apaga(IEnchufable enchufable) {
    enchufable.apga();
  }
  
  public static boolean estaEncendido(IEnchufable enchufable) {
    return enchufable.estaEncendido();
  }
}
