import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = input.nextLine();
        char[] arrChar = string.toCharArray();
        System.out.println(countChar(arrChar));
    }

    public static int countChar(char[] arr) {
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 'a' && arr[i + 1] == 'w')
                    || (arr[i] == 'o' && arr[i + 1] == 'w')
                    || (arr[i] == 'a' && arr[i + 1] == 'a')
                    || (arr[i] == 'd' && arr[i + 1] == 'd')
                    || (arr[i] == 'e' && arr[i + 1] == 'e')
                    || (arr[i] == 'o' && arr[i + 1] == 'o')) {
                ++count;
                ++i;
            } else if (arr[i] == 'w') {
                ++count;
                if (arr[i + 1] == 'w') {
                    ++i;
                }
                if (i + 1 == arr.length) {
                    flag = true;
                }
            }
        }
        if (arr[arr.length - 1] == 'w' && !flag) {
            return count + 1;
        }
        return count;
    }
}