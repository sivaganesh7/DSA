public class stirng_freq{
    public void count_frq(String s){
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
    public static void main(String[] args) {
        String s="sivaganesh";
        stirng_freq obj = new stirng_freq();
        obj.count_frq(s);
    }
}