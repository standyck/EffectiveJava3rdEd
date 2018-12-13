class Rng {

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if(Math.random(n) < n/2) {
                low++;
            }
        }
        System.out.println("low: " + low);
    }
}