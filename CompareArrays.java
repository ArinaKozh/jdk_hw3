public class CompareArrays {
    public static <T> boolean compareArrays(T[] array1, T[] array2){

        if(array1.length!= array2.length){
            return false;
        }

        if(array1.getClass()!=array2.getClass()){
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
                }
            }

        return true;
    }
}
