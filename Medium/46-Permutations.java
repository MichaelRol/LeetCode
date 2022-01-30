public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(List.of()));
      }
    
      public static List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> numsList =  new ArrayList<>();
        if (nums.size() == 1) {
          List<List<Integer>> toReturn = new ArrayList<>();
          toReturn.add(nums);
          return toReturn;
        }
        for (int i = 0; i < nums.size(); i++) {
          List<Integer> newArr = new ArrayList<>(List.copyOf(nums));
          newArr.remove(nums.get(i));
          List<List<Integer>> permutes = permute(newArr);
          for (List<Integer> permute : permutes) {
            permute.add(nums.get(i));
            numsList.add(permute);
          }
        }
        return numsList;
      }
}
