public class Tester {
    public static void main(String[] args) {
        // StatsObj obj = new StatsObj();


        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        /*
        obj.add("suckdeep singh");
        obj.add("suckdeep singh");
        obj.add("suckdeep singh");
        obj.add("suckdeep singh");


        for (int i = 0; i < 1000; i++) {
            int rand = (int) (Math.random() * 26);
            obj.add(alphabet.substring(rand, rand + 1));
        }


        System.out.println(obj.getCountOf("a"));
        System.out.println(obj.getUniqueVals());
        System.out.println(obj.getMostFreq());
        System.out.println(obj.top3());
        System.out.println(obj.topN(1000));
        */

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


    }
}
