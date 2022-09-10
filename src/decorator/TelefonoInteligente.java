package decorator;

public class TelefonoInteligente extends TelefonoDecorator {
  public TelefonoInteligente(ITelefono telefono) {
    super(telefono);
  }
  
  @Override
  public void crear() {
    super.crear();
    System.out.println("    -> tengo 4g y soy inteligente");
  }
}
