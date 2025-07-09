//Max number of events that can be attended

public class PracticeQues3 {

        public int maxEvents(int[][] events) {
            Arrays.sort(events, (a,b)-> {
                return a[0]- b[0];
            });


            int c =0;
            int index = 0;
            PriorityQueue<Integer> pq =new PriorityQueue<>();
            for(int day = 1;day<=100000;day++){
                while(!pq.isEmpty() && pq.peek()<day){
                    pq.poll();
                }

                while(index < events.length && events[index][0] == day){
                    pq.add(events[index++][1]);
                }


                if(!pq.isEmpty()){
                    pq.poll();
                    c++;
                }
            }
            return c;}
    }

