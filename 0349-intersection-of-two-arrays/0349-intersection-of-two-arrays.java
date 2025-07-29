class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersectionArray = new int[intersectionSet.size()];
        int i = 0;
        for (int num : intersectionSet) {
            intersectionArray[i++] = num;
        }
        return intersectionArray;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String[] nums1Input = scanner.nextLine().split(" ");
        int[] nums1 = new int[nums1Input.length];
        for (int i = 0; i < nums1Input.length; i++) {
            nums1[i] = Integer.parseInt(nums1Input[i]);
        }
        String[] nums2Input = scanner.nextLine().split(" ");
        int[] nums2 = new int[nums2Input.length];
        for (int i = 0; i < nums2Input.length; i++) {
            nums2[i] = Integer.parseInt(nums2Input[i]);
        }
        int[] intersectionArray = solution.intersection(nums1, nums2);
        for (int num : intersectionArray) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
