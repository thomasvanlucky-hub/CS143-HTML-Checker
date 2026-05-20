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
   
   public Queue<HTMLTag> getTags() { 
      return this.tags;
   }
   
   public String toString() {
      String result = "";
      int size = tags.size();
      
      for(int i = 0; i < size; i++) {
         HTMLTag tag = tags.remove();
         result = tag.toString().trim();
         tags.add(tag);
      }
      
      return result;
   }
   
   public void fixHTML() {
      Stack<HTMLTag> stack = new Stack<>();
      Queue<HTMLTag> fixedHTML = new LinkedList<>();
      int size = tags.size();
            
      for(int i = 0; i < size; i++) {
         HTMLTag tag = tags.remove();
         
         if(tag.isSelfClosing()) {
            fixedHTML.add(tag);
         } 
      }
   }
}
