package mvc;

public class ModelController {
   private Model model;
   private ModelView view;

   public ModelController(Model model, ModelView view){
      this.model = model;
      this.view = view;
   }

   public void setModelName(String name){
      model.setName(name);		
   }

   public String getModelName(){
      return model.getName();		
   }

   public void setModelRollNo(String rollNo){
      model.setRollNo(rollNo);		
   }

   public String getModelRollNo(){
      return model.getRollNo();		
   }

   public void updateView(){				
      view.printModelDetails(model.getName(), model.getRollNo());
   }	
}
