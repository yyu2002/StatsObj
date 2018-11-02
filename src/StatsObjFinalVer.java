import java.util.*;

public class StatsObjFinalVer {

    private HashMap<String, Integer> data;
    private int N;
    private int size;
    private ArrayList<String> topN;

    public StatsObjFinalVer(int N) {
        this.N = N;
        data = new HashMap<String, Integer>();
        size = 0;
        topN = new ArrayList<>();
    }

    public void add(String item) {
        if (item.length() != 1)
            return;
        if (data.get(item) == null) {
            data.put(item, 1);
            if (topN.size() < 5)
                topN.add(item);
        } else {
            data.put(item, data.get(item) + 1);
            if (topN.size() > 1)
                sort(item);
        }
        size++;
    }

    public void sort(String item) {
        for (int i = topN.size() - 1; i > 0; i--) {
            if (data.get(topN.get(i)) > data.get(topN.get(i - 1)))
                Collections.swap(topN, i, i - 1);
        }
        if (topN.size() > 5)
            topN.remove(topN.size() - 1);
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
        if (topN.size() < 1)
            return "Obj is empty";
        return topN.get(0);
    }

    public ArrayList<String> getTopMostFreq() {
        return topN;
    }

    public String getRandom() {
        int p = (int) (Math.random() * size);
        int numSoFar = 0;
        for (String letter : data.keySet()) {
            numSoFar += data.get(letter);
            if (p < numSoFar)
                return letter;
        }
        return topN.get(0);
    }
}
