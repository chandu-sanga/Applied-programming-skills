class Solution {
        public int findCircleNum(int[][] isConnected) {
                int n = isConnected.length;
                        boolean[] v = new boolean[n];
                                int count = 0;

                                        for (int i = 0; i < n; i++) {
                                                    if (!v[i]) {
                                                                    dfs(isConnected, v, i);
                                                                                    count++;
                                                                                                }
                                                                                                        }

                                                                                                                return count;
                                                                                                                    }

                                                                                                                        void dfs(int[][] g, boolean[] v, int i) {
                                                                                                                                v[i] = true;

                                                                                                                                        for (int j = 0; j < g.length; j++) {
                                                                                                                                                    if (g[i][j] == 1 && !v[j]) {
                                                                                                                                                                    dfs(g, v, j);
                                                                                                                                                                                }
                                                                                                                                                                                        }
                                                                                                                                                                                            }
                                                                                                                                                                                            }
