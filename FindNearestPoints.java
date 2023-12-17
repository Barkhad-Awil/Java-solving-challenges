
public class FindNearestPoints {
    public static double distance(double x1, double y1, double x2, double y2){
            return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
    }

    public static void calcNearestPoint(double[][] points){
        // p1 and p2 are the indices in the points' array
        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);
   
        // Compute distance for every two points
        for(int i = 0; i < points.length; i++){
            for(int j = i + 1; j < points.length; j++){
               double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
               if(shortestDistance > distance){
                p1 = i;
                p2 = j;

                //Update distance
                shortestDistance = distance;
               }
            }
        }
        System.out.println("The closest two points are " + "(" + points[p1][0]+", " + points[p1][1] + ") and (" + points[p2][0] + ", "+ points[p2][1] + ")");
    }
    public static void main(String[] args){
        double[][] points = {
         {-1 ,3}, {-1 ,-1}, {1, 1}, {2, 0.5}, 
         {2, -1}, {3, 3}, {4, 2}, {4, -0.5}
        };

        calcNearestPoint(points);       
    }  
}
