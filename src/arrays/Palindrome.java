package arrays;

public class Palindrome {

    //1234321, 6776, 1235321, 22, 676, 899, 1289821
    public static void main(String[] args) {
        boolean isPalindromeArray = isPalindrome();
        System.out.println(isPalindromeArray);
    }

    public static boolean isPalindrome() {
        int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < arr.length / 2; i++) {//i=0,1,2
            if (arr[i] != arr[arr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
