import java.util.*;

public class User
{
    private String user;
    private String password;
    private ArrayList<String> avatars = new ArrayList<String>();

    public User(String user, String password, boolean isPrivate)
    {
        this.user = user;
        this.password = password;
    }

    public User(String user, String password)
    {
        this.user = user;
        this.password = password;
    }

    public boolean addAvatar(String name)
    {
        return avatars.add(name);
    }
    public void selectionSort()
    {
        for (int i = 0; i < avatars.size(); i++) {
            String smallest = avatars.get(i);
            int smallestIndex = i;
            for (int j = i; j < avatars.size(); j++) {
                String value = avatars.get(j);
                if (value.compareTo(smallest) < 0) {
                    smallest = value;
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                String head = avatars.get(i);
                avatars.set(i, smallest);
                avatars.set(smallestIndex, head);
            }
        }
    }
    public void sort()
    {
        if (countSelectionSort()<countInsertionSort()) {selectionSort();}
        else insertionSort();
    }
    public int countSelectionSort()
    {
        int count = 0;
        ArrayList<String> avatars2 = avatars;
        for (int i = 0; i < avatars2.size(); i++) {
            String smallest = avatars2.get(i);
            int smallestIndex = i;
            for (int j = i; j < avatars2.size(); j++) {
                String value = avatars2.get(j);
                if (value.compareTo(smallest) < 0) {
                    smallest = value;
                    smallestIndex = j;
                    count++;
                }
            }
            if (smallestIndex != i) {
                String head = avatars2.get(i);
                avatars2.set(i, smallest);
                avatars2.set(smallestIndex, head);
            }
        }
        return count;
    }
    public int countInsertionSort()
    {
        int count = 0;
        ArrayList<String> avatars2 = avatars;
        for(int i = 1; i < avatars2.size(); i++)
        {
            String key = avatars2.get(i);
            int j = i - 1;

            while (j >= 0 && key.compareTo(avatars2.get(j)) < 0) {
                avatars2.set(j + 1, avatars2.get(j));
                j--;
                count ++;
            }
            avatars2.set(j + 1, key);
        }
        return count;
    }
    public void insertionSort()
    {
        for(int i = 1; i < avatars.size(); i++)
        {
            String key = avatars.get(i);
            int j = i - 1;

            while (j >= 0 && key.compareTo(avatars.get(j)) < 0) {
                avatars.set(j + 1, avatars.get(j));
                j--;
            }
            avatars.set(j + 1, key);
        }
    }

    public String getUser() {return user;}
    public String getPassword() {return password;}
    public ArrayList<String> getAvatars() {return avatars;}

    public void printStatus()
    {
        System.out.println();
    }

    public String toString()
    {
        String str = "Your username: " + user + "\nYour password: " + password;
        return str;
    }
    public boolean equals(User u)
    {
        return (u.getUser().equals(this.user));
    }
}
