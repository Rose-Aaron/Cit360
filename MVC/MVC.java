package mvc;

public class MVC {

   public static void main(String[] args) {

      Model model  = retrieveModelFromDatabase();

      ModelView view = new ModelView();

      ModelController controller = new ModelController(model, view);

      controller.updateView();

      controller.setModelName("Aaron");

      controller.updateView();
   }

   private static Model retrieveModelFromDatabase(){
      Model model = new Model();
      model.setName("Star");
      model.setRollNo("1");
      return model;
   }
}
