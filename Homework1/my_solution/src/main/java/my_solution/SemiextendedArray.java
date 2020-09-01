package my_solution;

public class SemiextendedArray implements DynamicIntegerArray{

    private int[] array;
    private int sizeOfArray;

    //default constructor
    public SemiextendedArray(){}

    //constructor with initial size of array
    public SemiextendedArray(int sizeOfArray){
        if (sizeOfArray < 0){
            System.out.println("Incorrect size of array");
            System.exit(-111);
        }
        array = new int[sizeOfArray];
        this.sizeOfArray = sizeOfArray;
    }



    public int get(int index){
        if(index > array.length || index < 0){
            System.out.println("Size of array is less than given index");
            return -1000;
        } else {
            return array[index];
        }
    }

    //sets value in place with given index
    public void setValue(int index, int value){
        if(index > sizeOfArray || index < 0){
            System.out.println("The given index is incorrect");
            System.exit(-112);
        }
        array[index] = value;
    }


    public void add(int value){
        int[] newArray = array;
        array = new int[sizeOfArray+1];
        for(int i = 0; i < sizeOfArray; i++){
            array[i] = newArray[i];
        }
        array[sizeOfArray] = value;
        ++sizeOfArray;
    }

    public int size(){
        return sizeOfArray;
    }

    public void print(){
        for(int i = 0; i < sizeOfArray; i++){
            System.out.println(array[i]);
        }
    }


}
