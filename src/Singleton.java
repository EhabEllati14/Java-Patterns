import java.util.Arrays;
import java.util.Collections;

public class Singleton {
   String [] letters= {"a", "b", "c", "d", "e", "f", "g", "h"};
  String [] arr = new String[8];
  private static Singleton instance ;
  public static Singleton getInstance() {
      if(instance == null) {
          synchronized (Singleton.class) {
              if (instance == null) {
                  instance = new Singleton();
              }
              return instance;
          }
      }
      return instance;
  }
 private Singleton(){
    Collections.shuffle(Arrays.asList(letters));
  }
  public void printstr(){
        for (String iteam: letters){
            System.out.print(iteam+" ");
        }
   System.out.println();
    }
}
