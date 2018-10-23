public class Entry {
    private String letter;
    private int count;

    public Entry(String letter) {
        this.letter = letter;
        count = 1;
    }

    public int getCount() {
        return count;
    }

    public String getLetter() {
        return letter;
    }

    public void incrementCount() {
        count++;
    }


}
