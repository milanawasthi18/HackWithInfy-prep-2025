class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->{
            return a[1]-b[1];

        });
        int c=0;
        int s=0;
        int e = 0;
        // for(int i[] : pairs){
        // System.out.println(Arrays.toString(i));
        // }
        while(e<pairs.length){
            while(e<pairs.length && pairs[s][1] >= pairs[e][0]){
                e++;
            }
            if(e<pairs.length){
                c++;
            }
            s=e;
            e++;
        }

        return c+1; }
}