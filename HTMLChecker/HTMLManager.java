import java.util.*;

public class HTMLManager {
   private Queue<HTMLTag> tags;
   
   private void HTMLManager(Queue<HTMLTag> html) {
      if(html == null) {
         throw new IllegalArgumentException();
      } else {
         this.tags = new LinkedList<>();
         for(HTMLTag tag : tags) {
            this.tags.add(tag);
         }
      }
   }
}
