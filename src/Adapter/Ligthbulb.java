package Adapter;

public class Ligthbulb {
  boolean poweredOn = false;
  int voltaje = 0;
  public void turnOn(int voltaje) {
    poweredOn = true;
    this.voltaje = voltaje;
  }
  
  public void turnOff() {
    poweredOn = false;
    this.voltaje = 0;
  }
  
  public boolean isPoweredOn() {
    return poweredOn;
  }
}
