package org.example;

import java.util.*;

/**
 * Helped by AI
 */
public class Graph {
    private Map<Integer, Map<Integer, Integer>> adjacents = new HashMap<>();

    public void addCenter(int center) {
        adjacents.putIfAbsent(center, new HashMap<>());
    }

    public void addRoute(int center1, int center2, int distance) {
        addCenter(center1);
        addCenter(center2);
        adjacents.get(center1).put(center2, distance);
        adjacents.get(center2).put(center1, distance);
    }

    public List<Integer> getAdjacents(int center) {
        return new ArrayList<>(adjacents.getOrDefault(center, new HashMap<>()).keySet());
    }

    public int getDistance(int center1, int center2) {
        return adjacents.getOrDefault(center1, new HashMap<>()).getOrDefault(center2, Integer.MAX_VALUE);
    }

    public ArrayList<Integer> listCenters() {
        return new ArrayList<>(adjacents.keySet());
    }
}

class PokemonMap {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addCenter(0);
        graph.addCenter(1);
        graph.addCenter(2);
        graph.addRoute(0, 1, 10);
        graph.addRoute(1, 2, 5);
        graph.addRoute(0, 2, 15);

        PokemonMap map = new PokemonMap();
        map.calculateAndShowFarthestCenters(graph);
    }

    public void calculateAndShowFarthestCenters(Graph graph) {
        var centers = graph.listCenters();
        int maxDistance = -1;
        int center1 = -1;
        int center2 = -1;

        for (int i = 0; i < centers.size(); i++) {
            for (int j = i + 1; j < centers.size(); j++) {
                int currentDistance = graph.getDistance(centers.get(i), centers.get(j));
                if (currentDistance != Integer.MAX_VALUE && currentDistance > maxDistance) {
                    maxDistance = currentDistance;
                    center1 = centers.get(i);
                    center2 = centers.get(j);
                }
            }
        }

        if (maxDistance != -1) {
            System.out.println("The farthest are " + center1 + " and " + center2 +
                    " and distance between them is: " + maxDistance);
        } else {
            System.out.println("Error");
        }
    }
}
