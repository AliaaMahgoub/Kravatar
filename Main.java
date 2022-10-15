import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Main extends JPanel
{
    private static ArrayList<JFrame> guiArr = new ArrayList<JFrame>();
    private static ArrayList userArr = new ArrayList();
    private static User currentUser;
    private static User[][] altUsers= {{currentUser,currentUser},{currentUser,currentUser}};
    private static Home home = new Home();
    private static JFrame avatarBuilder = new AvatarBuilder();
    private static boolean isEditing = false;
    private static boolean isAdding = false;
    private static int currentIndex;

    public Main()
    {
        super();
    }

    public static void main(String[] args) throws IOException, Exception
    {
        guiArr.add(home);

        Scanner myScan = new Scanner(System.in);

        System.out.println("\nWelcome to KRAVATAR Please select your choice from the menu.");
        home.setVisible(true);
        while (!Home.getIsLoggedIn())
        {
            System.out.print("");
        }
        start();
    }
    public static void addUser(User x)
    {
        userArr.add(x);
    }
    public static void start()
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        for (int i = 0; i<arr.size(); i++)
        {
            if (arr.get(i)<2)
            {
                arr.remove(i);
                i--;
            }
        }
        for (int c = 0; c< altUsers[0].length; c++)
        {
            for (int r = 0; r< altUsers.length; r++)
            {
                System.out.print("...");
            }
            System.out.println();
        }
        for (User[] r: altUsers)
        {
            for (User c: r)
            {
                System.out.print("...");
            }
            System.out.println();
        }
        Scanner myScan = new Scanner(System.in);
        System.out.println("Let's start managing your avatars.");
        System.out.println("Here are your options: " + ConsoleColors.BLUE_BOLD + "\n(1) " + ConsoleColors.BLUE_BOLD + "Add avatar" + ConsoleColors.BLUE_BOLD + "\n(2) " + ConsoleColors.BLUE_BOLD + "Download avatar" + ConsoleColors.BLUE_BOLD + "\n(3) " + ConsoleColors.BLUE_BOLD + "Swap avatar" + ConsoleColors.BLUE_BOLD + "\n(4) " + ConsoleColors.BLUE_BOLD + "Remove avatar" + ConsoleColors.BLUE_BOLD + "\n(5) " + ConsoleColors.BLUE_BOLD + "Status report" + ConsoleColors.BLUE_BOLD + "\n(6) " + ConsoleColors.BLUE_BOLD + "Log out" + "\n(7) " + ConsoleColors.BLUE_BOLD + "Sort" +ConsoleColors.RESET + "\n\nEnter the corresponding number: ");
        String userFinalAns = "";
        int userAnswer = Integer.parseInt(myScan.nextLine());
        while (userAnswer != Integer.MAX_VALUE) {
            if (userAnswer == 1)
            {
                System.out.println("Create an avatar, name it, and click \"SAVE\" when you are done.");
                avatarBuilder.setVisible(true);
                isAdding = true;
                while (isAdding)
                {
                    System.out.print("");
                }
                currentIndex = currentUser.getAvatars().size()-1;
                System.out.println("Action finished. Press enter to proceed.");
                try { System.in.read(); } catch(Exception e) {}
            }
            if (userAnswer == 2) {
                System.out.println("Choose an avatar to download:");
                for (int i=0; i<currentUser.getAvatars().size(); i++)
                {
                    System.out.println("("+i+") " + currentUser.getAvatars().get(i));
                }
                System.out.println("");
                int download = Integer.parseInt(myScan.nextLine());
                if (download > -1 && download < currentUser.getAvatars().size())
                {
                    ((AvatarBuilder)avatarBuilder).capture();
                    System.out.println("Action finished. Press enter to proceed.");
                }
                else System.out.println("Invalid index.");
                currentIndex = currentUser.getAvatars().size()-1;
                try { System.in.read(); } catch(Exception e) {}
            }
            if (userAnswer == 3) {
                System.out.println("Choose an avatar to change: ");
                for (int i=0; i<currentUser.getAvatars().size(); i++)
                {
                    System.out.println("("+i+") " + currentUser.getAvatars().get(i));
                }
                System.out.println("");
                int temp = currentIndex;
                currentIndex = Integer.parseInt(myScan.nextLine());
                if (currentIndex > -1 && currentIndex < currentUser.getAvatars().size())
                {
                    isEditing = true;
                    avatarBuilder.setVisible(true);
                    while (isEditing)
                    {
                        System.out.print("");
                    }
                    currentIndex = temp;
                    System.out.println("Action finished. You replaced " + ((AvatarBuilder)avatarBuilder).getOldName() + " with " + ((AvatarBuilder)avatarBuilder).getNamee() + ". Press enter to proceed.");
                }
                else System.out.println("Invalid index.");
                currentIndex = currentUser.getAvatars().size()-1;
            }
            if (userAnswer == 4)
            {
                System.out.println("Choose an avatar to remove");
                for (int i=0; i<currentUser.getAvatars().size(); i++)
                {
                    System.out.println("("+i+") " + currentUser.getAvatars().get(i));
                }
                System.out.println("");
                int remove = Integer.parseInt(myScan.nextLine());
                if (currentIndex > -1 && currentIndex < currentUser.getAvatars().size())
                {
                    System.out.println("Action finished. You removed " + currentUser.getAvatars().remove(remove) + ". Press enter to proceed.");
                }
                else System.out.println("Invalid index.");
                currentIndex = currentUser.getAvatars().size()-1;
            }
            if (userAnswer == 5)
            {
                System.out.println("Please confirm your password.");
                String pass = myScan.nextLine();
                if (pass.equals(currentUser.getPassword()))
                {
                    System.out.println("You have " + currentUser.getAvatars().size() + " avatars:\n");
                    for (int i=0; i<currentUser.getAvatars().size(); i++)
                    {
                        System.out.println("("+i+") " + currentUser.getAvatars().get(i));
                    }
                    System.out.println();

                }
                else System.out.println("Please try selecting this option again.");
            }
            if (userAnswer == 6)
            {
                home.setIsLoggedIn(false);
                home.setVisible(true);
                while (!Home.getIsLoggedIn())
                {
                    System.out.print("");
                }
                start();
            }
            if (userAnswer == 7)
            {
                currentUser.sort();
                for (int i=0; i<currentUser.getAvatars().size(); i++)
                {
                    System.out.println("("+i+") " + currentUser.getAvatars().get(i));
                }
                System.out.println();
                System.out.println("Action finished. Press enter to proceed.\n");
                try { System.in.read(); } catch(Exception e) {}
            }
            if (userAnswer != 1 && userAnswer != 2 && userAnswer != 3 && userAnswer != 4 && userAnswer != 5 && userAnswer != 6 && userAnswer != 7) {
                System.out.println(ConsoleColors.RED_BOLD + "\nYou inputted an incorrect option. Please try again." + ConsoleColors.RESET);
            }
            System.out.println("Here are your options: " + ConsoleColors.BLUE_BOLD + "\n(1) " + ConsoleColors.BLUE_BOLD + "Add avatar" + ConsoleColors.BLUE_BOLD + "\n(2) " + ConsoleColors.BLUE_BOLD + "Download avatar" + ConsoleColors.BLUE_BOLD + "\n(3) " + ConsoleColors.BLUE_BOLD + "Swap avatar" + ConsoleColors.BLUE_BOLD + "\n(4) " + ConsoleColors.BLUE_BOLD + "Remove avatar" + ConsoleColors.BLUE_BOLD + "\n(5) " + ConsoleColors.BLUE_BOLD + "Status report" + ConsoleColors.BLUE_BOLD + "\n(6) " + ConsoleColors.BLUE_BOLD + "Log out" + "\n(7) " + ConsoleColors.BLUE_BOLD + "Sort" +ConsoleColors.RESET + "\n\nEnter the corresponding number: ");
            userAnswer = Integer.parseInt(myScan.nextLine());
        }
    }

    public static ArrayList<User> getUserArr() {return userArr;}
    public static User getCurrentUser() {return currentUser;}
    public static int getCurrentIndex() {return currentIndex;}
    public static Home getHome() {return home;}
    public static AvatarBuilder getAvatarBuilder() {return ((AvatarBuilder)avatarBuilder);}
    public static boolean getIsEditing() {return isEditing;}
    public static void setIsEditing(boolean b) {isEditing = b;}
    public static void setIsAdding(boolean b) {isAdding = b;}

    public static void setCurrentUser(User x) {currentUser = x;}
    public static void showAvatarBuilder() {avatarBuilder.setVisible(true);}

    public String toString() {return "the main class";}
    public boolean equals(Main m) {return (m.getUserArr().equals(userArr));}
}
