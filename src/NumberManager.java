public class NumberManager {
    public static int [] arrInt = new int[10];
    public static int size =0;

    //Them moi gia tri
    public static void addNumber (int number){
        if (size == arrInt.length){
            //
            int [] newArrInt = new int[size+10];
            for (int i = 0; i < arrInt.length; i++) {
                newArrInt[i] = arrInt[i];
            }
            arrInt = newArrInt;
        }
        arrInt[size++] = number;

    }
//    //xoa index
    public static void removeIndex ( int index) {
        if (index >= size || index < 0){
            System.err.println("chi so khong hop le");
        }
        for (int i = index; i < size - 1; i++) {
            arrInt[i] = arrInt[i+1];
        }
        arrInt[size-- - 1] = 0;

    }
    //hien thi array
    public static void printArray () {
        for (int j : arrInt) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
//    //update
    public static void updateArray (int index, int number){
        if (index <0 || index >= size){
            System.err.println("chi so khong hop le");
        }
        arrInt[index] = number;
    }
}
