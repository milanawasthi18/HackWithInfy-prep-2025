public class PracticeQues2 {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            int max = 0;
            Arrays.sort(boxTypes, (a, b) -> {
                return b[1] - a[1];
            });


            for(int i[] : boxTypes){
                if(truckSize == 0) break;
                if(i[0]>truckSize){
                    max += truckSize * i[1];
                    truckSize = 0;
                }
                else{
                    max += i[0]*i[1];
                    truckSize -= i[0];

                }
            }

            return max;
        }
    }
