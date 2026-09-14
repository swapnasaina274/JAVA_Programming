public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30, 35};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}