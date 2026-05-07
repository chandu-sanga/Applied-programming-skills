class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
                boolean[] v = new boolean[rooms.size()];
                        dfs(rooms, v, 0);

                                for (boolean x : v) {
                                            if (!x) return false;
                                                    }

                                                            return true;
                                                                }

                                                                    void dfs(List<List<Integer>> rooms, boolean[] v, int i) {
                                                                            v[i] = true;

                                                                                    for (int key : rooms.get(i)) {
                                                                                                if (!v[key]) {
                                                                                                                dfs(rooms, v, key);
                                                                                                                            }
                                                                                                                                    }
                                                                                                                                        }
                                                                                                                                        }
