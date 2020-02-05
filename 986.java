// 986
// 1. My own version
class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for (int i = 0; i < A.length; i++) {
            pq.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            pq.add(B[i]);
        }
        List<int[]> res = new ArrayList<>();
        if (pq.isEmpty()) return new int[][]{};
        int[] prev = pq.poll();
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            // System.out.println("prev: " + prev[0] + "," + prev[1] + " curr: " + curr[0] + ","+curr[1]);
            int end = Math.min(curr[1],prev[1]);
            // System.out.println("end =  " + end);
            if (curr[0] <= prev[1]) {
                res.add(new int[]{curr[0], end});
            }
            prev = new int[]{curr[0], Math.max(curr[1],prev[1])};
        }
        int n = res.size();
        int i = 0;
        int[][] ans = new int[n][n];
        for (int[] arr : res) {
            ans[i++] = arr;
        }
        return ans;
    }
}