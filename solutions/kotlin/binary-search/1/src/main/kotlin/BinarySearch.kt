object BinarySearch {
    fun search(list: List<Int>, item: Int): Int {
        if (list.isEmpty()) throw NoSuchElementException("List cannot be empty")
        var left = 0
        var right = list.size-1
        while(left<=right){
            var mid = left + (right-left)/2
            when{
                list[mid] == item -> return mid
                list[mid] < item -> left=mid+1
                else -> right=mid-1
            }
        }
        throw NoSuchElementException("Value $item not found in list")
    }
}
