public class MyString implements CharSequence/*, Comparable<CharSequence>*/{
  private char[] data;

  public MyString(CharSequence s){
    data = new char[s.length()];
  }

  public char charAt(int index){
    if (index < 0 || index > data.length - 1){
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public int length(){
    return 1;
  }

  public CharSequence subSequence(int start, int end){
    if (start < 0 || end < 0 || end > data.length - 1 || start > data.length - 1 || end > start){
      throw new IndexOutOfBoundsException();
    }
    char[] whatWeWant = new char[end-start];
    for (int i = start; i < end; i++){
      whatWeWant += data[i];
    }
    return whatWeWant;
  }

  public String toString(){
    String whatWeWant = "";
    for (int i = 0; i < data.length; i++){
      whatWeWant += data[i];
    }
    return whatWeWant;
  }
}
