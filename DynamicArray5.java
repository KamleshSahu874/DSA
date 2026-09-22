import java.util.*;

public class DynamicArray5 {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        List<List<Integer>> arr = new ArrayList<>();

        // Create n empty arrays
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        // Process each query
        for (List<Integer> query : queries) {

            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int index = (x ^ lastAnswer) % n;

            if (type == 1) {
                // Append y to arr[index]
                arr.get(index).add(y);

            } else if (type == 2) {
                // Find value using y % size
                int size = arr.get(index).size();
                lastAnswer = arr.get(index).get(y % size);

                // Store answer
                answers.add(lastAnswer);
            }
        }

        return answers;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {

            List<Integer> query = new ArrayList<>();

            query.add(sc.nextInt());
            query.add(sc.nextInt());
            query.add(sc.nextInt());

            queries.add(query);
        }

        List<Integer> result = dynamicArray(n, queries);

        for (int answer : result) {
            System.out.println(answer);
        }

        sc.close();
    }
}
