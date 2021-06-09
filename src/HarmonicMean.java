public class HarmonicMean {
    public static void main(String[] args) {
        int[] list={6,7,8,9,10,11,12,13,14,10};

        double t=harmonicMean(list);
        System.out.println(t);
    }

    static double harmonicMean(int[] c){
        double t=0;

        for (double j : c) {
            t +=(1/j);
        }
        t = c.length / t;

        return t;
    }
}
