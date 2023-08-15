import java.util.ArrayList;

/**
 * learnArray
 */
public class learnArray {

    public static void main(String[] args) {
        
        int[] myArray = new int[5];
        String[] myStringArray = new String[2];

        myArray[0] = 8;
        myArray[4] = 88;

        for (int i = 0; i < 5; i++) {
            System.out.println(myArray[i]);
        }

        //System.out.println(myArray[0]);
     
        ArrayList<Integer> myList = new ArrayList<Integer>();

        myList.add(20);
        myList.add(330);
        myList.add(13);

        System.out.println(myList);

        if (myArray[4]<=10) {
            System.out.println("YUP");
        } else {
            System.out.println("NOPE");
        }
    }
}