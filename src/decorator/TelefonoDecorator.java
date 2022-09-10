package decorator;

public class TelefonoDecorator implements ITelefono{
  
  private ITelefono telefono;
  
  public TelefonoDecorator(ITelefono telefono) {
    this.telefono = telefono;
  }
  
  @Override
  public void crear() {
    telefono.crear();
  }
}
