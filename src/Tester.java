public class Tester {
    public static void main(String[] args) {

        PriorityQueueStatsObj obj = new PriorityQueueStatsObj(26);

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
        System.out.println(obj.getNumUnique());


        StatsObjFinalVer statsObj = new StatsObjFinalVer(5);
        statsObj.add("a");
        statsObj.add("b");
        statsObj.add("b");
        statsObj.add("b");
        statsObj.add("c");
        statsObj.add("c");
        statsObj.add("c");
        statsObj.add("c");
        statsObj.add("m");
        statsObj.add("m");
        statsObj.add("m");
        statsObj.add("m");
        statsObj.add("m");


        System.out.println(statsObj.getCountOf("d"));
        System.out.println(statsObj.getOrderOfFrequency());
        System.out.println(statsObj.getNumUnique());
        System.out.println(statsObj.size());
        System.out.println(statsObj.getTopMostFreq());

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            String j = statsObj.getRandom();
            if (j.equals("m"))
                count++;
        }
        System.out.println((double)(count) / 1000);


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
