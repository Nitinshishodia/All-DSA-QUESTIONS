import java.util.Scanner;
import java.io.*;
public class stringShortPath {
    public static float getShortestPath(String path){
    int X = 0;
    int Y = 0;
    for(int i = 0; i<path.length(); i++){
      char dir = path.charAt(i);
        // south 
        if(dir == 'S'){
            Y--;
        }

        // North 
        else if(dir == 'N'){
            Y++;
        }
        // WEST
         else if(dir == 'W'){
            X--;
         }
         // EAST
         else{
            X++;
         }
    }
    int X2 = X*X;
    int Y2 = Y*Y;
    return(float)Math.sqrt(X2+Y2);
    }
        
    
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}


