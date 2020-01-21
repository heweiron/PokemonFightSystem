import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 
/**
* Panel for PokemonGUIHeweiron GUI.
* Demonstrates connecting non-gui objects to GUI
*
* @author Weirong He
* @since 05/07/2018
*/
public class PokemonPanel extends JPanel {
   /********* label. ************/
   private JLabel lMsg = new JLabel("");
   /********* label. ************/
   private JLabel lMsg2 = new JLabel("");
   /********* label. ************/   
   private JLabel photoA = new JLabel(" ");
   /********* label. ************/   
   private JLabel photoB = new JLabel(" ");
   /********* label. ************/
   private JLabel lA = new JLabel("");
   /********* label. ************/
   private JLabel lB = new JLabel("");
   /******* button. ****************/
   private JButton bMake1 = new JButton(" Make Pokemon 1                     " 
         + "              ");
   /******* button. ****************/
   private JButton bMake2 = new JButton(" Make Pokemon 2                     " 
         + "              ");
   /******* button. ****************/
   private JButton bFight = new JButton(" Fight ");
   /******* button. ****************/
   private JButton bFast = new JButton("Perform Fast Attack");
   /******* button. ****************/
   private JButton bSpecial = new JButton("Perform Special Attack");
   /******* button. ****************/
   private JButton bPass = new JButton("Pass");
   /******* button. ****************/
   private JButton bFast2 = new JButton("Perform Fast Attack");
   /******* button. ****************/
   private JButton bSpecial2 = new JButton("Perform Special Attack");
   /******* button. ****************/
   private JButton bPass2 = new JButton("Pass");
   /******** String for holding Pokemon for display. */ 
   private String sOut = new String("");
    /****** text are for displaying Pokemon.toString()s. */
   private JTextArea textArea1 = new JTextArea("");
   /****** text are for displaying Pokemon.toString()s. */
   private JTextArea textArea2 = new JTextArea("");
   /****** text are for displaying Pokemon1 static. */
   private JTextArea textAreaA = new JTextArea("");
   /****** text are for displaying Pokemon2 static. */
   private JTextArea textAreaB = new JTextArea("");
   /****** text are for displaying Pokemon fight infomation. */
   private JTextArea textAreaF = new JTextArea("");
   /****** text are for displaying Pokemon fight infomation. */
   private JTextArea textAreaF2 = new JTextArea("");
   /******** pokemon. *********/
   private Pokemon p;
   /******** pokemon. *********/
   private Pokemon p2;
   /******** energy. *********/
   private int energy = 0;
   /******** energy. *********/
   private int energy2 = 0;
   /******** boolean check Pokemon1 choosen. *********/
   private boolean a = false;
   /******** boolean check Pokemon2 choosen. *********/
   private boolean b = false;
   /******** boolean check turn. *********/
   private boolean t = true;

   /********* sub-panel. *********/
   private JPanel topSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel leftSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel rightSubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel middleSubPanel = new JPanel();
   /********* sub-sub-panel. *********/
   private JPanel left1SubPanel = new JPanel();
   /********* sub-sub-panel. *********/
   private JPanel left2SubPanel = new JPanel();
   /********* sub-sub-sub-panel. *********/
   private JPanel subleft1SubPanel = new JPanel();
   /********* sub-sub-sub-panel. *********/
   private JPanel subleft2SubPanel = new JPanel();
   /********* sub-panel. *********/
   private JPanel botSubPanel = new JPanel();
   /********** Choice drop down menu for species. **/
   private Choice chSpecies = new Choice();
   

   
   /** we can declare and initialize ActionListener obj. */
   private GUIListener listener = new GUIListener();
   


