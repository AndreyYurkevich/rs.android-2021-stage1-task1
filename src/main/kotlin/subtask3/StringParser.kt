package subtask3

import java.lang.IndexOutOfBoundsException
import java.lang.StringBuilder
import javax.print.DocFlavor


class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var text: MutableList<String> = mutableListOf()
//        val OpenBrakets = arrayOf("<", "[", "(")
//        val CloseBrakets = arrayOf(">", "]", ")")
        var count: Int = 0;
//        var indexOpen: Int = 0;
//        var indexClose: Int = 0;
//        var Findex: Int = 0;
//        var Frepeat: Int = 0
//        // val inputString = StringBuilder(inputString)
//        var index : Char =' '
        var OpenBrakets = mutableListOf<Int>()
        var CloseBrakets = mutableListOf<Int>()

        var count1 = 0

        for (i in inputString.indices) {
            if (inputString[i] == '[' || inputString[i] == '<' || inputString[i] == '(') {
                OpenBrakets.add(i)
            }
            if (inputString[i] == ']' || inputString[i] == '>' || inputString[i] == ')'){
                CloseBrakets.add(i)
            }
        }

try {
            while(count<= OpenBrakets.size)  {
                if (inputString.get(OpenBrakets[count]) == '[') {
                    while (count1 <= CloseBrakets.size) {
                        if (inputString.get(CloseBrakets[count1]) == ']') {

                            text.add(inputString.substring(OpenBrakets[count] + 1, CloseBrakets[count1]))
                            count++
                            CloseBrakets.removeAt(count1)
                            count1 = 0
                            break
                        } else count1++
                    }

                }

                if (inputString.get(OpenBrakets[count]) == '(') {
                    while (count1 <= CloseBrakets.size) {
                        if (inputString.get(CloseBrakets[count1]) == ')') {

                            text.add(inputString.substring(OpenBrakets[count] + 1, CloseBrakets[count1]))
                            count++
                            CloseBrakets.removeAt(count1)
                            count1 = 0
                            break

                        } else count1++

                    }

                }

                if (inputString.get(OpenBrakets[count]) == '<') {
                    while (count1 <= CloseBrakets.size) {
                        if (inputString.get(CloseBrakets[count1]) == '>') {

                            text.add(inputString.substring(OpenBrakets[count] + 1, CloseBrakets[count1]))
                            count++
                            CloseBrakets.removeAt(count1)
                            count1 = 0
                            break

                        } else count1++
                    }

                }

            }
    }
catch (e : IndexOutOfBoundsException){

}
        print(text.toString())

        return text.toTypedArray()
    }
}











//        while (count<inputString.length){
//              indexOpen  =  inputString.indexOf(OpenBrakets.get(index))
//            Findex = indexOpen
//              indexClose = inputString.indexOf(CloseBrakets.get(index))
//            Frepeat = indexClose
//            text.add(inputString.substring(indexOpen+1,indexClose))
//
//            if (inputString.indexOf(OpenBrakets.get(index))<0)
//                indexOpen = inputString.indexOf(OpenBrakets.get(index),Findex+1)
//            indexClose = inputString.indexOf(CloseBrakets.get(index),Frepeat+1)
//            text.add(inputString.substring(indexOpen+1,indexClose))
//                break
//        }
//        count++











//        while (count< inputString.length){
//            if (inputString[count].toString() == OpenBrakets.get(index)){
//                indexOpen = count +1
//                while (indexOpen>0){
//                        if (inputString[count].toString() == CloseBrakets.get(index)  ) {
//                            indexClose = count
//                            text.add(inputString.substring(indexOpen, indexClose))
//                           break
//                        }
//
//                        count++
//
//                }
//
//                count = indexOpen
//
//            }
//            count++
//            if (count+1 == inputString.length) {
//               count = 0
//               index++
//               if (index > 2)
//                   break
//           }
//
//        }


    //    println(text.toString())



       // text = arrayOf("nothing")
//        return  text.toTypedArray()
//    }
//
//}


