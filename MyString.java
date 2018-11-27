public class MyString implements CharSequence/*, Comparable<CharSequence>*/{
  //store data in an array of chars
  private char[] data;

  //constructor
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


}
