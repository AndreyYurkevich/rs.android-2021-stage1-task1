package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
       // throw NotImplementedError("Not implemented")
        var message = "Bon Appetit"

        var cost = (bill.sum()-bill[k])/2
        if (cost == b) return message
        else return  (b-cost).toString()
    }
}
