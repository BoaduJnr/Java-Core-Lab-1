package AdvancedDataStructures.Graph.DepthFirstSearch;

import AdvancedDataStructures.Graph.Edge;
import AdvancedDataStructures.Graph.Vertex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph <T>{

     ArrayList<Vertex> vertices ;
     ArrayList<Edge> edges ;

     public Graph(ArrayList<Vertex> vertices, ArrayList<Edge> edges) {
         this.vertices = vertices;
         this.edges = edges;
     }


     private boolean areAdjacent(Vertex v1, Vertex v2){
         for(Edge e : this.edges){
             if((e.getEndpointOne()  == v1 && e.getEndpointTwo() == v2)
                     ||(e.getEndpointOne() == v2 && e.getEndpointTwo() == v1)){
                 return true;
             }
         }
         return  false;
     }

    public Map<T, List<T>> getAdjList() {
        Map<T, List<T>> adjList = new HashMap<>();
        for (Edge e : edges) {
            adjList.computeIfAbsent((T) e.getEndpointOne().getData(), k -> new ArrayList<>()).add((T) e.getEndpointTwo().getData());
            adjList.computeIfAbsent((T) e.getEndpointTwo().getData(), k -> new ArrayList<>()).add((T) e.getEndpointOne().getData());  // For undirected graph
        }
        return adjList;
    }

    public static void main(String[] args) {
         Vertex X = new Vertex(34);
         Vertex Y = new Vertex(65);
         Vertex Z = new Vertex(7);
         Vertex W = new Vertex(90);

         ArrayList<Vertex> vertices = new ArrayList<>();
         vertices.add(X);
         vertices.add(Y);
         vertices.add(Z);
         vertices.add(W);


         Edge a = new Edge(4,W,Y);
         Edge b = new Edge(78,Z,Y);
         Edge c = new Edge(54,W,X);
         Edge d = new Edge(9,X,Y);
         Edge e = new Edge(39,X,Z);

         ArrayList<Edge> edges = new ArrayList<>();
         edges.add(a);
         edges.add(b);
         edges.add(c);
         edges.add(d);
         edges.add(e);

         Graph<Integer> graph = new Graph(vertices, edges);

        System.out.println(graph.getAdjList());

    }

}
