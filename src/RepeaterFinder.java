import java.util.Arrays;

public class RepeaterFinder {

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int index = 0;
        int[] duplicate = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (isFound(duplicate, list[i])) {
                        duplicate[index] = list[i];
                        index++;

                    }

                }

            }
        }
        Arrays.sort(duplicate);
    for(int print:duplicate){
        if(print!=0){
            System.out.print(print+" ");
        }
    }


    }
static boolean isFound(int [] c,int a){
        for(int b:c){
            if (b==a){
                return false;
            }

        }
    return true;
    }


}
