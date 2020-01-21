import javax.swing.JFrame;

/**
* Demonstrates using GUI with Pokemon class.
* @author Weirong He
* @since 10/23/2018
*/

public class PokemonfightFrame {
   /** main method.
   * @param args not used
   */
   public static void main(String[ ] args) {
      //setup basic JFrame
      
      JFrame frm = new JFrame("Pokemon");
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Add PokemonPanel object to Frame
      frm.getContentPane().add(new PokemonPanel());
      //Display to screen
      frm.pack();
      frm.setVisible(true);
      
      
      

      
   }
}