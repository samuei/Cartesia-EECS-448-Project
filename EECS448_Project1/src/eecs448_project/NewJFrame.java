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
    int sizeBattleButtony=100;
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
    
    public void BattleMode(){
                this.setAlwaysOnTop(false);
        this.setAutoRequestFocus(true);
        
          Toolkit tk=Toolkit.getDefaultToolkit();
       //Setting sizes and locations
        x = (int) tk.getScreenSize().getWidth();
         y = (int) tk.getScreenSize().getHeight();
     this.setSize(x, y);
     

  
     
     //Labels
       BackGround.setSize(x*1440/1920,y*810/1080);
     ImageIcon a = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\1.jpg");
   
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N\
        
         BattleLabelDown.setSize(880*x/1920,y*270/1080);
         BattleLabelDown.setLocation(0, y*(810)/1080);
           ImageIcon b = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\LabelDown.png");
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
     ImageIcon c = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\OptionLabel.png");
            ImageIcon icon3=new ImageIcon(ScaledImage(c,BattleLabelOptions.getWidth(),BattleLabelOptions.getHeight()));
            BattleLabelOptions.setIcon(icon3);
    
     BattleLabelInventory.setSize(480*x/1920,y*810/1080);
     BattleLabelInventory.setLocation(1440*x/1920, 0);
         ImageIcon d = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\Inventory Buttons.png");
            ImageIcon icon4=new ImageIcon(ScaledImage(d,BattleLabelInventory.getWidth(),BattleLabelInventory.getHeight()));
            BattleLabelInventory.setIcon(icon4);
   
    

       
     
     //Option Buttons

      ImageIcon e = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleButton.png");
            ImageIcon icon5=new ImageIcon(ScaledImage(e, (int) (AttackButton.getWidth()*0.7), (int) (AttackButton.getHeight()*0.7)));
      
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
  
    
     ImageIcon f = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\BattleItemButton.png");
            ImageIcon icon6=new ImageIcon(ScaledImage(f, (int) (AttackButton.getWidth()*0.8), (int) (AttackButton.getHeight()*0.95)));
      
    
    BifurcatorButton.setSize(0,0);
    BifurcatorButton.setLocation(1463*x/1920, 377*y/1080);
    BifurcatorButton.setIcon(icon6);
    CrystalMathButton.setSize(0,0);
    CrystalMathButton.setLocation(1463*x/1920,512*y/1080);
    CrystalMathButton.setIcon(icon6);
    ArchimeadButton.setSize(0,0);
    ArchimeadButton.setLocation(1463*x/1920,648*y/1080);
    ArchimeadButton.setIcon(icon6);
    PithagoreanButton.setSize(0,0);
    PithagoreanButton.setLocation(1463*x/1920, 240*y/1080);
    PithagoreanButton.setIcon(icon6);
               
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
  AttackButtonText.setLocation(1130*x/1920, 840*y/1080);
  AttackButtonText.setFont(Options);
    DefendText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    DefendText.setLocation(1580*x/1920, 840*y/1080);
    DefendText.setFont(Options);
    ItemText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    ItemText.setLocation(1140*x/1920,960*y/1080);
    ItemText.setFont(Options);
    FleeText.setSize(sizeBattleOptionButtonTextx,sizeBattleOptionButtonTexty);
    FleeText.setLocation(1620*x/1920,960*y/1080);
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
         PlayerHealthMonster.setSize(600*x/1920,80*y/1080);
     PlayerHealthMonster.setLocation(60*x/1920,40*y/1080);
     PlayerHealthMonster.setValue(100);
     
       //Monster Health Text
   MonsterHealthText.setSize(340*x/1920,50*y/1080);
    MonsterHealthText.setLocation(280*x/1920, 140*y/1080);
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
        
            BifurcatorButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
  

    CrystalMathButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
  
    
    ArchimeadButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);

   
    PithagoreanButton.setSize(sizeBattleInventoryButtonx,sizeBattleInventoryButtony);
    
    
        
    }
        public void ItemsOff(){
        
            BifurcatorButton.setSize(0,0);
  

    CrystalMathButton.setSize(0,0);
  
    
    ArchimeadButton.setSize(0,0);

   
    PithagoreanButton.setSize(0,0);
    
    
        
    }
    
   
         
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
        Okbutton.setSize(290*x/1920,100*y/1080);
        Okbutton.setLocation(1570*x/1920, 940*y/1080);
         ImageIcon b = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\okbutton.png");
   
        ImageIcon icon1=new ImageIcon(ScaledImage(b,Okbutton.getWidth(),Okbutton.getHeight()));
       Okbutton.setIcon(icon1);
        OkText.setSize(170*x/1920,60*y/1080);
        OkText.setLocation(1630*x/1920, 960*y/1080);
        Font Continue=new Font("Arial",Font.PLAIN,(int) 36*x/1920);
        OkText.setFont(Continue);
        
         
         
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
        PlayerHealthMonster = new javax.swing.JProgressBar();
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

        PlayerHealthMonster.setBackground(new java.awt.Color(255, 255, 255));
        PlayerHealthMonster.setForeground(new java.awt.Color(0, 204, 0));
        PlayerHealthMonster.setValue(10);
        PlayerHealthMonster.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(PlayerHealthMonster);
        PlayerHealthMonster.setBounds(60, 40, 0, 0);

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

        Square.setIcon(new javax.swing.ImageIcon("C:\\Users\\Danilo\\Desktop\\Final Project\\okbutton.png")); // NOI18N
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
            ImageIcon b = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\scene2.jpg");
        ImageIcon icon2=new ImageIcon(ScaledImage(b,Triangle.getWidth(),Triangle.getHeight()));
        Triangle.setIcon(icon2); 
       Square.setLocation(500*x/1920,500*y/1080);
       Circle.setLocation(900*x/1920,500*y/1080);
              ImageIcon d = new javax.swing.ImageIcon("C:\\\\Users\\\\Danilo\\\\Documents\\\\NetBeansProjects\\\\EECS448_Project1\\\\Images\\\\circle.png");
        ImageIcon icon4=new ImageIcon(ScaledImage(d,Circle.getWidth(),Circle.getHeight()));
        Triangle.setIcon(icon4); 
       Okbutton.setSize(0,0);
        }
        
        if(CountOkbutton==2){
             ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\3.png");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
        MsgText.setText("<html><body>So, I decided to write my own world...<br></body></html>");

        }
          if(CountOkbutton==3){
             ImageIcon a = new javax.swing.ImageIcon("C:\\Users\\Danilo\\Documents\\NetBeansProjects\\EECS448_Project1\\Images\\4.png");
        ImageIcon icon=new ImageIcon(ScaledImage(a,BackGround.getWidth(),BackGround.getHeight()));
        BackGround.setIcon(icon); // NOI18N
        OkText.setSize(0, 0);
        Okbutton.setSize(0,0);
      
        MsgText.setSize(0,0);
 
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
    private void PhaseChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhaseChangeActionPerformed
   
    Count++;
    //Attack
    if(Case==1){
         if(Count==1){
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
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
    //Defend
        if(Case==2){
         if(Count==1){
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
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
        //Flee
            if(Case==3){
         if(Count==1){
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
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
            //Pythagorean
                if(Case==4){
         if(Count==1){
     BattleLabelDownText.setText("<html><body>Your acuteness is incresed!<br></body></html>"
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
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
               //Bifurcator 
                    if(Case==5){
         if(Count==1){
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
        
    }
     if(Count==5){
             PlayerTurn();
               Count=0;
         }
    }
               //Crystal Math     
                        if(Case==6){
         if(Count==1){
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
        
    }
     if(Count==5){
             PlayerTurn();
                Count=0;
         }
    }

    }//GEN-LAST:event_PhaseChangeActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
      super.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void TriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TriangleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TriangleActionPerformed

    private void CircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CircleActionPerformed

    private void SquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JProgressBar PlayerHealthMonster;
    private javax.swing.JLabel PlayerHealthText;
    private javax.swing.JButton Square;
    private javax.swing.JButton Triangle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables








}
