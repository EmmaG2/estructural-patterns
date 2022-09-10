package decorator;


import java.io.PrintWriter;

public class TelefonoBasic implements ITelefono{
  
  @Override
  public void crear() {
    
    tengoGSM();
    tengoSms();
    
  }
  
  private void tengoGSM() {
    System.out.println("Tengo Gsm");
  }
  
  private void tengoSms() {
    System.out.println("tengo sms");
  }
}
