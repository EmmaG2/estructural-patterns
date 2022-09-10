package decorator;

public class Main {
  public static void main(String[] args) {
    TelefonoBasic tb = new TelefonoBasic();
//    tb.crear();
    
    TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasic());
    
    TelefonoNextGen tng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasic()));
    tng.crear();
  }
}
