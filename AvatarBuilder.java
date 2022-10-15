import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 *
 * @author Aliaa Mahgoub
 */

public class AvatarBuilder extends JFrame
{
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton7;
    private JButton jButton8;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
//    private javax.swing.JMenu jMenu4;
//    private javax.swing.JMenuBar jMenuBar1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JTextField jTextField1;

    private static String name;
    private static String oldName;
    String[] eyesArr = {"/eyes1.png","/eyes2.png","/eyes3.png","/eyes4.png","/eyes5.png"};
    Object[] mouthArr = {"/mouth1.png","/mouth2.png","/mouth3.png","/mouth4.png","/mouth5.png"};
    int[][] colorArr = {{153,204,255},{153,153,255},{255,153,153},{153,255,153},{255,153,102},{255,204,102}};
    int eyesIndex = -1;
    int mouthIndex =-1;
    int colorIndex = -1;

    public AvatarBuilder()
    {
        start();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void start() {
//        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new JPanel();
        jPanel1 = new JPanel();
        jLabel5 = new JLabel();
        jPanel3 = new JPanel();
        jLabel6 = new JLabel();
        jButton7 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton8 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jLabel4 = new JLabel();
        jButton1 = new JButton();
//        jMenuBar1 = new javax.swing.JMenuBar();
//        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(215, 228, 235));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 180));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(186, 186, 186))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(360, 180));

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 372, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 372, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton7.setBackground(new java.awt.Color(242, 242, 242));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 102, 153));
        jButton7.setText(">");
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(242, 242, 242));
        jButton10.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 102, 153));
        jButton10.setText(">");
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(242, 242, 242));
        jButton11.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 102, 153));
        jButton11.setText(">");
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(242, 242, 242));
        jButton15.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton15.setForeground(new java.awt.Color(0, 102, 153));
        jButton15.setText("<");
        jButton15.setBorder(null);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(242, 242, 242));
        jButton16.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton16.setForeground(new java.awt.Color(0, 102, 153));
        jButton16.setText("<");
        jButton16.setBorder(null);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(242, 242, 242));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 153));
        jButton8.setText("<");
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 153));
        jLabel1.setText("EYES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText("MOUTH");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("COLOR");

        jTextField1.setText("");
//        jTextField1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jTextField1ActionPerformed(evt);
//            }
//        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("NAME YOUR AVATAR!");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

//        jMenu4.setBackground(new java.awt.Color(0, 102, 153));
//        jMenu4.setForeground(new java.awt.Color(0, 102, 153));
//        jMenu4.setText("CANCEL");
//        jMenuBar1.add(jMenu4);
//
//        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2))
                                        .addComponent(jLabel3, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(44, 44, 44)
                                                                                .addComponent(jLabel1)))
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(28, 28, 28)
                                                                                .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(73, 73, 73)
                                                                                .addComponent(jLabel2)))
                                                                .addGap(28, 28, 28)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton16, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(35, 35, 35))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }

    public void jButton7ActionPerformed(ActionEvent evt) {
        if (eyesIndex==4) eyesIndex = 0;
        else eyesIndex++;
        jLabel5.setIcon(new ImageIcon(getClass().getResource(eyesArr[eyesIndex])));
    }

    public void jButton10ActionPerformed(ActionEvent evt) {
        if (colorIndex==5) colorIndex = 0;
        else colorIndex++;
        jPanel1.setBackground(new java.awt.Color(colorArr[colorIndex][0], colorArr[colorIndex][1], colorArr[colorIndex][2]));
        jPanel3.setBackground(new java.awt.Color(colorArr[colorIndex][0], colorArr[colorIndex][1], colorArr[colorIndex][2]));
    }

    public void jButton11ActionPerformed(ActionEvent evt) {
        if (mouthIndex==4) mouthIndex = 0;
        else mouthIndex++;
        jLabel6.setIcon(new ImageIcon(getClass().getResource((String) mouthArr[mouthIndex])));
    }

    public void jButton15ActionPerformed(ActionEvent evt) {
        if (mouthIndex<=0) mouthIndex = 4;
        else mouthIndex--;
        jLabel6.setIcon(new ImageIcon(getClass().getResource((String) mouthArr[mouthIndex])));
    }

    public void jButton16ActionPerformed(ActionEvent evt) {
        if (colorIndex<=0) colorIndex = 5;
        else colorIndex--;
        jPanel1.setBackground(new java.awt.Color(colorArr[colorIndex][0], colorArr[colorIndex][1], colorArr[colorIndex][2]));
        jPanel3.setBackground(new java.awt.Color(colorArr[colorIndex][0], colorArr[colorIndex][1], colorArr[colorIndex][2]));
    }

    public void jButton8ActionPerformed(ActionEvent evt) {
        if (eyesIndex<=0) eyesIndex = 4;
        else eyesIndex--;
        jLabel5.setIcon(new ImageIcon(getClass().getResource(eyesArr[eyesIndex])));
    }

    public void jButton1ActionPerformed(ActionEvent evt)
    {
        if (!Main.getIsEditing())
        {
            name = jTextField1.getText();
            Main.getCurrentUser().addAvatar(name);
            Main.setIsAdding(false);
        }
        else
        {
            oldName = Main.getCurrentUser().getAvatars().get(Main.getCurrentIndex());
            name = jTextField1.getText();
            Main.getCurrentUser().getAvatars().set(Main.getCurrentIndex(), name);
            Main.setIsEditing(false);
        }
        this.setVisible(false);
    }

    public void capture()
    {
        try
        {
            BufferedImage img = new BufferedImage(jPanel2.getWidth(), jPanel2.getHeight(), BufferedImage.TYPE_INT_RGB);
            jPanel2.paint(img.getGraphics());
            File outputFile = new File(name + ".png");
            ImageIO.write(img, "png", outputFile);
        }
        catch (Exception x)
        {
            System.out.println("trouble with screenshot");
        }
    }

    public JLabel getjLabel1() {return jLabel1;}
    public static String getNamee() {return name;}
    public static String getOldName() {return oldName;}
    public String toString() {return "the avatar builder class, where you can create avatars.";}
    public boolean equals(AvatarBuilder a) {return (a.getjLabel1().equals(jLabel1));}
}
