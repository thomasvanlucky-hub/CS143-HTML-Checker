import java.util.*;

public class HTMLManager {
   private Queue<HTMLTag> tags;
   
   private void HTMLManager(Queue<HTMLTag> html) {
      if(html == null) {
         throw new IllegalArgumentException();
      } else {
         this.html = new LinkedList<>();
         for(HTMLTag tag : html) {
            this.html.add(tag);
         }
      }
   }
}
