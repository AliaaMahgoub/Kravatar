import java.util.Scanner;

/**
 *
 * @author Aliaa Mahgoub
 */
public class Home extends javax.swing.JFrame
{
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Scanner myScan = new Scanner(System.in);
    private static boolean isSignedUp;
    private static boolean isLoggedIn;

    public Home()
    {
        super("home");
        start();
    }
    @SuppressWarnings("unchecked")
    public void start()
    {
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 153));
        jLabel2.setText(" KRAVATAR");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("create & save avatars");

        jButton3.setBackground(new java.awt.Color(181, 212, 228));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 153));
        jButton3.setText("SIGN UP");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(181, 212, 228));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 153));
        jButton4.setText("LOG IN");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(26, 47, Short.MAX_VALUE))
        );

        pack();
    }
    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
    {
        if (isSignedUp)
        {
            System.out.println(ConsoleColors.BLUE_BOLD + "LOG IN");
            System.out.print(ConsoleColors.BLUE_BOLD + "USERNAME: " + ConsoleColors.RESET);
            String user = myScan.nextLine();
            System.out.print(ConsoleColors.BLUE_BOLD + "PASSWORD: " + ConsoleColors.RESET);
            String password = myScan.nextLine();
            if (searchUser(new User(user, password)))
            {
                isLoggedIn = true;
                System.out.println("\nLog in successful!\n");
                this.setVisible(false);
            }
            else System.out.println("\nIncorrect username or password. Please click on \"LOG IN\" and try again.");
        }
        else System.out.println(ConsoleColors.BLUE_BOLD + "\nYou must sign up to log in.\n");
    }
    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.out.println(ConsoleColors.BLUE_BOLD + "SIGN UP");
        System.out.print(ConsoleColors.BLUE_BOLD + "USERNAME: " + ConsoleColors.RESET);
        String user = myScan.nextLine();
        System.out.print(ConsoleColors.BLUE_BOLD + "PASSWORD: " + ConsoleColors.RESET);
        String password = myScan.nextLine();
        boolean isFound = false;
        for (Object i: Main.getUserArr()) if (new User(user, password).equals((User)i)) isFound=true;
        if (!isFound)
        {
            Main.addUser(new User(user, password));
            isSignedUp = true;
            System.out.println("\n" + ConsoleColors.BLUE_BOLD + "Sign up complete!\n" + ConsoleColors.RESET + (new User(user, password)).toString());
            System.out.println("\nPlease select an option from the menu.\n");
        }
        else System.out.println("Try signing up with a different username.");
    }
    public boolean searchUser(User x)
    {
        for (User i: Main.getUserArr())
            if (x.getUser().equals(i.getUser()) && x.getPassword().equals(i.getPassword()))
            {
                Main.setCurrentUser(i);
                return true;
            }
        return false;
    }
    public boolean getIsSignedUp() {return isSignedUp;}
    public static boolean getIsLoggedIn() {return isLoggedIn;}
    public void setIsLoggedIn(boolean b) {isLoggedIn = b;}
    public String toString() {return "the home class, aka the intro page.";}
    public boolean equals(Home h) {return (h.getIsLoggedIn() == isLoggedIn);}
}
