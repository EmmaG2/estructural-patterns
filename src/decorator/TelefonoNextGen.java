package decorator;

public class TelefonoNextGen extends TelefonoDecorator {
  public TelefonoNextGen(ITelefono telefono) {
    super(telefono);
  }
  
  @Override
  public void crear() {
    super.crear();
    System.out.println("    -> tengo 4g y soy next gen");
  }
}
