package HomeWork_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TypedBoxArray<T> {
    private T[] array;


    public TypedBoxArray(T... array) {
        this.array = array;
    }

    public T[] swapIndex(int index1, int index2) throws ArrayIndexOutOfBoundsException {


        T object ;
        for (int i = 0; i < array.length; i++) {

            if (i == index1) {
                object = array[i];
                array[i] = array[index2];
                array[index2] = object;
            }

            System.out.println(Arrays.toString(array));
            return array;

        }
        return null;
    }

    public List<T> arrayTransformInList() {
        List<T> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, array);
        return myArrayList;
    }

}




//    public T[] swapElements(T value1, T value2) {
//
//        for (int i = 0; i < array.length; i++) {
//
//            int index = 0;
//
//            if (array[i].equals(value1)) {
//                index = i;
//
//                for (a:array){
//                    array.equals(value2);
//                        array[i] = value1;
//                        array[index] = value2;
//                    }
//                }
//            }
//            if (array[i].equals(value2))
//                array[i] = value1;
//            array[index] = value2;
//        }
//            System.out.println(Arrays.toString(array));
//            return array;

//        }







