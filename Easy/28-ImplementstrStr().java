class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int index = 0;
        Boolean found = false;
        while (!found) {
            if (index + needle.length() <= haystack.length()) {
                if (haystack.substring(index,index+needle.length()).equals(needle)){
                    return index;
                }
                index++;
            } else {
                return -1;
            }
        }
        return index;
            
    }
}