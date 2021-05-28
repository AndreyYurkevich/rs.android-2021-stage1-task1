package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
       // throw  NotImplementedError("Not implemented")
        val massiv: ArrayList<Int> = sadArray.toMutableList() as ArrayList<Int>

        var count = 1;

        while (count < (massiv.size-1)){
            if ((massiv[count-1]+ massiv[count+1]) <= massiv[count]){
                massiv.removeAt(count)
                if (count == 1){
                    continue
                }
                count--

               print(massiv.toString())}
            else (count++)
        }


           val rezult : IntArray = massiv.toIntArray()
        return rezult


    }


}


