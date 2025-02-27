import java.util.*;
class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
        LinkedList<int[]> r = new LinkedList<>();
        for (int[] i : a) {
            if (r.isEmpty() || r.getLast()[1] < i[0]) r.add(i);
            else r.getLast()[1] = Math.max(r.getLast()[1], i[1]);
        }
        return r.toArray(new int[r.size()][]);
    }
}
