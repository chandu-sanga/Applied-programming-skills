import java.util.*;

class Solution {
    public boolean canFinish(int n, int[][] p) {
            List<List<Integer>> g = new ArrayList<>();
                    int[] in = new int[n];

                            for (int i = 0; i < n; i++)
                                        g.add(new ArrayList<>());

                                                for (int[] e : p) {
                                                            g.get(e[1]).add(e[0]);
                                                                        in[e[0]]++;
                                                                                }

                                                                                        Queue<Integer> q = new LinkedList<>();

                                                                                                for (int i = 0; i < n; i++) {
                                                                                                            if (in[i] == 0)
                                                                                                                            q.offer(i);
                                                                                                                                    }

                                                                                                                                            int count = 0;

                                                                                                                                                    while (!q.isEmpty()) {
                                                                                                                                                                int x = q.poll();
                                                                                                                                                                            count++;

                                                                                                                                                                                        for (int y : g.get(x)) {
                                                                                                                                                                                                        if (--in[y] == 0)
                                                                                                                                                                                                                            q.offer(y);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        return count == n;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            }