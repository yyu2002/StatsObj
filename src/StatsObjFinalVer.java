import java.util.*;

public class StatsObjFinalVer {

    private HashMap<String, Integer> data;
    private int N;
    private int size;
    private ArrayList<String> mostFreq;

    public StatsObjFinalVer(int N) {
        this.N = N;
        data = new HashMap<String, Integer>();
        size = 0;
        mostFreq = new ArrayList<>();
    }

    public void add(String item) {
        if (item.length() != 1)
            return;
        if (data.get(item) == null) {
            data.put(item, 1);
            mostFreq.add(item);
        } else {
            data.put(item, data.get(item) + 1);
            sort(item);
        }
        size++;
    }

    public void sort(String item) {
        if (mostFreq.size() > 0) {
            for (int i = mostFreq.indexOf(item); i > 0; i--) {
                if (data.get(mostFreq.get(i)) > data.get(mostFreq.get(i - 1)))
                    Collections.swap(mostFreq, i, i - 1);
            }
        }
    }

    public void addAllLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.add(str.substring(i, i + 1));
        }
    }

    public int getCountOf(String testLetter) {
        if (data.containsKey(testLetter))
            return data.get(testLetter);
        return 0;
    }

    public int size() {
        return size;
    }

    public int getNumUnique() {
        return data.size();
    }

    public String getMostFreq() {
        if (mostFreq.size() < 1)
            return "Obj is empty";
        return mostFreq.get(0);
    }

    public ArrayList<String> getTopMostFreq() {
        ArrayList<String> topMostFreq = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (mostFreq.size() > i)
                topMostFreq.add(mostFreq.get(i));
        }
        return topMostFreq;
    }

    public String getRandom() {
        int p = (int) (Math.random() * size);
        int numSoFar = 0;
        for (String letter : mostFreq) {
            numSoFar += data.get(letter);
            if (p < numSoFar)
                return letter;
        }
        return mostFreq.get(mostFreq.size() - 1);
    }


}
