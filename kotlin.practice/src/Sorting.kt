import java.util.Arrays

fun main(args: Array<String>) {
    println("good")
    val array = intArrayOf(3,2,5,8,1)
    selectionSort(array)
    println(Arrays.toString(array))
}

fun insertionSort(array: IntArray){


}

fun selectionSort(array: IntArray){
    for( index in array.indices){
        var minIndex = index

        for( i in index + 1 until array.size){

            if(array[minIndex] < array[index]){

                minIndex = index
            }
        }
        swap(array, index, minIndex)
    }
}

fun swap(array: IntArray, i : Int, j: Int){
    var temp = array[i];
    array[i] = array[j];
    array[j] = temp
}