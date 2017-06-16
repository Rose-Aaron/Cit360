public class Runner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(Junit.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println(result.wasSuccessful());
   }
}  	
