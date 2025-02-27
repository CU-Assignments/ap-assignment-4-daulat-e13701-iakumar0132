import java.util.*;
class Solution {
    public int[] topKFrequent(int[] a, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int n:a) m.put(n,m.getOrDefault(n,0)+1);
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.comparingInt(m::get));
        for(int n:m.keySet()) {
            q.add(n);
            if(q.size()>k) q.poll();
        }
        int[] r=new int[k];
        for(int i=0;i<k;i++) r[i]=q.poll();
        return r;
    }
}
