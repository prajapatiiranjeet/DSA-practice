class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = 1;
        int h = arr.length-2;

        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] !=  arr[1]){
            return arr[0];
        }
        if(arr[arr.length-1] != arr[arr.length-2]){
            return arr[arr.length-1];
        }

       while (l <= h) {
          int mid = l + (h - l) / 2;

    if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
        return arr[mid];
    }

    if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
        (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
        l = mid + 1;
    } else {
        h = mid - 1;
    }
}
        return -1;
    }
}