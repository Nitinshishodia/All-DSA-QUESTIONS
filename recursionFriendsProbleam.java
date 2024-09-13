import java.util.Scanner;
public class recursionFriendsProbleam {
    public static int friendsProbleam(int n){
        if( n == 1 || n == 2){
            return n;
        }

        // choices 
        return friendsProbleam(n-1) + (n-1) * friendsProbleam(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsProbleam(4));
        
    }
}
