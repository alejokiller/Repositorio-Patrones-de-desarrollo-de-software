/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronesEstructurales.Facade;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
  
      rectangle = new Rectangle();
    
   }

 
   public void drawRectangle(){
      rectangle.draw();
   }
  
}