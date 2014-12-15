/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eecs448_project;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import static javafx.scene.text.Font.font;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Danilo
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    int x;
    int y;
    int sizebuttonokx=130;
    int sizebuttonoky = 70;
    int sizebuttonokfontx=60;
    int sizebuttonokfonty=20;
    
    int sizebuttonstartx=200;
    int sizebuttonstarty = 70;
    int sizebuttonstartfontx=60;
    int sizebuttonstartfonty=20;
    
    //Battle Buttons
    int sizeBattleButtonx=400;
    int sizeBattleButtony=200;
    //Inventory Buttons
      int sizeBattleInventoryButtonx=320;
    int sizeBattleInventoryButtony=100;
    //Inventory Text
         int sizeBattleInventoryButtonTextx=500;
    int sizeBattleInventoryButtonTexty=70;
    
        //Option Text
         int sizeBattleOptionButtonTextx=290;
    int sizeBattleOptionButtonTexty=70;
    
    //Qty Text
           int sizeBattleItemQtyx=50;
    int sizeBattleItemQtyy=80;


     public void StoryMode(){
          Toolkit tk=Toolkit.getDefaultToolkit();
          x = (int) tk.getScreenSize().getWidth();
         y = (int) tk.getScreenSize().getHeight();
       SetOkbutton();
       BackGround.setSize(x, y);
     }
     
    
    public void BattleMode(){
                this.setAlwaysOnTop(false);
        this.setAutoRequestFocus(true);
        
          Toolkit tk=Toolkit.getDefaultToolkit();
       //Setting sizes and locations
        x = (int) tk.getScreenSize().getWidth();
         y = (int) tk.getScreenSize().getHeight();
     this.setSize(x, y);
     

  Okbutton.setSize(0,0);
     
     //Labels
       BackGround.setSize(x*1440/1920,y*810/1080);
   
        
         BattleLabelDown.setSize(880*x/1920,y*270/1080);
         BattleLabelDown.setLocation(0, y*(810)/1080);
           ImageIcon b = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\LabelDown.png");
            ImageIcon icon2=new ImageIcon(ScaledImage(b,BattleLabelDown.getWidth(),BattleLabelDown.getHeight()));
            BattleLabelDown.setIcon(icon2);
            
            
               Font BattleLabelDown=new Font("Arial",Font.PLAIN,(int) 48*x/1920);
            BattleLabelDownText.setSize(730*x/1920,230*y/1080);
            BattleLabelDownText.setLocation(60*x/1920, 850*y/1080);
            BattleLabelDownText.setFont(BattleLabelDown);
              BattleLabelDownText.setText("<html><body>What you gonna do?<br></body></html>"
     );
            
    BattleLabelOptions.setSize(1040*x/1920,y*270/1080);
    BattleLabelOptions.setLocation(880*x/1920, 810*y/1080);
     ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\OptionLabel.png");
            ImageIcon icon3=new ImageIcon(ScaledImage(c,BattleLabelOptions.getWidth(),BattleLabelOptions.getHeight()));
            BattleLabelOptions.setIcon(icon3);
    
     BattleLabelInventory.setSize(480*x/1920,y*810/1080);
     BattleLabelInventory.setLocation(1440*x/1920, 0);
         ImageIcon d = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Inventory Buttons.png");
            ImageIcon icon4=new ImageIcon(ScaledImage(d,BattleLabelInventory.getWidth(),BattleLabelInventory.getHeight()));
            BattleLabelInventory.setIcon(icon4);
   
    

       
     
     //Option Buttons

      ImageIcon e = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\BattleButton.png");
            ImageIcon icon5=new ImageIcon(ScaledImage(e, (int) (sizeBattleButtonx), (int) (sizeBattleButtony)));
      
 AttackButton.setSize(sizeBattleButtonx,sizeBattleButtony);
 AttackButton.setLocation(1000*x/1920, 840*y/1080);
 AttackButton.setIcon(icon5);
  DefendButton.setSize(sizeBattleButtonx,sizeBattleButtony);
  DefendButton.setLocation(1460*x/1920, 840*y/1080);
  DefendButton.setIcon(icon5);
   ItemButton.setSize(sizeBattleButtonx,sizeBattleButtony);
   ItemButton.setLocation(1000*x/1920, 960*y/1080);
   ItemButton.setIcon(icon5);
    FleeButton.setSize(sizeBattleButtonx,sizeBattleButtony);
    FleeButton.setLocation(1460*x/1920,960*y/1080);
    FleeButton.setIcon(icon5);
  
    //Inventory Buttons
  
    
  
    BifurcatorButton.setSize(0,0);
    BifurcatorButton.setLocation(1463*x/1920, 377*y/1080);
    CrystalMathButton.setSize(0,0);
    CrystalMathButton.setLocation(1463*x/1920,512*y/1080);
    ArchimeadButton.setSize(0,0);
    ArchimeadButton.setLocation(1463*x/1920,648*y/1080);
    PithagoreanButton.setSize(0,0);
    PithagoreanButton.setLocation(1463*x/1920, 240*y/1080);

               
    //Text Buttons Inventory
   

       Font Inventory=new Font("Arial",Font.PLAIN,(int) 30*x/1920);
      
    
        BifurcatorText.setSize(sizeBattleInventoryButtonTextx,sizeBattleInventoryButtonTexty);
        BifurcatorText.setLocation(1560*x/1920,400*y/1080);
        BifurcatorText.setFont(Inventory);
    CrystalMathText.setSize(sizeBattleInventoryButtonTextx,sizeBattleInventoryButtonTexty);
    CrystalMathText.setLocation(1530*x/1920, 535*y/1080);
    CrystalMathText.setFont(Inventory);
    ArchimedeText.setSize(sizeBattleInventoryButtonTextx,sizeBattleInventoryButtonTexty);
    ArchimedeText.setLocation(1550*x/1920, 665*y/1080);
    ArchimedeText.setFont(Inventory);
    PithagoreanText.setSize(sizeBattleInventoryButtonTextx,sizeBattleInventoryButtonTexty);
    PithagoreanText.setLocation(1490*x/1920, 260*y/1080);
    PithagoreanText.setFont(Inventory);
    
     //Text Buttons Option
    
  
     Font Options=new Font("Arial",Font.PLAIN,(int) 48*x/1920);
    
        AttackButtonText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
  AttackButtonText.setLocation(1130*x/1920, 860*y/1080);
  AttackButtonText.setFont(Options);
    DefendText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    DefendText.setLocation(1580*x/1920, 860*y/1080);
    DefendText.setFont(Options);
    ItemText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    ItemText.setLocation(1140*x/1920,980*y/1080);
    ItemText.setFont(Options);
    FleeText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    FleeText.setLocation(1620*x/1920,980*y/1080);
    FleeText.setFont(Options);
    
    //Qty Text

        Font Qty=new Font("Arial",Font.PLAIN,(int) 30*x/1920);
     BifurcatorQty.setSize(sizeBattleItemQtyx,sizeBattleItemQtyy);
     BifurcatorQty.setLocation(1830*x/1920, 390*y/1080);
     BifurcatorQty.setFont(Qty);
    CrystalMathQty.setSize(sizeBattleItemQtyx,sizeBattleItemQtyy);
    CrystalMathQty.setLocation(1830*x/1920, 530*y/1080);
    CrystalMathQty.setFont(Qty);
    ArchimeadQty.setSize(sizeBattleItemQtyx,sizeBattleItemQtyy);
    ArchimeadQty.setLocation(1830*x/1920, 660*y/1080);
    ArchimeadQty.setFont(Qty);
    PithagoreanQty.setSize(sizeBattleItemQtyx,sizeBattleItemQtyy);
    PithagoreanQty.setLocation(1830*x/1920, 250*y/1080);
    PithagoreanQty.setFont(Qty);
    
         //HealthBar
     PlayerHealth.setSize(600*x/1920,80*y/1080);
     PlayerHealth.setLocation(800*x/1920,650*y/1080);
     PlayerHealth.setValue(20);
    
    //Player Health Text
    PlayerHealthText.setSize(340*x/1920,50*y/1080);
    PlayerHealthText.setLocation(1000*x/1920, 740*y/1080);
    //Monster Helth
         HealthMonster.setSize(600*x/1920,80*y/1080);
     HealthMonster.setLocation(60*x/1920,40*y/1080);
     HealthMonster.setValue(100);
     
       //Monster Health Text
   MonsterHealthText.setSize(340*x/1920,50*y/1080);
    MonsterHealthText.setLocation(280*x/1920, 140*y/1080);
PhaseChange.setSize(0,0);
PhaseChangeText.setSize(0, 0);





         
}
    
    public void BattleModeOff(){
       
     

  
     
  
   
        
         BattleLabelDown.setSize(0,0);
       
          
            
            
              
            BattleLabelDownText.setSize(0,0);
         
   
            
    BattleLabelOptions.setSize(0,0);
    
    
     BattleLabelInventory.setSize(0,0);
   
   
    

       
     
     //Option Buttons

 AttackButton.setSize(0,0);
 
  DefendButton.setSize(0,0);
  
   ItemButton.setSize(0,0);
 
    FleeButton.setSize(0,0);
   
  
    //Inventory Buttons
  
    
  
    BifurcatorButton.setSize(0,0);
    BifurcatorButton.setLocation(1463*x/1920, 377*y/1080);
    CrystalMathButton.setSize(0,0);
    CrystalMathButton.setLocation(1463*x/1920,512*y/1080);
    ArchimeadButton.setSize(0,0);
    ArchimeadButton.setLocation(1463*x/1920,648*y/1080);
    PithagoreanButton.setSize(0,0);
    PithagoreanButton.setLocation(1463*x/1920, 240*y/1080);

               
    //Text Buttons Inventory
   

    
      
    
        BifurcatorText.setSize(0,0);
      
    CrystalMathText.setSize(0,0);
    
    ArchimedeText.setSize(0,0);
   
    PithagoreanText.setSize(0,0);
   
    
     //Text Buttons Option
    
  
   
    
        AttackButtonText.setSize(0,0);
 
    DefendText.setSize(0,0);
   
    ItemText.setSize(0,0);
   
    FleeText.setSize(0,0);
   
    
    //Qty Text

   
     BifurcatorQty.setSize(0,0);
    
    CrystalMathQty.setSize(0,0);
    
    ArchimeadQty.setSize(0,0);
    
    PithagoreanQty.setSize(0,0);
   
    
         //HealthBar
     PlayerHealth.setSize(0,0);
    
    
    //Player Health Text
    PlayerHealthText.setSize(0,0);
    
    //Monster Helth
         HealthMonster.setSize(0,0);
    
     
       //Monster Health Text
   MonsterHealthText.setSize(0,0);
   
PhaseChange.setSize(0,0);
PhaseChangeText.setSize(0, 0);

        
        
    }
    
    
   

    public void MonsterTurn(){
        ItemsOff();
         AttackButton.setEnabled(false);
         DefendButton.setEnabled(false);
         FleeButton.setEnabled(false);
         ItemButton.setEnabled(false);
         PhaseChange.setSize(90*x/1920,80*y/1080);
         PhaseChange.setLocation(760*x/1920, 980*y/1080);
           Font Next=new Font("Arial",Font.PLAIN,(int) 48*x/1920);
         
         PhaseChangeText.setFont(Next);
         PhaseChangeText.setLocation(790*x/1920, 1000*y/1080);
         PhaseChangeText.setSize(90*x/1920,40*y/1080);
            PhaseChangeText.setText(">");
        
    }
       public void PlayerTurn(){
        ItemsOff();
     BattleLabelDownText.setText("<html><body>What you gonna do?<br></body></html>");
         AttackButton.setEnabled(true);
         DefendButton.setEnabled(true);
         FleeButton.setEnabled(true);
         ItemButton.setEnabled(true);
           PhaseChange.setSize(0,0);
           PhaseChangeText.setText("");
       }
    public void ItemsOn(){
            
     ImageIcon f = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\BattleItemButton.png");
            ImageIcon icon6=new ImageIcon(ScaledImage(f, (int) (sizeBattleInventoryButtonx), (int) (sizeBattleInventoryButtony)));
      
    

    BifurcatorButton.setIcon(icon6);

    CrystalMathButton.setIcon(icon6);

    ArchimeadButton.setIcon(icon6);

    PithagoreanButton.setIcon(icon6);
            BifurcatorButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
  

    CrystalMathButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
  
    
    ArchimeadButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);

   
    PithagoreanButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
    CrystalMathQty.setText(""+PC.get_crystalmath());
    PithagoreanQty.setText(""+PC.get_pythagoreanserum());
    BifurcatorQty.setText(""+PC.get_bifurcator());
    ArchimeadQty.setText(""+PC.get_archimead());
    
    if(PC.get_bifurcator()<1){
        BifurcatorButton.setEnabled(false);
    }
      if(PC.get_archimead()<1){
        ArchimeadButton.setEnabled(false);
    }
    
        if(PC.get_crystalmath()<1){
        CrystalMathButton.setEnabled(false);
    }
    
          if(PC.get_pythagoreanserum()<1){
        PithagoreanButton.setEnabled(false);
    }
    
        
    }
        public void ItemsOff(){
        
            BifurcatorButton.setSize(0,0);
  

    CrystalMathButton.setSize(0,0);
  
    
    ArchimeadButton.setSize(0,0);

   
    PithagoreanButton.setSize(0,0);
    
    
        
    }
    
   playerCharacter PC;
          Creature Adder;
        
    public NewJFrame() {
        initComponents();

        
        this.setAlwaysOnTop(true);
        Toolkit tk=Toolkit.getDefaultToolkit();
       
         x = (int) tk.getScreenSize().getWidth();
         y = (int) tk.getScreenSize().getHeight();
         

         
         
        this.setSize(x, y);
        this.setAlwaysOnTop(false);
        this.setAutoRequestFocus(true);
        BackGround.setSize(x, y);
        
        
        
                  ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene1.jpg");
   
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N\
    SetOkbutton();
        
    
    //Update the size of buttons by the size of the screen
    sizeBattleButtonx=sizeBattleButtonx*x/1920;
        sizeBattleButtony=sizeBattleButtony*y/1920;
        
        sizeBattleInventoryButtonx=sizeBattleInventoryButtonx*x/1920;
        sizeBattleInventoryButtony=sizeBattleInventoryButtony*y/1080;
        sizeBattleInventoryButtonTextx=sizeBattleInventoryButtonTextx*x/1920;
        sizeBattleInventoryButtonTexty=sizeBattleInventoryButtonTexty*y/1080;
sizeBattleOptionButtonTextx=sizeBattleOptionButtonTextx*x/1920;
sizeBattleOptionButtonTexty=sizeBattleOptionButtonTexty*y/1080;
    sizeBattleItemQtyx=sizeBattleItemQtyx*x/1920;
    sizeBattleItemQtyy=sizeBattleItemQtyy*y/1080;

    ExitButton.setSize(50*x/1920,50*y/1080);
    ExitButton.setLocation(1870*x/1920, 0);
 ImageIcon b = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\exitbutton.png");
   
        ImageIcon icon1=new ImageIcon(ScaledImage(b,ExitButton.getWidth(),ExitButton.getHeight()));
        ExitButton.setIcon(icon1);
         
        




           PC = new playerCharacter();
PC.set_maxhp(10);
PC.set_curhp(10);
PC.set_congruence(1);
PC.set_quads(1);
PC.set_acuteness(1);
PC.set_eccentricity(1);
PC.set_experience(0);
PC.set_plasticity(1);
PC.set_sprightliness(1);
PC.set_archimead(1);
PC.set_crystalmath(1);
PC.set_bifurcator(1);
PC.set_pythagoreanserum(1);

                        Adder = new Creature();
Adder.set_maxhp(5);
Adder.set_curhp(5);
Adder.set_congruence(1);
Adder.set_quads(2);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);



         
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        PhaseChangeText = new javax.swing.JLabel();
        PhaseChange = new javax.swing.JButton();
        HealthMonster = new javax.swing.JProgressBar();
        MonsterHealthText = new javax.swing.JLabel();
        PlayerHealthText = new javax.swing.JLabel();
        PlayerHealth = new javax.swing.JProgressBar();
        PithagoreanQty = new javax.swing.JLabel();
        PithagoreanText = new javax.swing.JLabel();
        PithagoreanButton = new javax.swing.JButton();
        BifurcatorQty = new javax.swing.JLabel();
        BifurcatorText = new javax.swing.JLabel();
        BifurcatorButton = new javax.swing.JButton();
        CrystalMathQty = new javax.swing.JLabel();
        CrystalMathText = new javax.swing.JLabel();
        CrystalMathButton = new javax.swing.JButton();
        ArchimeadQty = new javax.swing.JLabel();
        ArchimedeText = new javax.swing.JLabel();
        ArchimeadButton = new javax.swing.JButton();
        FleeText = new javax.swing.JLabel();
        FleeButton = new javax.swing.JButton();
        ItemText = new javax.swing.JLabel();
        ItemButton = new javax.swing.JButton();
        AttackButtonText = new javax.swing.JLabel();
        AttackButton = new javax.swing.JButton();
        DefendText = new javax.swing.JLabel();
        DefendButton = new javax.swing.JButton();
        BattleLabelOptions = new javax.swing.JLabel();
        BattleLabelInventory = new javax.swing.JLabel();
        BattleLabelDownText = new javax.swing.JLabel();
        BattleLabelDown = new javax.swing.JLabel();
        Circle = new javax.swing.JButton();
        Square = new javax.swing.JButton();
        Triangle = new javax.swing.JButton();
        OkText = new javax.swing.JLabel();
        Okbutton = new javax.swing.JButton();
        MsgText = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1980, 1080));
        jPanel1.setLayout(null);

        ExitButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\exitbutton.png")); // NOI18N
        ExitButton.setToolTipText("");
        ExitButton.setContentAreaFilled(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ExitButton);
        ExitButton.setBounds(1510, 0, 50, 50);

        PhaseChangeText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        PhaseChangeText.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(PhaseChangeText);
        PhaseChangeText.setBounds(790, 1000, 90, 40);

        PhaseChange.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png")); // NOI18N
        PhaseChange.setToolTipText("asdf");
        PhaseChange.setContentAreaFilled(false);
        PhaseChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhaseChangeActionPerformed(evt);
            }
        });
        jPanel1.add(PhaseChange);
        PhaseChange.setBounds(760, 980, 0, 0);

        HealthMonster.setBackground(new java.awt.Color(255, 255, 255));
        HealthMonster.setForeground(new java.awt.Color(0, 204, 0));
        HealthMonster.setValue(10);
        HealthMonster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(HealthMonster);
        HealthMonster.setBounds(60, 40, 0, 0);

        MonsterHealthText.setBackground(new java.awt.Color(0, 0, 0));
        MonsterHealthText.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        MonsterHealthText.setText("100/100");
        jPanel1.add(MonsterHealthText);
        MonsterHealthText.setBounds(310, 160, 0, 0);

        PlayerHealthText.setBackground(new java.awt.Color(0, 0, 0));
        PlayerHealthText.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        PlayerHealthText.setText("100/100");
        jPanel1.add(PlayerHealthText);
        PlayerHealthText.setBounds(1050, 710, 0, 0);

        PlayerHealth.setBackground(new java.awt.Color(255, 255, 255));
        PlayerHealth.setForeground(new java.awt.Color(0, 204, 0));
        PlayerHealth.setValue(10);
        PlayerHealth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(PlayerHealth);
        PlayerHealth.setBounds(800, 590, 0, 0);

        PithagoreanQty.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        PithagoreanQty.setForeground(new java.awt.Color(255, 255, 255));
        PithagoreanQty.setText("0");
        jPanel1.add(PithagoreanQty);
        PithagoreanQty.setBounds(1830, 250, 0, 0);

        PithagoreanText.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        PithagoreanText.setForeground(new java.awt.Color(255, 255, 255));
        PithagoreanText.setText("Pythagorean Serum");
        jPanel1.add(PithagoreanText);
        PithagoreanText.setBounds(1490, 250, 0, 0);

        PithagoreanButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleItemButton.png")); // NOI18N
        PithagoreanButton.setToolTipText("asdf");
        PithagoreanButton.setContentAreaFilled(false);
        PithagoreanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PithagoreanButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PithagoreanButton);
        PithagoreanButton.setBounds(1460, 240, 0, 0);

        BifurcatorQty.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        BifurcatorQty.setForeground(new java.awt.Color(255, 255, 255));
        BifurcatorQty.setText("0");
        jPanel1.add(BifurcatorQty);
        BifurcatorQty.setBounds(1830, 390, 0, 0);

        BifurcatorText.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        BifurcatorText.setForeground(new java.awt.Color(255, 255, 255));
        BifurcatorText.setText("Bifurcator");
        jPanel1.add(BifurcatorText);
        BifurcatorText.setBounds(1560, 410, 0, 0);
        BifurcatorText.getAccessibleContext().setAccessibleName("");

        BifurcatorButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleItemButton.png")); // NOI18N
        BifurcatorButton.setToolTipText("asdf");
        BifurcatorButton.setContentAreaFilled(false);
        BifurcatorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BifurcatorButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BifurcatorButton);
        BifurcatorButton.setBounds(1463, 377, 0, 0);

        CrystalMathQty.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        CrystalMathQty.setForeground(new java.awt.Color(255, 255, 255));
        CrystalMathQty.setText("0");
        jPanel1.add(CrystalMathQty);
        CrystalMathQty.setBounds(1830, 520, 0, 0);

        CrystalMathText.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        CrystalMathText.setForeground(new java.awt.Color(255, 255, 255));
        CrystalMathText.setText("Crystal Math");
        jPanel1.add(CrystalMathText);
        CrystalMathText.setBounds(1530, 530, 0, 0);

        CrystalMathButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleItemButton.png")); // NOI18N
        CrystalMathButton.setToolTipText("asdf");
        CrystalMathButton.setContentAreaFilled(false);
        CrystalMathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrystalMathButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CrystalMathButton);
        CrystalMathButton.setBounds(1463, 512, 0, 0);

        ArchimeadQty.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        ArchimeadQty.setForeground(new java.awt.Color(255, 255, 255));
        ArchimeadQty.setText("0");
        jPanel1.add(ArchimeadQty);
        ArchimeadQty.setBounds(1830, 660, 0, 0);

        ArchimedeText.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        ArchimedeText.setForeground(new java.awt.Color(255, 255, 255));
        ArchimedeText.setText("Archimead");
        jPanel1.add(ArchimedeText);
        ArchimedeText.setBounds(1550, 660, 0, 0);

        ArchimeadButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleItemButton.png")); // NOI18N
        ArchimeadButton.setToolTipText("asdf");
        ArchimeadButton.setContentAreaFilled(false);
        ArchimeadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchimeadButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ArchimeadButton);
        ArchimeadButton.setBounds(1463, 648, 0, 0);

        FleeText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        FleeText.setForeground(new java.awt.Color(204, 204, 204));
        FleeText.setText("Flee");
        jPanel1.add(FleeText);
        FleeText.setBounds(1620, 980, 0, 0);

        FleeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png")); // NOI18N
        FleeButton.setToolTipText("asdf");
        FleeButton.setContentAreaFilled(false);
        FleeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FleeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(FleeButton);
        FleeButton.setBounds(1460, 960, 0, 0);

        ItemText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        ItemText.setForeground(new java.awt.Color(204, 204, 204));
        ItemText.setText("Items");
        jPanel1.add(ItemText);
        ItemText.setBounds(1140, 980, 0, 0);

        ItemButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png")); // NOI18N
        ItemButton.setToolTipText("asdf");
        ItemButton.setContentAreaFilled(false);
        ItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ItemButton);
        ItemButton.setBounds(1000, 960, 0, 0);

        AttackButtonText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        AttackButtonText.setForeground(new java.awt.Color(204, 204, 204));
        AttackButtonText.setText("Attack");
        jPanel1.add(AttackButtonText);
        AttackButtonText.setBounds(1130, 860, 0, 0);

        AttackButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png")); // NOI18N
        AttackButton.setToolTipText("asdf");
        AttackButton.setContentAreaFilled(false);
        AttackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AttackButton);
        AttackButton.setBounds(1000, 840, 0, 0);

        DefendText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        DefendText.setForeground(new java.awt.Color(204, 204, 204));
        DefendText.setText("Defend");
        jPanel1.add(DefendText);
        DefendText.setBounds(1580, 860, 0, 0);

        DefendButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png")); // NOI18N
        DefendButton.setToolTipText("asdf");
        DefendButton.setContentAreaFilled(false);
        DefendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefendButtonActionPerformed(evt);
            }
        });
        jPanel1.add(DefendButton);
        DefendButton.setBounds(1460, 840, 0, 0);

        BattleLabelOptions.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\OptionLabel.png")); // NOI18N
        BattleLabelOptions.setToolTipText("");
        BattleLabelOptions.setMaximumSize(new java.awt.Dimension(1400, 270));
        BattleLabelOptions.setMinimumSize(new java.awt.Dimension(0, 270));
        jPanel1.add(BattleLabelOptions);
        BattleLabelOptions.setBounds(880, 810, 0, 0);

        BattleLabelInventory.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\Inventory Buttons.png")); // NOI18N
        jPanel1.add(BattleLabelInventory);
        BattleLabelInventory.setBounds(1440, 0, 0, 0);

        BattleLabelDownText.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        BattleLabelDownText.setForeground(new java.awt.Color(204, 204, 204));
        BattleLabelDownText.setText("This is the text of the battle");
        jPanel1.add(BattleLabelDownText);
        BattleLabelDownText.setBounds(60, 850, 0, 0);

        BattleLabelDown.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\LabelDown.png")); // NOI18N
        jPanel1.add(BattleLabelDown);
        BattleLabelDown.setBounds(500, 890, 0, 0);

        Circle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\okbutton.png")); // NOI18N
        Circle.setToolTipText("asdf");
        Circle.setContentAreaFilled(false);
        Circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleActionPerformed(evt);
            }
        });
        jPanel1.add(Circle);
        Circle.setBounds(840, 570, 0, 0);

        Square.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Square.png")); // NOI18N
        Square.setToolTipText("asdf");
        Square.setContentAreaFilled(false);
        Square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareActionPerformed(evt);
            }
        });
        jPanel1.add(Square);
        Square.setBounds(470, 570, 0, 0);

        Triangle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\okbutton.png")); // NOI18N
        Triangle.setToolTipText("asdf");
        Triangle.setContentAreaFilled(false);
        Triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TriangleActionPerformed(evt);
            }
        });
        jPanel1.add(Triangle);
        Triangle.setBounds(50, 570, 0, 0);

        OkText.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        OkText.setForeground(new java.awt.Color(255, 255, 255));
        OkText.setText("Continue");
        jPanel1.add(OkText);
        OkText.setBounds(1630, 960, 170, 60);

        Okbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\okbutton.png")); // NOI18N
        Okbutton.setToolTipText("asdf");
        Okbutton.setContentAreaFilled(false);
        Okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Okbutton);
        Okbutton.setBounds(1570, 940, 290, 100);

        MsgText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        MsgText.setForeground(new java.awt.Color(255, 255, 255));
        MsgText.setText("I live in a very bright planet where everything is light.");
        jPanel1.add(MsgText);
        MsgText.setBounds(100, 830, 0, 0);

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene1.jpg")); // NOI18N
        BackGround.setToolTipText("");
        jPanel1.add(BackGround);
        BackGround.setBounds(0, 0, 1440, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private Image ScaledImage(ImageIcon img, int w, int h){
        BufferedImage resizedImage = new BufferedImage (w,h,BufferedImage.TYPE_INT_RGB); 
        Graphics2D g2 = resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img.getImage(), 0, 0,w,h,null);
        g2.dispose();
        return resizedImage;
        
     }


     int CountOkbutton=0;
    private void OkbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkbuttonActionPerformed
