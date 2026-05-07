import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
            int m = mat.length, n = mat[0].length;

                    Queue<int[]> q = new LinkedList<>();
                            boolean[][] v = new boolean[m][n];

                                    for (int i = 0; i < m; i++) {
                                                for (int j = 0; j < n; j++) {
                                                                if (mat[i][j] == 0) {
                                                                                    q.offer(new int[]{i, j});
                                                                                                        v[i][j] = true;
                                                                                                                        }
                                                                                                                                    }
                                                                                                                                            }

                                                                                                                                                    int[][] d = {{1,0},{-1,0},{0,1},{0,-1}};

                                                                                                                                                            while (!q.isEmpty()) {
                                                                                                                                                                        int[] cur = q.poll();

                                                                                                                                                                                    for (int[] x : d) {
                                                                                                                                                                                                    int r = cur[0] + x[0];
                                                                                                                                                                                                                    int c = cur[1] + x[1];

                                                                                                                                                                                                                                    if (r >= 0 && c >= 0 && r < m && c < n && !v[r][c]) {
                                                                                                                                                                                                                                                        mat[r][c] = mat[cur[0]][cur[1]] + 1;
                                                                                                                                                                                                                                                                            v[r][c] = true;
                                                                                                                                                                                                                                                                                                q.offer(new int[]{r, c});
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                            return mat;
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                }