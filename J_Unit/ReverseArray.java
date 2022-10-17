package Day6Logical.J_Unit;

public class ReverseArray {
    public static void reverseArray(){
        System.out.println("Array to be Converted=");
        int[] array ={0,1,1,0,0,1,0,0};
        int index = 4;
        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+"");
        }
        for (int i =0;i<index;i++){
            int elementsOfArray;
            elementsOfArray = array[0];
            int j;
            for (j=0;j< array.length-1;j++){
                array[j]=array[j+1];
            }
            array[j] = elementsOfArray;
        }
      System.out.println();
        System.out.println("After Conversion= ");
        for (int i =0;i< array.length;i++){
            System.out.print(array[i]+"");
        }
    }

    public static void main(String[] args) {
        reverseArray();

    }
}
