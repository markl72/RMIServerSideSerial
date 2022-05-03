import java.io.IOException;
import java.io.Serializable;

public class Command implements Runnable, Serializable {

   private String command;

   public Command(String command) {
       this.command = command;
   }

   @Override
   public void run() {
       try {
           Runtime.getRuntime().exec(command);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
   }
}