   /**
  * Constructor holds everything.
  */
   public PokemonPanel() {
      

      setLayout(new BorderLayout()); //Border panel layout
      setPreferredSize(new Dimension(880, 880));
      topSubPanel.setBackground(Color.white); //north area color
      leftSubPanel.setBackground(Color.white); 
      leftSubPanel.setLayout(new GridLayout(5, 1));
      rightSubPanel.setBackground(Color.white);
      rightSubPanel.setLayout(new GridLayout(5, 1));
      left1SubPanel.setBackground(Color.white); //bottomSubPanel area color
      left1SubPanel.setLayout(new GridLayout(3, 1));
      subleft1SubPanel.setBackground(Color.white);
      left2SubPanel.setBackground(Color.white);
      left2SubPanel.setLayout(new GridLayout(3, 1));
      subleft2SubPanel.setBackground(Color.white);
      
      middleSubPanel.setBackground(Color.white);
      middleSubPanel.setLayout(new GridLayout(2, 1));
      
      //Top Subpanel!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      JLabel lSpecies = new JLabel("Pokemon Available: ");  
      
      chSpecies.add("Bulbasaur");
      chSpecies.add("Venusaur");
      chSpecies.add("Ivysaur");
      chSpecies.add("Squirtle");
      chSpecies.add("Wartortle");
      chSpecies.add("Blastoise");
      chSpecies.add("Charmander");
      chSpecies.add("Charmeleon");
      chSpecies.add("Charizard");
      
      topSubPanel.add(lSpecies);
      topSubPanel.add(chSpecies);
      
      topSubPanel.add(bFight);
      bFight.addActionListener(listener); 
   
      //adding top sub-panel to North
      add("North", topSubPanel);
   
     //left SubPanel!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      sOut = "Species:                     \nNumber: \nHeight:" 
            + " \nWeight: \nType: \nHP: \nCP: ";
      textArea1.setText(sOut);
      textArea1.setEditable(false);
      leftSubPanel.add(bMake1);
      bMake1.addActionListener(listener); 
      leftSubPanel.add(textArea1);
      leftSubPanel.add(photoA);
      leftSubPanel.add(textAreaA);
      
      
      //right SubPanel!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
      sOut = "Species:                     \nNumber: \nHeight:" 
            + " \nWeight: \nType: \nHP: \nCP: ";
      textArea2.setText(sOut);
      textArea2.setEditable(false);
      rightSubPanel.add(bMake2);
      bMake2.addActionListener(listener); 
      rightSubPanel.add(textArea2);
      rightSubPanel.add(photoB);
      rightSubPanel.add(textAreaB);
      
      
         
      //left1 SubPanel 1!!!!!!!!!!!!!!!!!!!!!!!!!!!
      sOut = "";
      textAreaF.setText(sOut);
      textAreaF.setEditable(false);
      left1SubPanel.add(lMsg);
      left1SubPanel.add(subleft1SubPanel);
      left1SubPanel.add(textAreaF);
      
            //sub left1 Panel
      subleft1SubPanel.add(bFast);
      subleft1SubPanel.add(bSpecial);
      subleft1SubPanel.add(bPass);
      bFast.setEnabled(false);
      bSpecial.setEnabled(false);
      bPass.setEnabled(false);
      bFast.addActionListener(listener); 
      bSpecial.addActionListener(listener); 
      bPass.addActionListener(listener);
       
      //left2 SubPanel!!!!!!!!!!!!!!!!!!!!!!!!!!!
      sOut = "";
      textAreaF2.setText(sOut);
      textAreaF2.setEditable(false);
      left2SubPanel.add(lMsg2);
      left2SubPanel.add(subleft2SubPanel);
      left2SubPanel.add(textAreaF2);
      
         //sub left Sub panel
      subleft2SubPanel.add(bFast2);
      subleft2SubPanel.add(bSpecial2);
      subleft2SubPanel.add(bPass2);
      bFast2.setEnabled(false);
      bSpecial2.setEnabled(false);
      bPass2.setEnabled(false);
      bFast2.addActionListener(listener); 
      bSpecial2.addActionListener(listener); 
      bPass2.addActionListener(listener);
      //bot SubPanel!!!!!!!!!!!!!!!!!!!!!!!!!!!1
      
      middleSubPanel.add(left1SubPanel);
      middleSubPanel.add(left2SubPanel);   
        
      
      //add SubPanel to Panel
      
      add("West", leftSubPanel);
      add("East", rightSubPanel);
      add("Center", middleSubPanel);
      add("South", botSubPanel);
      
      
   }
   
   
   /**
* Private ActionListener class.
*/
   private class GUIListener implements ActionListener {
   
