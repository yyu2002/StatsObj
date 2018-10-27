public class Tester {
    public static void main(String[] args) {
        PriorityQueueStatsObj obj = new PriorityQueueStatsObj(5);

        // Alphabet 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 1000; i++) {
            int rand = (int) (Math.random() * 26);
            obj.add(alphabet.substring(rand, rand + 1));
        }


        System.out.println(obj.getCountOf("e"));
        // System.out.println(obj.getUniqueVals());
        System.out.println(obj.getMostFreq());
        // System.out.println(obj.top3());
        // System.out.println(obj.topN(1000));
        System.out.println(obj.getTopMostFreq());
        System.out.println(obj.size());


        /*
        for (int i = 0; i < 10000; i++) {
            StatsObj obj = new StatsObj();

            for (int j = 0; j < i; j++) {
                int rand = (int) (Math.random() * 26);
                obj.add(alphabet.substring(rand, rand + 1));
            }

            long start = System.currentTimeMillis();
            obj.topN(i);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println(i + "\t" + time);
        }
*/

    }
}
