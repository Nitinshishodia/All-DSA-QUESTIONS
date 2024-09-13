public class pathOneDimension {
    public static void printPath(int current, int destination, String path){
      if(current>destination){
        return;
      }
      if(current==destination){
        System.out.println(path);
        return;
      }
      printPath(current+1, destination, path+1);
      printPath(current+2, destination, path+2);
      printPath(current+3, destination, path+3);
      printPath(current+4, destination, path+4);
      printPath(current+5, destination, path+5);
      printPath(current+6, destination, path+6);
    }
    public static void main(String[] args) {
         printPath(0, 9, "");
    }
}
