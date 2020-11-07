public class Conversion {
    public String solution(int n) {
        return getPlace(n, 1000, "M", "?", "?")
            + getPlace(n, 100, "C", "D", "M")
            + getPlace(n, 10, "X", "L", "C")
            + getPlace(n, 1, "I", "V", "X");
    }
    
    private String getPlace(int n, int place, String one, String five, String ten) {
        switch ((n / place) % 10) {
            case 9: return one + ten;
            case 8: return five + one + one + one;
            case 7: return five + one + one;
            case 6: return five + one;
            case 5: return five;
            case 4: return one + five;
            case 3: return one + one + one;
            case 2: return one + one;
            case 1: return one;
        }
        return "";
    }
}