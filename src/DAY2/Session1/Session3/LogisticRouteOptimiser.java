package DAY2.Session1.Session3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Route{
    int source;
    int destination;
    int distance;
    Route(int source,int destination,int distance){
        this.source=source;
        this.destination=destination;
        this.distance=distance;
    }
}
public class LogisticRouteOptimiser {
    public static void analyzeRoutes(List<Route> routes){
        // Analyze the routes to find the optimal path for logistics
        // This is a placeholder for the actual optimization logic
        // You can implement algorithms like Dijkstra's or A* for pathfinding
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int total=0;
        for(Route route:routes){
            min=Math.min(min,route.distance);
            max=Math.max(max,route.distance);
        }
        Map<Integer,Integer> map=new HashMap<>();
        System.out.println(routes.get(1).source);
        for(Route r:routes){
            int d=r.distance;
            min=Math.min(min,d);
            max=Math.max(max,d);
            total+=d;
            //count connections
            map.put(r.source,map.getOrDefault(r.source,0)+1);
            map.put(r.destination,map.getOrDefault(r.destination,0)+1);
        }
        double average=(double)total/routes.size();   //java will truncte the decimal values if we do not cast it to double. so, we need to cast it to double to get the decimal values.
        for(Route r:routes){
            if(r.distance>average){
                System.out.println("Route from "+r.source+" to "+r.destination+" with distance "+r.distance+" is above average.");
            }
        }
        System.out.println("Shortest route: "+min);
        System.out.println("Longest route: "+max);
        System.out.println("Total distance: "+total);
        System.out.println("Average distance: "+average);
        System.out.println("City connections: ");
        for(int city:map.keySet()){
            System.out.println("City "+city+" -> "+map.get(city));
        }
    }
    public static void main(String[] args) {
        List<Route> routes=Arrays.asList(
            new Route(0,1,10),
            new Route(0,2,25),
            new Route(1,2,15),
            new Route(1,3,30),
            new Route(2,3,20)    //transient , 
        );
        analyzeRoutes(routes);
    }
}
