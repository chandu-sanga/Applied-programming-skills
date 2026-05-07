import java.util.*;

class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

            Map<String, Set<String>> g = new HashMap<>();
                    Map<String, String> name = new HashMap<>();

                            for (List<String> acc : accounts) {
                                        String user = acc.get(0);

                                                    for (int i = 1; i < acc.size(); i++) {
                                                                    g.putIfAbsent(acc.get(i), new HashSet<>());
                                                                                    name.put(acc.get(i), user);

                                                                                                    if (i == 1) continue;

                                                                                                                    g.get(acc.get(i)).add(acc.get(i - 1));
                                                                                                                                    g.get(acc.get(i - 1)).add(acc.get(i));
                                                                                                                                                }
                                                                                                                                                        }

                                                                                                                                                                Set<String> v = new HashSet<>();
                                                                                                                                                                        List<List<String>> ans = new ArrayList<>();

                                                                                                                                                                                for (String email : g.keySet()) {

                                                                                                                                                                                            if (!v.contains(email)) {

                                                                                                                                                                                                            List<String> list = new ArrayList<>();
                                                                                                                                                                                                                            dfs(email, g, v, list);

                                                                                                                                                                                                                                            Collections.sort(list);
                                                                                                                                                                                                                                                            list.add(0, name.get(email));

                                                                                                                                                                                                                                                                            ans.add(list);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                        return ans;
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                void dfs(String s, Map<String, Set<String>> g,
                                                                                                                                                                                                                                                                                                                             Set<String> v, List<String> list) {

                                                                                                                                                                                                                                                                                                                                     v.add(s);
                                                                                                                                                                                                                                                                                                                                             list.add(s);

                                                                                                                                                                                                                                                                                                                                                     for (String nei : g.get(s)) {
                                                                                                                                                                                                                                                                                                                                                                 if (!v.contains(nei)) {
                                                                                                                                                                                                                                                                                                                                                                                 dfs(nei, g, v, list);
                                                                                                                                                                                                                                                                                                                                                                                             }
                                                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                                                         }
                                                                                                                                                                                                                                                                                                                                                                                                         }