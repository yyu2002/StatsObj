public class Tester {
    public static void main(String[] args) {

        StatsObjFinalVer statsObj = new StatsObjFinalVer(5);
        statsObj.addAllLetters("a");
        statsObj.addAllLetters("bb");
        statsObj.addAllLetters("ccc");
        statsObj.addAllLetters("dddd");
        statsObj.addAllLetters("eeeee");
        statsObj.addAllLetters("mmmmmmmmmm");

        System.out.println(statsObj.getCountOf("m"));
        System.out.println(statsObj.getMostFreq());
        System.out.println(statsObj.getNumUnique());
        System.out.println(statsObj.size());
        System.out.println(statsObj.getTopMostFreq());

        int count = 0;
        for (int i = 0; i < 1000; i++) {
            String j = statsObj.getRandom();
            if (j.equals("m"))
                count++;
        }
        System.out.println((double) (count) / 1000);
    }
}
