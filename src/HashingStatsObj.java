import java.util.ArrayList;

public class HashingStatsObj {

    private int[] data;
    private int N;

    public HashingStatsObj(int N) {
        data = new int[127];
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }
        this.N = N;
    }

    public void add(char letterToAdd) {
        int index = (int) (letterToAdd);
        data[index]++;
    }

    public void addAllLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            this.add(c);
        }
    }

    public int getCountOf(String testLetter) {
        int index = (int) (testLetter.charAt(0));
        return data[index];
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            count += data[i];
        }
        return count;
    }

    public int getNumUnique() {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public String getMostFreq(int[] input) {
        int indexOfMostFreq = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > input[indexOfMostFreq]) {
                indexOfMostFreq = i;
            }
        }
        return String.valueOf((char) indexOfMostFreq);
    }

    public String getMostFreq() {
        return getMostFreq(data);
    }

    public ArrayList<String> getTopMostFreq() {
        ArrayList<String> topN = new ArrayList<>();
        int[] copy = copyArray();
        int num = N;

        while (num > 0) {
            String data = getMostFreq(copy);
            topN.add(data);
            int index = (int) data.charAt(0);
            copy[index] = 0;
            num--;
        }
        return topN;
    }

    public int[] copyArray() {
        int[] copy = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
        return copy;
    }
}
