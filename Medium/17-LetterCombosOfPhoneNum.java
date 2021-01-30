public class LetterCombosOfPhoneNum {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }
        HashMap<Character, List<String>> buttonMap = new HashMap<Character, List<String>>();
        buttonMap.put('2', Arrays.asList("a", "b", "c"));
        buttonMap.put('3', Arrays.asList("d", "e", "f"));
        buttonMap.put('4', Arrays.asList("g", "h", "i"));
        buttonMap.put('5', Arrays.asList("j", "k", "l"));
        buttonMap.put('6', Arrays.asList("m", "n", "o"));
        buttonMap.put('7', Arrays.asList("p", "q", "r", "s"));
        buttonMap.put('8', Arrays.asList("t", "u", "v"));
        buttonMap.put('9', Arrays.asList("w", "x", "y", "z"));
        
        List<String> answer = buttonMap.get(digits.charAt(0));
        for (int i = 1; i < digits.length(); i++) {
            answer = zip(answer, buttonMap.get(digits.charAt(i)));
        }
        return answer;
    }
    
    public List<String> zip(List<String> list1, List<String> list2) {
        List<String> output = new ArrayList<String>();
        for (int x = 0; x < list1.size(); x++) {
            for (int y = 0; y < list2.size(); y++) {
                output.add(list1.get(x) + list2.get(y));
            }
        }
        return output;
    }
}