   /**
   * ActionPerformed method.
   * @param event what button is clicked.
   */ 
      public void actionPerformed(ActionEvent event) {
         
         ImageIcon bulbasaurA = new ImageIcon("BulbasaurA.png");
         ImageIcon bulbasaurB = new ImageIcon("BulbasaurB.png");
         ImageIcon ivysaurA = new ImageIcon("IvysaurA.png");
         ImageIcon ivysaurB = new ImageIcon("IvysaurB.png");
         ImageIcon venusaurA = new ImageIcon("VenusaurA.png");
         ImageIcon venusaurB = new ImageIcon("VenusaurB.png");
         ImageIcon squirtleA = new ImageIcon("SquirtleA.png");
         ImageIcon squirtleB = new ImageIcon("SquirtleB.png");
         ImageIcon wartortleA = new ImageIcon("WartortleA.png");
         ImageIcon wartortleB = new ImageIcon("WartortleB.png");
         ImageIcon blastoiseA = new ImageIcon("BlastoiseA.png");
         ImageIcon blastoiseB = new ImageIcon("BlastoiseB.png");
         ImageIcon charmanderA = new ImageIcon("CharmanderA.png");
         ImageIcon charmanderB = new ImageIcon("CharmanderB.png");
         ImageIcon charmeleonA = new ImageIcon("CharmeleonA.png");
         ImageIcon charmeleonB = new ImageIcon("CharmeleonB.png");
         ImageIcon charizardA = new ImageIcon("CharizardA.png");
         ImageIcon charizardB = new ImageIcon("CharizardB.png");
         
         //JButton bAttacker = new JButton(bulbasaurA);
         //JButton bVictim = new JButton(bulbasaurB);
         
         sOut = "HP:    \nEnergy: ";
         
         textAreaA.setEditable(false);
         
         if (event.getSource() == bMake1) {
            a = true; 
            String species = chSpecies.getSelectedItem();
            
               
            
            switch(species) {
               case "Bulbasaur" : 
                   
               
                  p = new Bulbasaur();
                  photoA.setIcon(bulbasaurA);       
                  break;
               case "Venusaur" : 
                  p = new Venusaur();
                  photoA.setIcon(venusaurA);
                  break;
               case "Ivysaur" : 
                  p = new Ivysaur();
                  photoA.setIcon(ivysaurA); 
                  break;
               case "Squirtle" : 
                
                  p = new Squirtle();
                  photoA.setIcon(squirtleA);
                  break;
               case "Wartortle" : 
                 
                  p = new Wartortle();
                  photoA.setIcon(wartortleA);
                  break;
               case "Blastoise" : 
                  p = new Blastoise();
                  photoA.setIcon(blastoiseA);
                 
                  break;
               case "Charmander" : 
                  p = new Charmander();
                  photoA.setIcon(charmanderA);
                  break;
               case "Charmeleon" : 
                  p = new Charmeleon();
                  photoA.setIcon(charmeleonA);
                  break;
               case "Charizard" : 
                  p = new Charizard();
                  photoA.setIcon(charizardA);
                  break;
               default : lMsg.setText("Please choose one species");
            }
            
            sOut = p.toString();
            textArea1.setText(sOut);
            sOut = "HP:" + p.getHP() + "\nEnergy: " + energy;
            textAreaA.setText(sOut);
            
            
         
         }
         if (event.getSource() == bMake2) { 
            b = true;
            String species = chSpecies.getSelectedItem();
            String name = "";
         
            
            switch(species) {
               case "Bulbasaur" : 
                  p2 = new Bulbasaur();
                  photoB.setIcon(bulbasaurB); 
                  break;
               case "Venusaur" : 
                  p2 = new Venusaur();
                  photoB.setIcon(venusaurB);
                  break;
               case "Ivysaur" : 
                  p2 = new Ivysaur();
                  photoB.setIcon(ivysaurB); 
                  break;
               case "Squirtle" : 
                
                  p2 = new Squirtle();
                  photoB.setIcon(squirtleB);
                  break;
               case "Wartortle" : 
                 
                  p2 = new Wartortle();
                  photoB.setIcon(wartortleB);
                  break;
               case "Blastoise" : 
                  p2 = new Blastoise();
                  photoB.setIcon(blastoiseB);
                  break;
               case "Charmander" : 
                  p2 = new Charmander();
                  photoB.setIcon(charmanderB);
                  break;
               case "Charmeleon" : 
                  p2 = new Charmeleon();
                  photoB.setIcon(charmeleonB);
                  break;
               case "Charizard" : 
                  p2 = new Charizard();
                  photoB.setIcon(charizardB);
                  break;
               default : lMsg.setText("Please choose one species");
            }
            
            sOut = p2.toString();
            textArea2.setText(sOut);
            sOut = "HP:" + p2.getHP() + "\nEnergy: " + energy2;
            textAreaB.setText(sOut);
            
            
         
         
         }
         
         if (event.getSource() == bFight) {
            if (!a || !b) {
               textAreaF.setText("Someone have not choose Pokemon yet!");
            } else if (p.getHP() <= 0) {
               textAreaF.setText("Your Pokemon fainted!!" 
                     + " Can not fight any more!");
            } else if (p2.getHP() <= 0) {
               textAreaF2.setText("Your Pokemon fainted!!" 
                     + " Can not fight any more!");
            } else {
               
               bMake1.setEnabled(false);
               bMake2.setEnabled(false);
               textAreaF.setText("");
               textAreaF2.setText("");
               Random randGen = new Random();
               t = randGen.nextBoolean(); 
               if (t) {
                  lMsg.setText("It is player1's turn! " 
                        + "What would you like to do?");
                  bFast.setEnabled(true);
                  bSpecial.setEnabled(true);
                  bPass.setEnabled(true);
               } else {
                  lMsg2.setText("It is player2's turn!" 
                        + " What would you like to do?");
                  bFast2.setEnabled(true);
                  bSpecial2.setEnabled(true);
                  bPass2.setEnabled(true);
               }
               
                  
               
            }
         }
         
         if (event.getSource() == bFast) {
            p.chooseFastAttack();
            sOut = p.performFastAttack(p2);
            textAreaF.setText(sOut);
            sOut = "HP:" + p2.getHP() + "\nEnergy: " + energy2;
            textAreaB.setText(sOut);
            
            lMsg.setText("");
            bFast.setEnabled(false);
            bSpecial.setEnabled(false);
            bPass.setEnabled(false);
            if (p2.getHP() > 0) {
               lMsg2.setText("It is player2's turn!" 
                     + " What would you like to do?");
               bFast2.setEnabled(true);
               bSpecial2.setEnabled(true);
               bPass2.setEnabled(true);
            } else {
               
               textAreaF.setText("YOU WIN!!");
               textAreaF2.setText("You lose.");
               bMake1.setEnabled(true);
               bMake2.setEnabled(true);
               
            }
         }
         
         if (event.getSource() == bSpecial) {
            if (energy >= 3) {
               p.chooseSpecialAttack();
               sOut = p.performSpecialAttack(p2);
               textAreaF.setText(sOut);
               energy = energy - 3;
               sOut = "HP:" + p2.getHP() + "\nEnergy: " + energy2;
               textAreaB.setText(sOut); //fresh enemy static
               sOut = "HP:" + p.getHP() + "\nEnergy: " + energy;
               textAreaA.setText(sOut); //fresh my static
               
               lMsg.setText("");
               bFast.setEnabled(false);
               bSpecial.setEnabled(false);
               bPass.setEnabled(false);
               
               if (p2.getHP() > 0) {
                  lMsg2.setText("It is player2's turn!" 
                        + " What would you like to do?");
                  bFast2.setEnabled(true);
                  bSpecial2.setEnabled(true);
                  bPass2.setEnabled(true);
               } else {
                  textAreaF.setText("YOU WIN!!");
                  textAreaF2.setText("You lose.");
                  bMake1.setEnabled(true);
                  bMake2.setEnabled(true);
               
               }
               
            } else {
               textAreaF.setText("You dont have enough energy: " 
                      + energy + "/3");
               
            }
         }
         
         if (event.getSource() == bPass) {
            energy = energy + 1;
            sOut = "You store 1 energy.";
            textAreaF.setText(sOut);
            sOut = "HP:" + p.getHP() + "\nEnergy: " + energy;
            textAreaA.setText(sOut);
            
            lMsg.setText("");
            bFast.setEnabled(false);
            bSpecial.setEnabled(false);
            bPass.setEnabled(false);
            
            lMsg2.setText("It is player2's turn! " 
                  + "What would you like to do          ?");
            bFast2.setEnabled(true);
            bSpecial2.setEnabled(true);
            bPass2.setEnabled(true);
            
         }
         
         //p2
         if (event.getSource() == bFast2) {
            p2.chooseFastAttack();
            sOut = p2.performFastAttack(p);
            textAreaF2.setText(sOut);
            sOut = "HP:" + p.getHP() + "\nEnergy: " + energy;
            textAreaA.setText(sOut);
            
            lMsg2.setText("");
            bFast2.setEnabled(false);
            bSpecial2.setEnabled(false);
            bPass2.setEnabled(false);
            if (p.getHP() > 0) {
               lMsg.setText("It is player1's turn! " 
                     + "What would you like to do?");
               bFast.setEnabled(true);
               bSpecial.setEnabled(true);
               bPass.setEnabled(true);   
            } else {
               textAreaF2.setText("YOU WIN!!");
               textAreaF.setText("You lose.");
               bMake1.setEnabled(true);
               bMake2.setEnabled(true);
               
            }
            
         }
         
         if (event.getSource() == bSpecial2) {
            if (energy2 >= 3) {
               p2.chooseSpecialAttack();
               sOut = p2.performSpecialAttack(p);
               textAreaF2.setText(sOut);
               energy2 = energy2 - 3;
               sOut = "HP:" + p.getHP() + "\nEnergy: " + energy;
               textAreaA.setText(sOut);
               sOut = "HP:" + p2.getHP() + "\nEnergy: " + energy2;
               textAreaB.setText(sOut);
               
               lMsg2.setText("");
               bFast2.setEnabled(false);
               bSpecial2.setEnabled(false);
               bPass2.setEnabled(false);
               
               if (p.getHP() > 0) {
                  lMsg.setText("It is player1's turn!" 
                        + " What would you like to do?");
                  bFast.setEnabled(true);
                  bSpecial.setEnabled(true);
                  bPass.setEnabled(true);   
               } else {
                  textAreaF2.setText("YOU WIN!!");
                  textAreaF.setText("You lose.");
                  bMake1.setEnabled(true);
                  bMake2.setEnabled(true);
               
               }
               
               
            } else {
               textAreaF2.setText("You dont have enough energy: " 
                      + energy2 + "/3");
               
            }
         }
         
         if (event.getSource() == bPass2) {
            energy2 = energy2 + 1;
            sOut = "You store 1 energy.";
            textAreaF2.setText(sOut);
            sOut = "HP:" + p2.getHP() + "\nEnergy: " + energy2;
            textAreaB.setText(sOut);
            
            lMsg2.setText("");
            bFast2.setEnabled(false);
            bSpecial2.setEnabled(false);
            bPass2.setEnabled(false);
            
            lMsg.setText("It is player1's turn! " 
                  + "What would you like to do?");
            bFast.setEnabled(true);
            bSpecial.setEnabled(true);
            bPass.setEnabled(true);
            
         }
      }
   
   
   }
   
   
    
}
