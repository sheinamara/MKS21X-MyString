public class MyString implements CharSequence, Comparable<CharSequence>{
  // stores data in an array of chars
  private char[] data;

  // constructor
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }

  // implements charAt
  public char charAt(int index){
    if (index < 0 || index > data.length - 1){
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  // implements length
  public int length(){
    return data.length;
  }

  // implements subSequence
  public CharSequence subSequence(int start, int end){
    if (start < 0 || end < 0 || end > data.length - 1 || start > data.length - 1 || end < start){
      throw new IndexOutOfBoundsException();
    }
    String whatWeWant = "";
    for (int i = start; i < end; i++){
      whatWeWant += data[i];
    }
    return whatWeWant;
  }

  // overrides toString
  public String toString(){
    String whatWeWant = "";
    for (int i = 0; i < data.length; i++){
      whatWeWant += data[i];
    }
    return whatWeWant;
  }

  // implements compareTo for Comparable<CharSequence>
  public int compareTo(CharSequence c){
    if (c == null){
      throw new NullPointerException();
    }
    // if they're the same, we just make it zero
    // this should cover empty strings too???
    if (c.equals(this)){
      return 0;
    }
    // if this is empty, but the given isn't empty, then this is less than given thus negative 1
    if (this.toString() == ""){
      if (c.toString() != ""){
        return -1;
      }
    }
    // if the given is empty, but this is not empty, then this is more than given thus positive 1
    if (c.toString() == ""){
      if (this.toString() != ""){
        return 1;
      }
    }
    // loop through to check for when stuff differs to compare
    for (int i = 0; i < this.length() && i < c.length(); i++){
      // if the current index's char is greater in this, then return 1 immediately
      if (this.charAt(i) > c.charAt(i)){
        return 1;
      }
      // the opposite
      if (c.charAt(i) > this.charAt(i)){
        return -1;
      }
      // the same characters
      if (c.charAt(i) == this.charAt(i)){
        // if the current interval is equal to the length of this but then the given is larger, return -1
        if (i == this.length() - 1 && i < c.length() - 1){
          return -1;
        }
        // if the current interval is less than the length of this while given is equal, this is larger, return 1
        if (i < this.length() - 1 && i == c.length() - 1){
          return 1;
        }
        // the current interval is equal to length
        if (i == this.length() - 1 && i == c.length() -1){
          return 0;
        }
      }
    }
    return 0;
  }

}
