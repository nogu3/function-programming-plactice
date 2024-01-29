package P1_11;
class P1_11{
  public static void main(String[] args){
    System.out.println(increment(0));
    System.out.println(getFirstCharacter("abc"));
    System.out.println(wordScore("abc"));
  }

  public static int increment(int x) {
    return x+1;
  }

  public static char getFirstCharacter(String s){
    return s.charAt(0);
  }

  public static int wordScore(String word) {
    return word.length();
  }
}