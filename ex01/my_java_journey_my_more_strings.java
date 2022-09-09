class JavaJourney {
  static void christmas_song(String s3, String s2, String s1) {
    System.out.println(s1 + ", " + s3);
    System.out.println(s2);
  }
  static void prints_my_strings(String s1, String s2, String s3) {
    christmas_song(s3, s2, s1);
  }
  public static void main(String[] args) {
    String my_first_string = "Jingle bells";
    String my_second_string = new String("Jingle all the way");
    String my_third_string = my_first_string;
    prints_my_strings(my_first_string, my_second_string, my_third_string);
  }
}