CountOkbutton++;
   
        if(CountOkbutton==1){
             ImageIcon a = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\scene2.jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
        Triangle.setSize(350*x/1920,200*y/1080);
        Square.setSize(350*x/1920,200*y/1080);
        Circle.setSize(350*x/1920,200*y/1080);
       Triangle.setLocation(100*x/1920,500*y/1080);
            ImageIcon b = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\Triangle.png");
        ImageIcon icon2=new ImageIcon(ScaledImage(b,Triangle.getWidth(),Triangle.getHeight()));
        Triangle.setIcon(icon2); 
       Square.setLocation(500*x/1920,500*y/1080);
        ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Square.png");
        ImageIcon icon3=new ImageIcon(ScaledImage(c,Square.getWidth(),Square.getHeight()));
        Square.setIcon(icon3); 
       Circle.setLocation(900*x/1920,500*y/1080);
              ImageIcon d = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\Circle.png");
        ImageIcon icon4=new ImageIcon(ScaledImage(d,Circle.getWidth(),Circle.getHeight()));
        Circle.setIcon(icon4); 
       Okbutton.setSize(0,0);
       OkText.setSize(0,0);
        }
        
        if(CountOkbutton==2){
           
            if(Path==1){
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene4(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
               if(Path==2){
                   
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene4(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene4(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
             
        }
          if(CountOkbutton==3){
              
                  if(Path==1){
                  
        BattleMode();



HealthMonster.setValue(Adder.get_curhp());
HealthMonster.setMaximum(Adder.get_maxhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene5(Adder,triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); 

     
            }
               if(Path==2){
                    BattleMode();
                    HealthMonster.setValue(Adder.get_curhp());
HealthMonster.setMaximum(Adder.get_maxhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene5(Adder,square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
                       HealthMonster.setValue(Adder.get_curhp());
HealthMonster.setMaximum(Adder.get_maxhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene5(Adder,circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
 
        }
          if(CountOkbutton==4){
              if(PC.get_charShape()=="Triangle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Strange-Attractor(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
        PC.set_congruence(PC.get_congruence()+2);
              }
               if(PC.get_charShape()=="Square"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Strange-Attractor(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
                PC.set_congruence(PC.get_congruence()+2);
              }
                  if(PC.get_charShape()=="Circle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Strange-Attractor(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
                PC.set_congruence(PC.get_congruence()+2);
              }
          }
          if(CountOkbutton==5){
              
            if(PC.get_charShape()=="Triangle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
               if(PC.get_charShape()=="Square"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
                  if(PC.get_charShape()=="Circle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
        
          }
          
                    if(CountOkbutton==6){   
                        //Hippopotanus
                                               Adder = new Creature();
Adder.set_maxhp(10);
Adder.set_curhp(10);
Adder.set_congruence(1);
Adder.set_quads(2);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);

PC.set_curhp(PC.get_maxhp());


                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Hippopotanus(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Hippopotanus(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Hippopotanus(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
          
       
                    }
                    if(CountOkbutton==7){
                       if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Axe-of-choice(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
       PC.set_quads(PC.get_quads()+4);
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Axe-of-choice(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
    PC.set_quads(PC.get_quads()+4);
       
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Axe-of-choice(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
      PC.set_quads(PC.get_quads()+4);
                                        }
                    }
                    
                                if(CountOkbutton==8){
                       if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Lacy-godel(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_congruence(PC.get_congruence()+4);
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Lacy-godel(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
      PC.set_congruence(PC.get_congruence()+4);
       
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Lacy-godel(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
      PC.set_congruence(PC.get_congruence()+4);
                                        }
                    }
                                
                                
                                            if(CountOkbutton==9){
        
                                                                        //Octopi
                                               Adder = new Creature();
Adder.set_maxhp(30);
Adder.set_curhp(30);
Adder.set_congruence(1);
Adder.set_quads(2);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);

PC.set_curhp(PC.get_maxhp());

                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                                                
                                                
                                                
                                                
                                                
                    }
                                            
                                            
                                            
       if(CountOkbutton==10){
                                                
                                  if(Monsters==3){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Gauss-hand-cannon(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_acuteness(PC.get_acuteness()+4);
        
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Gauss-hand-cannon(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_acuteness(PC.get_acuteness()+4);
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Gauss-hand-cannon(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
           PC.set_acuteness(PC.get_acuteness()+4);
                                        }
                                      
                                        
                                            
                                        }                              
                                                
                                                
                                                
                                            }
                                                   if(CountOkbutton==11){
        
                                                                        //Geometree
                                               Adder = new Creature();
Adder.set_maxhp(50);
Adder.set_curhp(50);
Adder.set_congruence(1);
Adder.set_quads(6);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);

PC.set_curhp(PC.get_maxhp());

                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                                                
                                                
                                                
                                                
                                                
                    }
                                                   
                                                                        if(CountOkbutton==12){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

        
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

                                        }
                                      
                                        
                                            
                                        }
                                                                        
                                                                        
                                              if(CountOkbutton==13){
        
                                                                        //Cardinal
                                               Adder = new Creature();
Adder.set_maxhp(100);
Adder.set_curhp(100);
Adder.set_congruence(1);
Adder.set_quads(7);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(100);

PC.set_curhp(PC.get_maxhp());

                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Cardinal(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Cardinal(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Cardinal(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                                                
                                                
                                                
                                                
                                                
                    }
       
       
    }//GEN-LAST:event_OkbuttonActionPerformed

    private void AttackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttackButtonActionPerformed
Case=1;

ItemsOff(); 
MonsterTurn();// TODO add your handling code here:
 BattleLabelDownText.setText("<html><body>You attacked the monster!<br></body></html>"
         
            
            
       
     );

 

 
    }//GEN-LAST:event_AttackButtonActionPerformed

    private void DefendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefendButtonActionPerformed
Case=2;
        MonsterTurn();
 BattleLabelDownText.setText("<html><body>You defended from the monster!<br></body></html>"
     
     );
        ItemsOff();  // TODO add your handling code here:
    }//GEN-LAST:event_DefendButtonActionPerformed

    private void ItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemButtonActionPerformed
ItemsOn();        // TODO add your handling code here:
    }//GEN-LAST:event_ItemButtonActionPerformed

    private void FleeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FleeButtonActionPerformed
Case=3;
   MonsterTurn();
   BattleLabelDownText.setText("<html><body>You will try to flee from the monster!<br></body></html>"
     
     );
        // TODO add your handling code here:
    }//GEN-LAST:event_FleeButtonActionPerformed

    private void ArchimeadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchimeadButtonActionPerformed
Case=7;
        MonsterTurn();
 BattleLabelDownText.setText("<html><body>You used Archimead!<br></body></html>"
     
     );       // TODO add your handling code here:
    }//GEN-LAST:event_ArchimeadButtonActionPerformed

    private void CrystalMathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrystalMathButtonActionPerformed
Case=6;
        MonsterTurn();
 BattleLabelDownText.setText("<html><body>You used Crystal Math!<br></body></html>"
     
     );   // TODO add your handling code here:
    }//GEN-LAST:event_CrystalMathButtonActionPerformed

    private void BifurcatorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BifurcatorButtonActionPerformed
Case=5;
        MonsterTurn();
 BattleLabelDownText.setText("<html><body>You used Bifurcator!<br></body></html>"
     
     );   // TODO add your handling code here:
    }//GEN-LAST:event_BifurcatorButtonActionPerformed

    private void PithagoreanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PithagoreanButtonActionPerformed
        Case=4;    
        MonsterTurn();
 BattleLabelDownText.setText("<html><body>You used Pithagorean!<br></body></html>"
     
     );   // TODO add your handling code here:
    }//GEN-LAST:event_PithagoreanButtonActionPerformed
 int Count=0;
 int Case;
int Monsters=0;
playerCharacter Init;
    private void PhaseChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhaseChangeActionPerformed
  
 if(Count==0){
       Init=PC;
 }
     
    Count++;
    //Attack
    if(Case==1){
           int Atk_pw2 = 0;
         if(Count==1){
            
              if(PC.get_charShape()=="Square"){
                 Atk_pw2=PC.get_quads(); 
             }
            if(PC.get_charShape()=="Circle"){
                 Atk_pw2=PC.get_eccentricity(); 
             }
               if(PC.get_charShape()=="Triangle"){
                 Atk_pw2=PC.get_acuteness(); 
                
             }
               
             
     BattleLabelDownText.setText("<html><body>The monster received damage!<br></body></html>"
     );
     int temp = Atk_pw2 - Adder.get_plasticity();
            ;
            if(temp>0){
                     temp = Adder.get_curhp()-temp;
         Adder.set_curhp(temp);
 HealthMonster.setValue(temp);
HealthMonster.setMaximum(Adder.get_maxhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp()); 
            }
    
    
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
       
                 
    }
    if(Count==4){
        
                           int temp = Adder.get_quads()-PC.get_plasticity();
                               if(temp>0){
                                       temp = PC.get_curhp()-temp;
                                   } else {
                                       temp = PC.get_curhp();
                                   }
        
             
                           PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
     
               
     BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
     
     
    }
    //Defend
        if(Case==2){
         if(Count==1){
     BattleLabelDownText.setText("<html><body>You prepare  to defend from the monster!<br></body></html>"
     );
     
     
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
    }
    if(Count==4){
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
                                   int temp = (int) (Adder.get_quads()*0.5 -PC.get_plasticity());
                                   if(temp>0){
                                       temp = PC.get_curhp()-temp;
                                   } else {
                                       temp = PC.get_curhp();
                                   }
               
               
                           PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());   
              

    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
        //Flee
            if(Case==3){
 
    if(Count==1){
             BattleLabelDownText.setText("<html><body>The monster try to follow you!<br></body></html>"
     );
      

    }
    if(Count==2){
        if(PC.get_sprightliness()<Adder.get_sprightliness()){
         
             BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>");
        } else{
             BattleLabelDownText.setText("<html><body>You fled from the monster!<br></body></html>");
        }
             
    }
    if(Count==3){
            if(PC.get_sprightliness()<Adder.get_sprightliness()){
         
      int temp = Adder.get_quads()-PC.get_plasticity();
               temp = PC.get_curhp()-temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>");
        } else{Monsters++;
                if(Monsters==1){
                    CountOkbutton=5;
          BattleModeOff();
                                        StoryMode();
                   if(PC.get_charShape()=="Triangle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
               if(PC.get_charShape()=="Square"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
                  if(PC.get_charShape()=="Circle"){
                    ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene6(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);
              }
                }
                if(Monsters==2){
                                                                       //Octopi
                                               Adder = new Creature();
Adder.set_maxhp(30);
Adder.set_curhp(30);
Adder.set_congruence(1);
Adder.set_quads(2);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);

PC.set_curhp(PC.get_maxhp());

                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Octopi(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                                                
                                                
                                                
                                                
                                                
                    
    }
                
                                                                   if(Monsters==3){
        
                                                                        //Geometree
                                               Adder = new Creature();
Adder.set_maxhp(50);
Adder.set_curhp(50);
Adder.set_congruence(1);
Adder.set_quads(6);
Adder.set_acuteness(2);
Adder.set_eccentricity(1);
Adder.set_experience(0);
Adder.set_plasticity(0);
Adder.set_sprightliness(1);

PC.set_curhp(PC.get_maxhp());

                  if(Path==1){
                  
        BattleMode();


HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());

MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());

PC.set_curhp(PC.get_maxhp());
PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
        
        
         ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N

     
            }
               if(Path==2){
                    BattleMode();

HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                    
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                  if(Path==3){
                       BattleMode();
       
HealthMonster.setMaximum(Adder.get_maxhp());
HealthMonster.setValue(Adder.get_curhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());


PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());
                       
                   ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Geometree(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
            }
                                                
                                                
                                                
                                                
                                                
                    }
                                                                                 if(Monsters==4){
                    CountOkbutton=12;
                    
                                                            BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

        
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Approach(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   

                                        }
                                      
         
                }
                
                
        }
        
        
  
   
        
            

         
 PlayerTurn();
               Count=0;
    }
   
    }
            
            //Pythagorean
                if(Case==4){
         if(Count==1){
                 PC.set_pythagoreanserum(PC.get_pythagoreanserum()-1);
     PithagoreanQty.setText(""+PC.get_pythagoreanserum());
     BattleLabelDownText.setText("<html><body>Your acuteness is incresed!<br></body></html>"
     );
     PC.set_acuteness(PC.get_acuteness()+2);
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
    }
    if(Count==4){
                           int temp = Adder.get_quads()-PC.get_plasticity();
               temp = PC.get_curhp()-temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
               //Bifurcator 
                    if(Case==5){
         if(Count==1){
               PC.set_bifurcator(PC.get_bifurcator()-1);
     BifurcatorQty.setText(""+PC.get_bifurcator());
                 int temp = 2;
            ;
     temp = Adder.get_curhp()-temp;
         Adder.set_curhp(temp);
 HealthMonster.setValue(temp);
HealthMonster.setMaximum(Adder.get_maxhp());
MonsterHealthText.setText(Adder.get_curhp()+"/"+Adder.get_maxhp());   
     BattleLabelDownText.setText("<html><body>The monster received damage!<br></body></html>"
     );
     
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
    }
    if(Count==4){
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
                              int temp = Adder.get_quads()-PC.get_plasticity();
               temp = PC.get_curhp()-temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
               //Crystal Math     
                        if(Case==6){
         if(Count==1){
               PC.set_crystalmath(PC.get_crystalmath()-1);
     CrystalMathQty.setText(""+PC.get_crystalmath());
             PC.set_sprightliness(PC.get_sprightliness()+5);
     BattleLabelDownText.setText("<html><body>Your speed is incresed!<br></body></html>"
     );
     
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
    }
    if(Count==4){
                           int temp = Adder.get_quads()-PC.get_plasticity();
               temp = PC.get_curhp()-temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
                        //Archimead
                            if(Case==7){
         if(Count==1){
     BattleLabelDownText.setText("<html><body>Your HP is recovered!<br></body></html>"
     );
     PC.set_archimead(PC.get_archimead()-1);
     ArchimeadQty.setText(""+PC.get_archimead());
       int temp = 5;
       if(PC.get_maxhp()>PC.get_curhp()+5){
             temp = PC.get_curhp()+temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp()); 
       } else {
            
         PC.set_curhp(PC.get_maxhp());
 PlayerHealth.setValue(PC.get_curhp());
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp()); 
       }
               
    }
    if(Count==2){
             BattleLabelDownText.setText("<html><body>Now it is monster turn!<br></body></html>"
     );

    }
    if(Count==3){
                 BattleLabelDownText.setText("<html><body>Monster attacked you!<br></body></html>"
     );
    }
    if(Count==4){
         BattleLabelDownText.setText("<html><body>You received damage!<br></body></html>"
     );
                              int temp = Adder.get_quads()-PC.get_plasticity();
               temp = PC.get_curhp()-temp;
         PC.set_curhp(temp);
 PlayerHealth.setValue(temp);
PlayerHealth.setMaximum(PC.get_maxhp());
PlayerHealthText.setText(PC.get_curhp()+"/"+PC.get_maxhp());  
    }
     if(Count==5){
             PlayerTurn();
                Count=0;
         }
    }
                            if(Case==8){
                                if(Count==1){MonsterTurn();
                                         BattleLabelDownText.setText("<html><body>You defeated the monster!<br></body></html>");
                                }
                                    if(Count==2){
                                         BattleLabelDownText.setText("<html><body>Your experience incresead!<br></body></html>");
                               PC.set_experience(PC.get_experience()+6);
                                    }
                                    if(Count==3){
                                        Monsters++;
                                        if(Monsters==1){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Sierpin-snow-skis(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_acuteness(PC.get_acuteness()+4);
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Spline(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_eccentricity(PC.get_eccentricity()+4);
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Brass-knuthles(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_quads(PC.get_quads()+4);
                                        }
                                      
                                        
                                            
                                        }
                                        if(Monsters==2){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Krig(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_eccentricity(PC.get_eccentricity()+1);
        PC.set_congruence(PC.get_congruence()+4);
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Krig(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
    PC.set_eccentricity(PC.get_eccentricity()+1);
        PC.set_congruence(PC.get_congruence()+4);
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Krig(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
         PC.set_eccentricity(PC.get_eccentricity()+1);
        PC.set_congruence(PC.get_congruence()+4);
                                        }
                                      
                                        
                                            
                                        }
                                        
                                              if(Monsters==3){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Fuzzy-boundary(Triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_plasticity(PC.get_plasticity()+4);
        
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Fuzzy-boundary(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
 PC.set_plasticity(PC.get_plasticity()+4);
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Fuzzy-boundary(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
     PC.set_plasticity(PC.get_plasticity()+4);
                                        }
                                      
                                        
                                            
                                        }
                                              
                                                            if(Monsters==4){
                                             BattleModeOff();
                                        StoryMode();
                                        if(PC.get_charShape()=="Triangle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Greeble(triangle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
        PC.set_quads(PC.get_quads()+4);
        PC.set_eccentricity(PC.get_eccentricity()+4);
        
        
                                        }
                                             if(PC.get_charShape()=="Circle"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Greeble(circle).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
   PC.set_quads(PC.get_quads()+4);
        PC.set_eccentricity(PC.get_eccentricity()+4);
        
                                        }
                                                  if(PC.get_charShape()=="Square"){
                                           ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Greeble(square).jpg");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon);   
   PC.set_quads(PC.get_quads()+4);
        PC.set_eccentricity(PC.get_eccentricity()+4);
                                        }
                                      
                                        
                                            
                                        }
                                         
                                        
                                        
                                     
                                        PlayerTurn();
                                        Count=0;
                                        
                                    }
                                
                            }
                            
                             if(Case==9){
                                if(Count==1){MonsterTurn();
                                         BattleLabelDownText.setText("<html><body>You are dead!<br></body></html>");
                                }
                                    if(Count==2){
                                    
                                          BattleLabelDownText.setText("<html><body>Game Over!<br></body></html>");
                                        
                                      
                                    }
                                      if(Count==3){
                                    
                                          Count=0;
                                        
                                      
                                    }
                                  
                                
                            }
                            
                            if(Adder.get_curhp()<1 && Case!=8){
                                Case=8;
                                Count=0;
                                PC=Init;
                            }
                            if(PC.get_curhp()<1 && Case!=9){
                                Case=9;
                                Count=0;
                                
                            }

    }//GEN-LAST:event_PhaseChangeActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
      super.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed
int Path;
public class Creature
{
	private int curhp, maxhp, congruence, quads, acuteness, eccentricity, experience, plasticity, sprightliness;
	
	// Getter methods for stats:
	
	// Returns current Health
	public int get_curhp()
	{
		return curhp;
	}
	// Returns maximum Health
	public int get_maxhp()
	{
		return maxhp;
	}
	// Returns congruence (cha)
	public int get_congruence()
	{
		return congruence;
	}
	// Returns quads (str)
	public int get_quads()
	{
		return quads;
	}
	// Returns acuteness (dex)
	public int get_acuteness()
	{
		return acuteness;
	}
	// Returns eccentricity (wis)
	public int get_eccentricity()
	{
		return eccentricity;
	}
	// Returns experience
	public int get_experience()
	{
		return experience;
	}
	// Returns plasticity (def)
	public int get_plasticity()
	{
		return plasticity;
	}
	// Returns sprightliness (spd)
	public int get_sprightliness()
	{
		return sprightliness;
	}
	
	// Setter methods for same:
	
	public void set_curhp(int newval)
	{
		curhp = newval;
	}
	public void set_maxhp(int newval)
	{
		maxhp = newval;
	}
	public void set_congruence(int newval)
	{
		congruence = newval;
	}
	public void set_quads(int newval)
	{
		quads = newval;
                
	}
	public void set_acuteness(int newval)
	{
		acuteness = newval;
	}
	public void set_eccentricity(int newval)
	{
		eccentricity = newval;
	}
	public void set_experience(int newval)
	{
		experience = newval;
	}
	public void set_plasticity(int newval)
	{
		plasticity = newval;
	}
	public void set_sprightliness(int newval)
	{
		sprightliness = newval;
	}
}


/* playerCharacter.java
*  Author: Samuel Lamb
*  KUID 2118080
*  Last Change: 2014-12-8
*/

public class playerCharacter extends Creature
{
	// Shape is (roughly) the character's class
	// It has three acceptable values: "Square", "Triangle", and "Circle" (note the caps)
	private String charShape;
	
	// These variables correspond to the experience price for improving each stat
	private int hpprice = 1;
	private int congruenceprice = 1;
	private int quadsprice = 1;
	private int acutenessprice = 1;
	private int eccentricityprice = 1;
	private int plasticityprice = 1;
	private int sprightlinessprice = 1;
	
	// Utility item quantities:
	private int archimead = 0;
	private int crystalmath = 0;
	private int bifurcator = 0;
	private int pythagoreanserum = 0;
	
	// Boolean array of wearable items (True = in inventory, not worn)
	private boolean[] inventory = new boolean [10] ;
	
	private String wearing = "";
	
	// Getter method for charShape:
	public String get_charShape()
	{
		return charShape;
	}
	
	// Setter method for charShape:
	public void set_charShape(String newshape)
	{
		charShape = newshape;
	}
	
	// Getter methods for items:
	public int get_archimead()
	{
		return archimead;
	}
	public int get_crystalmath()
	{
		return crystalmath;
	}
	public int get_bifurcator()
	{
		return bifurcator;
	}
	public int get_pythagoreanserum()
	{
		return pythagoreanserum;
	}
	public boolean get_inventory(int target)
	{
		return inventory[target];
	}
	
	// Setters for items:
	public void set_archimead(int newval)
	{
		archimead = newval;
	}
	public void set_crystalmath(int newval)
	{
		crystalmath = newval;
	}
	public void set_bifurcator(int newval)
	{
		bifurcator = newval;
	}
	public void set_pythagoreanserum(int newval)
	{
		pythagoreanserum = newval;
	}
	public void set_inventory(int target, boolean val)
	{
		inventory[target] = val;
	}
	
	// Getter methods for prices:
	public int get_hpprice()
	{
		return hpprice;
	}
	public int get_congruenceprice()
	{
		return congruenceprice;
	}
		public int get_quadsprice()
	{
	return quadsprice;
	}
		public int get_acutenessprice()
	{
	return acutenessprice;
	}
		public int get_eccentricityprice()
	{
		return eccentricityprice;
	}
	public int get_plasticityprice()
	{
		return plasticityprice;
	}
	public int get_sprightlinessprice()
	{
		return sprightlinessprice;
	}
	public String get_wearing()
	{
		return wearing;
	}
	
	// Setter methods for prices:
	public void set_hpprice(int newval)
	{
	hpprice = newval;
	}
	public void set_congruenceprice(int newval)
	{
	congruenceprice = newval;
	}
	public void set_quadsprice(int newval)
	{
	quadsprice = newval;
	}
	public void set_acutenessprice(int newval)
	{
	acutenessprice = newval;
	}
	public void set_eccentricityprice(int newval)
	{
	eccentricityprice = newval;
	}
	public void set_plasticityprice(int newval)
	{
	plasticityprice = newval;
	}
	public void set_sprightlinessprice(int newval)
	{
	sprightlinessprice = newval;
	}
	public void set_wearing(String newwear)
	{
		wearing = newwear;
	}
	
	// Stat increase method
	public boolean increasecongruence()
	{
		if (get_experience() >= congruenceprice)
		{
			// Deduct experience price
			set_experience(get_experience() - congruenceprice);
			// Increment price for next time
			if((int)(congruenceprice*1.5) == congruenceprice)
			{
				congruenceprice = congruenceprice * 2;
			}
			else
			{
				congruenceprice = (int)(congruenceprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_congruence(get_congruence() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasehp()
	{
		if (get_experience() >= hpprice)
		{
			// Deduct experience price
			set_experience(get_experience() -hpprice);
			// Increment price for next time
			if((int)(hpprice*1.5) == hpprice)
			{
				hpprice = hpprice * 2;
			}
			else
			{
				hpprice = (int)(hpprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_maxhp(get_maxhp() + 5);
			set_curhp(get_curhp() + 3);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasequads()
	{
		if (get_experience() >= quadsprice)
		{
			// Deduct experience price
			set_experience(get_experience() -quadsprice);
			// Increment price for next time
			if((int)(quadsprice*1.5) == quadsprice)
			{
				quadsprice = quadsprice * 2;
			}
			else
			{
				quadsprice = (int)(quadsprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_quads(get_quads()+ 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseacuteness()
	{
		if (get_experience() >= acutenessprice)
		{
			// Deduct experience price
			set_experience(get_experience() -acutenessprice);
			// Increment price for next time
			if((int)(acutenessprice*1.5) == acutenessprice)
			{
				acutenessprice = acutenessprice * 2;
			}
			else
			{
				acutenessprice = (int)(acutenessprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_acuteness(get_acuteness() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseeccentricity()
	{
		if (get_experience() >= eccentricityprice)
		{
			// Deduct experience price
			set_experience(get_experience() -eccentricityprice);
			// Increment price for next time
			if((int)(eccentricityprice*1.5) == eccentricityprice)
			{
				eccentricityprice = eccentricityprice * 2;
			}
			else
			{
				eccentricityprice = (int)(eccentricityprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_eccentricity(get_eccentricity()+ 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increaseplasticity()
	{
		if (get_experience() >= plasticityprice)
		{
			// Deduct experience price
			set_experience(get_experience() -plasticityprice);
			// Increment price for next time
			if((int)(plasticityprice*1.5) == plasticityprice)
			{
				plasticityprice = plasticityprice * 2;
			}
			else
			{
				plasticityprice = (int)(plasticityprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_plasticity(get_plasticity() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean increasesprightliness()
	{
		if (get_experience() >= sprightlinessprice)
		{
			// Deduct experience price
			set_experience(get_experience() -sprightlinessprice);
			// Increment price for next time
			if((int)(sprightlinessprice*1.5) == sprightlinessprice)
			{
				sprightlinessprice=sprightlinessprice * 2;
			}
			else
			{
				sprightlinessprice = (int)(sprightlinessprice*1.5);
			}
			// Increment stat
			// May wish to change expansion rate later
			set_sprightliness(get_sprightliness() + 5);
			return true;
		}
		else 
		{
			return false;
		}
	}

	// Utility item usage methods:
	
	// Archimead heals 5 HP
	public boolean usearchimead()
	{
		if(archimead >= 1)
		{
			// remove item
			archimead -= 1;
			// use item
			if(get_curhp() + 5 < get_maxhp())
			{
				set_curhp(get_curhp() +5);
			}
			else
			{
				set_curhp(get_maxhp());
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// HEY COMBAT PERSON! This causes damage!
	// Bifurcators do 2 unblockable damage
	public boolean usebifurcator(Creature target)
	{
		if(bifurcator >= 1)
		{
			// remove item
			bifurcator -= 1;
			// use item
			target.set_curhp(target.get_curhp() - 2);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/* HEY COMBAT PERSON!
	* These next items should give a temporary bonus for
	* the current combat only. Not sure how you want to 
	* swing that. So, for now, they just return false. */
	
	// The Pythagorean Serum increases acuteness
	public boolean usepythagoreanserum()
	{
	
		return false;
	}
	
	// Crystal Math increases your speed
	// It may have side effects.
	public boolean usecrystalmath()
	{
	
		return false;
	}
	
	// Wear wearable items:
	public boolean wearitem(String towear)
	{
		// If you're already wearing something, you need to remove it, first.
		// Why? Because I said so. That's why.
		if (!wearing.equals(""))
		{
			return false;
		}
		else
		{
			// The values below are entirely negotiable
			
			
			// This is a messy way to do this, but it works.
			if (towear.equals("Spline") && inventory[0])
			{
				set_eccentricity(get_eccentricity()+4);
				inventory[0] = false;
			}
			else if (towear.equals("Krig") && inventory[1])
			{
				if(get_eccentricity()<3)
				{
					return false;
				}
				else 
				{
					set_eccentricity(get_eccentricity()-3);
					set_congruence(get_congruence()+4);
					inventory[1] = false;
				}
			}
			else if (towear.equals("Sierpin Snow-Skis") && inventory[2])
			{
				set_acuteness(get_acuteness()+4);
				inventory[2] = false;
			}
			else if (towear.equals("Strange Attractor") && inventory[3])
			{
				set_congruence(get_congruence()+2);
				inventory[3] = false;
			}
			else if (towear.equals("Axe of Choice") && inventory[4])
			{
				set_quads(get_quads()+4);
				inventory[4] = false;
			}
			else if (towear.equals("Fuzzy Boundary") && inventory[5])
			{
				if (get_congruence() < 4)
				{
					return false;
				}
				else
				{
					set_congruence(get_congruence()-4);
					set_plasticity(get_plasticity()+5);
					inventory[5] = false;
				}
			}
			else if (towear.equals("Lacy GÃ¶del") && inventory[6])
			{
				set_congruence(get_congruence()+5);
				inventory[6] = false;
			}
			else if (towear.equals("Gauss Hand-Cannon") && inventory[7])
			{
				set_acuteness(get_acuteness()+4);
				inventory[7] = false;
			}
			else if (towear.equals("Brass Knuthles") && inventory[8])
			{
				set_quads(get_quads()+3);
				inventory[8] = false;
			}
			else if (towear.equals("Greeble") && inventory[9])
			{
				if(get_congruence()<5)
				{
					return false;
				}
				else
				{
					set_congruence(get_congruence()-5);
					set_quads(get_quads()+4);
					set_eccentricity(get_eccentricity()+5);
					inventory[9] = false;
				}
			}
			else
			{
				// You have to wear an item that's in the game
				return false;
			}
			set_wearing(towear);
			return true;
		}
	}
	
	// remove wearable items:
	public boolean removeitem()
	{
		// If you're not wearing something, you can't remove it.
		// Why? Because you'll break the universe. That's why.
		if (wearing.equals(""))
		{
			return false;
		}
		else
		{
			// The values below NEED to match those in wearitem
			
			
			if (wearing.equals("Spline"))
			{
				set_eccentricity(get_eccentricity()-4);
			}
			else if (wearing.equals("Krig"))
			{
					set_eccentricity(get_eccentricity()+3);
					set_congruence(get_congruence()-4);
			}
			else if (wearing.equals("Sierpin Snow-Skis"))
			{
				set_acuteness(get_acuteness()-4);
			}
			else if (wearing.equals("Strange Attractor"))
			{
				set_congruence(get_congruence()-2);
			}
			else if (wearing.equals("Axe of Choice"))
			{
				set_quads(get_quads()-4);
			}
			else if (wearing.equals("Fuzzy Boundary"))
			{
					set_congruence(get_congruence()+4);
					set_plasticity(get_plasticity()-5);

			}
			else if (wearing.equals("Lacy GÃ¶del"))
			{
				set_congruence(get_congruence()-5);
			}
			else if (wearing.equals("Gauss Hand-Cannon"))
			{
				set_acuteness(get_acuteness()-4);
			}
			else if (wearing.equals("Brass Knuthles"))
			{
				set_quads(get_quads()-3);
			}
			else if (wearing.equals("Greeble"))
			{
					set_congruence(get_congruence()+5);
					set_quads(get_quads()-4);
					set_eccentricity(get_eccentricity()-5);
			}
			else
			{
				// You have already broken the item system.
				// You will not break it further.
				
				// Live with your shame.
				return false;
			}
			set_wearing("");
			return true;
		}
	}
	
	// Character creation method (?):
	/* Don't know if we want to do this here,
	*  or if that's a GUI sort of thing. */
	
	
}


public void SetOkbutton(){
        Okbutton.setSize(290*x/1920,100*y/1080);
        Okbutton.setLocation(1570*x/1920, 80*y/1080);
         OkText.setSize(170*x/1920,60*y/1080);
        OkText.setLocation(1630*x/1920, 100*y/1080);
        Font Continue=new Font("Arial",Font.PLAIN,(int) 36*x/1920);
        OkText.setFont(Continue);
        ImageIcon b = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\okbutton.png");
   
        ImageIcon icon1=new ImageIcon(ScaledImage(b,Okbutton.getWidth(),Okbutton.getHeight()));
       Okbutton.setIcon(icon1);
}
    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed
       Path=1;
      ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene3(triangle).jpg");
        ImageIcon icon3=new ImageIcon(ScaledImage(c,BackGround.getWidth(),BackGround.getHeight()));
       Triangle.setSize(0,0);
       Square.setSize(0,0);
       Circle.setSize(0,0);
      SetOkbutton();
       BackGround.setIcon(icon3);
       
          

PC.set_charShape("Triangle");

    }//GEN-LAST:event_TriangleActionPerformed

    private void CircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleActionPerformed
Path=3;
      ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene3(circle).jpg");
        ImageIcon icon3=new ImageIcon(ScaledImage(c,BackGround.getWidth(),BackGround.getHeight()));
       Triangle.setSize(0,0);
       Square.setSize(0,0);
       Circle.setSize(0,0);
      SetOkbutton();
       BackGround.setIcon(icon3);

PC.set_charShape("Circle");

       
       
    }//GEN-LAST:event_CircleActionPerformed

    

    
    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
Path=2;
      ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\Scene3(square).jpg");
        ImageIcon icon3=new ImageIcon(ScaledImage(c,BackGround.getWidth(),BackGround.getHeight()));
       Triangle.setSize(0,0);
       Square.setSize(0,0);
       Circle.setSize(0,0);
      SetOkbutton();
       BackGround.setIcon(icon3);
       

PC.set_charShape("Square");
    }//GEN-LAST:event_SquareActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArchimeadButton;
    private javax.swing.JLabel ArchimeadQty;
    private javax.swing.JLabel ArchimedeText;
    private javax.swing.JButton AttackButton;
    private javax.swing.JLabel AttackButtonText;
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel BattleLabelDown;
    private javax.swing.JLabel BattleLabelDownText;
    private javax.swing.JLabel BattleLabelInventory;
    private javax.swing.JLabel BattleLabelOptions;
    private javax.swing.JButton BifurcatorButton;
    private javax.swing.JLabel BifurcatorQty;
    private javax.swing.JLabel BifurcatorText;
    private javax.swing.JButton Circle;
    private javax.swing.JButton CrystalMathButton;
    private javax.swing.JLabel CrystalMathQty;
    private javax.swing.JLabel CrystalMathText;
    private javax.swing.JButton DefendButton;
    private javax.swing.JLabel DefendText;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton FleeButton;
    private javax.swing.JLabel FleeText;
    private javax.swing.JProgressBar HealthMonster;
    private javax.swing.JButton ItemButton;
    private javax.swing.JLabel ItemText;
    private javax.swing.JLabel MonsterHealthText;
    private javax.swing.JLabel MsgText;
    private javax.swing.JLabel OkText;
    private javax.swing.JButton Okbutton;
    private javax.swing.JButton PhaseChange;
    private javax.swing.JLabel PhaseChangeText;
    private javax.swing.JButton PithagoreanButton;
    private javax.swing.JLabel PithagoreanQty;
    private javax.swing.JLabel PithagoreanText;
    private javax.swing.JProgressBar PlayerHealth;
    private javax.swing.JLabel PlayerHealthText;
    private javax.swing.JButton Square;
    private javax.swing.JButton Triangle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables








}
