import java.util.*;

public class LargestSumCycle {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int t=scanner.nextInt();
int N = scanner.nextInt();
int[] edges = new int[N];

    for (int i = 0; i < N; i++) {
        edges[i] = scanner.nextInt();
    }
    
    int maxCycleLength = findLargestCycleLength(edges);
    System.out.println(maxCycleLength);
}

public static int findLargestCycleLength(int[] edges) {
    int maxCycleLength = -1;
    boolean[] visited = new boolean[edges.length];
    boolean[] inCurrentPath = new boolean[edges.length];
    
    for (int i = 0; i < edges.length; i++) {
        if (!visited[i]) {
            int current = i;
            int cycleLength = 0;
            
            while (current != -1 && !visited[current]) {
                visited[current] = true;
                inCurrentPath[current] = true;
                current = edges[current];
                cycleLength++;
            }
            
            if (current != -1 && inCurrentPath[current]) {
                maxCycleLength = Math.max(maxCycleLength, cycleLength);
            }
            
            while (current != -1 && inCurrentPath[current]) {
                inCurrentPath[current] = false;
                current = edges[current];
            }
        }
    }
    
    return maxCycleLength;
}
}