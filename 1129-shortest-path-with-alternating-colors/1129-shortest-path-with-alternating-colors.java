import java.util.*;

class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {

            List<int[]>[] g = new ArrayList[n];

                    for (int i = 0; i < n; i++)
                                g[i] = new ArrayList<>();

                                        for (int[] e : redEdges)
                                                    g[e[0]].add(new int[]{e[1], 0});

                                                            for (int[] e : blueEdges)
                                                                        g[e[0]].add(new int[]{e[1], 1});

                                                                                int[] ans = new int[n];
                                                                                        Arrays.fill(ans, -1);

                                                                                                boolean[][] v = new boolean[n][2];
                                                                                                        Queue<int[]> q = new LinkedList<>();

                                                                                                                q.offer(new int[]{0, -1});
                                                                                                                        int dist = 0;

                                                                                                                                while (!q.isEmpty()) {
                                                                                                                                            int size = q.size();

                                                                                                                                                        while (size-- > 0) {
                                                                                                                                                                        int[] cur = q.poll();
                                                                                                                                                                                        int node = cur[0], color = cur[1];

                                                                                                                                                                                                        if (ans[node] == -1)
                                                                                                                                                                                                                            ans[node] = dist;

                                                                                                                                                                                                                                            for (int[] nei : g[node]) {
                                                                                                                                                                                                                                                                int next = nei[0], c = nei[1];

                                                                                                                                                                                                                                                                                    if (c != color && !v[next][c]) {
                                                                                                                                                                                                                                                                                                            v[next][c] = true;
                                                                                                                                                                                                                                                                                                                                    q.offer(new int[]{next, c});
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                dist++;
                                                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                                                                return ans;
                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                    }