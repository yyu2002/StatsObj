import java.lang.reflect.Array;
import java.util.ArrayList;

public class PriorityQueueStatsObj {
    private ArrayList<Entry> data;
    private int N;
    private int numOfData;

    public PriorityQueueStatsObj(int N) {
        data = new ArrayList<>();
        this.N = N;
        numOfData = 0;
    }

    public void add(String item) {
        int entryIndex = findIndexFor(item);
        Entry e;
        if (entryIndex == -1) {
            e = new Entry(item);
            data.add(e);
        } else {
            e = data.get(entryIndex);
            e.incrementCount();
        }
        numOfData++;
    }

    private int findIndexFor(String item) {
        for (int i = 0; i < data.size(); i++) {
            Entry e = data.get(i);
            if (e.getLetter().equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public void sort(Entry entry) {
        for (int i = data.indexOf(entry); i > 0; i--) {
            if (data.get(i).getCount() > data.get(i - 1).getCount()) {
                Entry temp = data.get(i);
                data.set(i, data.get(i - 1));
                data.set(i - 1, temp);
            }
        }
    }

    public void addAllLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.add(str.substring(i, i + 1));
        }
    }

    public int getCountOf(String testLetter) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getLetter().equals(testLetter)) {
                return data.get(i).getCount();
            }
        }
        return 0;
    }

    public int size() {
        return numOfData;
    }

    public int getNumUnique() {
        return data.size();
    }

    public String getMostFreq() {
        if (data.size() > 0)
            return data.get(0).getLetter();
        return "Obj is Empty";
    }

    public ArrayList<String> getTopMostFreq() {
        ArrayList<String> topN = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (data.size() > i)
                topN.add(data.get(i).getLetter());
        }
        return topN;
    }

}
