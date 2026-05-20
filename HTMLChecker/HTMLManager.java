import java.util.*;

public class HTMLManager {
   private Queue<HTMLTag> tags;
   
   public HTMLManager(Queue<HTMLTag> html) {
      if(html == null) {
         throw new IllegalArgumentException();
      } else {
         this.tags = new LinkedList<>();
         for(HTMLTag tag : html) {
            this.tags.add(tag);
         }
      }
   }
   
   private Queue<HTMLTag> getTags() { 
      return this.tags;
   }
   
   
}
