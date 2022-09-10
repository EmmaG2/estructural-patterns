package facade;

import facade.lib.*;

import java.io.File;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    VideoConvertionFacade conversor = new VideoConvertionFacade();
    System.out.println(conversor.convertVideo());
    
  }
}
