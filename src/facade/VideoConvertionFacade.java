package facade;

import facade.lib.*;

import java.io.File;
import java.util.Scanner;

public class VideoConvertionFacade {
  public File convertVideo() {
    System.out.println("iniciando la conversion...");
    Scanner sc = new Scanner(System.in);
  
    VideoFile file = new VideoFile("video.mp4");
    ICodec sourceCodec = CodecFactory.extract(file);
    ICodec destinationCodec;
    String format = sc.nextLine();
  
    if (format.equals("mp4")) destinationCodec = new OggCompressionCodec();
    else destinationCodec = new MPEG4CompressionCodec();
  
  
    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.read(buffer, destinationCodec);
  
    System.out.println("Ya he terminado");
    
    return (new AudioMixer()).fix(intermediateResult);
  }
}
