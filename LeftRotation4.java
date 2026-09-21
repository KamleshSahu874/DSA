import java.util.*;

public class LeftRotation4 {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        int n = arr.size();

        d = d % n;

        List<Integer> result = new ArrayList<>();

        for (int i = d; i < n; i++) {
            result.add(arr.get(i));
        }

        // Add elements from beginning to d-1
        for (int i = 0; i < d; i++) {
            result.add(arr.get(i));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> result = rotateLeft(d, arr);

        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
