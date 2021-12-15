import java.util.*;
public class ProblemI {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int cases  = scan.nextInt(), items, recipes,itemNum, ingredientNum, itemNum2;
      String itemName, yORn = "No", itemName2;
      HashMap<String, Integer> hm = new HashMap<String, Integer>();
      for(int a  = 0; a<cases;a++){
         
         items = scan.nextInt();
         recipes = scan.nextInt();
         
         for(int b = 0; b<items;b++) {
            itemNum = scan.nextInt();
            itemName = scan.next();  
            hm.put(itemName, itemNum);
         }
         for(int c = 0; c<recipes;c++) {
            ingredientNum = scan.nextInt();
            for(int d = 0;d<ingredientNum;d++) {
               itemNum2 = scan.nextInt();
               itemName2 = scan.next();
               if(!hm.containsKey(itemName2)) {
            	   yORn = "No";
               }
               else if(hm.get(itemName2)>=itemNum2){
                  hm.put(itemName2, hm.get(itemName2) - itemNum2);
                  yORn = "Yes";
               }
               else{
                  yORn = "No";
               }
            }
            System.out.println(yORn);
         }
         hm = new HashMap<String, Integer>();
      }
   }
}
