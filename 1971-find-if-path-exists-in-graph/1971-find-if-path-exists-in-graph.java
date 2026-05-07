class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
                List<Integer>[] g = new ArrayList[n];
                        
                                for (int i = 0; i < n; i++)
                                            g[i] = new ArrayList<>();
                                                    
                                                            for (int[] e : edges) {
                                                                        g[e[0]].add(e[1]);
                                                                                    g[e[1]].add(e[0]);
                                                                                            }

                                                                                                    boolean[] v = new boolean[n];
                                                                                                            Queue<Integer> q = new LinkedList<>();
                                                                                                                    
                                                                                                                            q.offer(source);
                                                                                                                                    v[source] = true;

                                                                                                                                            while (!q.isEmpty()) {
                                                                                                                                                        int x = q.poll();

                                                                                                                                                                    if (x == destination)
                                                                                                                                                                                    return true;

                                                                                                                                                                                                for (int y : g[x]) {
                                                                                                                                                                                                                if (!v[y]) {
                                                                                                                                                                                                                                    v[y] = true;
                                                                                                                                                                                                                                                        q.offer(y);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        }
