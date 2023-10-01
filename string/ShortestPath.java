package string;
// CALCULATING A SHORTEST PATH
// ITS LIKE DISPLACEMENT OF PHYSICS
public class ShortestPath {
    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //SOUTH
            if (dir == 'S') {
                y--;
            }
            //South
            else if(dir=='N'){
                y++;
            }
            //East
            else if (dir == 'E') {
                x++;
            }
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
      String path="NSWEENS";
        System.out.println(getShortestPath(path));

    }
}
