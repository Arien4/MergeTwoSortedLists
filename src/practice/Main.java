package practice;

public class Main {

    public static void main(String[] args) {
        /*int [] nums = {1, 2, 3, 4};
        printListNode(arrayToList(nums));*/
        Solution s = new Solution();
        int [] a1 = {1, 2, 3};
        int [] a2 = {1, 2, 4};
        printListNode(arrayToList(a1));
        System.out.println();
        printListNode(arrayToList(a2));
        System.out.println();
        ListNode result = s.mergeTwoLists(arrayToList(a1), arrayToList(a2));
        printListNode(result);

    }

    public static ListNode arrayToList(int [] nums) {
        ListNode root = new ListNode(nums[0]);
        ListNode item = root;

        for (int i = 1; i < nums.length; i++) {
            ListNode tmp = new ListNode(nums[i]);
            item.next = tmp;
            item = tmp;
        }
        return root;
    }

    public static void printListNode(ListNode l) {
        do {
            if (l == null) break;
            System.out.print(l.val + " ");
            l = l.next;
        } while (true);
    }
}
