import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class ConflictCode {

    public static void backtrack(int currentExpertise, ArrayList<Integer> currentTeam,
                                 HashSet<Integer> visited, int maxExpertise,
                                 ArrayList<ArrayList<Integer>> graph, ArrayList<Integer> expertise) {
        boolean conflictFree = true;
        for (int i = 0; i < currentTeam.size() - 1; ++i) {
            for (int j = i + 1; j < currentTeam.size(); ++j) {
                if (graph.get(currentTeam.get(i)).contains(currentTeam.get(j))) {
                    conflictFree = false;
                    break;
                }
            }
        }

        if (conflictFree) {
            maxExpertise = Math.max(maxExpertise, currentExpertise);

            for (int i = 1; i < graph.size(); ++i) {
                if (!visited.contains(i) && !currentTeam.contains(i)) {
                    currentTeam.add(i);
                    visited.add(i);
                    backtrack(currentExpertise + expertise.get(i - 1), currentTeam, visited, maxExpertise, graph, expertise);
                    currentTeam.remove(currentTeam.size() - 1);
                    visited.remove(i);
                }
            }
        }
    }

    public static int solve(int n, int c, ArrayList<ArrayList<Integer>> conflicts,
                             ArrayList<Integer> expertise) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; ++i) {
            graph.add(new ArrayList<>());
        }

        for (ArrayList<Integer> conflict : conflicts) {
            int u = conflict.get(0), v = conflict.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int maxExpertise = 0;
        ArrayList<Integer> currentTeam = new ArrayList<>();

        HashSet<Integer> visited = new HashSet<>();
        backtrack(0, currentTeam, visited, maxExpertise, graph, expertise);

        return maxExpertise;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<ArrayList<Integer>> conflicts = new ArrayList<>();
        for (int i = 0; i < c; ++i) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            conflicts.add(new ArrayList<Integer>() {{
                add(u);
                add(v);
            }});
        }

        ArrayList<Integer> expertise = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            expertise.add(scanner.nextInt());
        }

        int result = solve(n, c, conflicts, expertise);
        System.out.println(result);
    }
}

