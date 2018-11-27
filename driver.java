public class driver{
  //Main
  public static void main(String[]args){
    //Strings and MyStrings for testing
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    MyString newAlphabet = new MyString(alphabet);
    String sentence = "The quick brown fox jumps over the lazy dog.";
    MyString newSentence = new MyString(sentence);
    String empty = "";
    MyString newEmpty = new MyString(empty);
    //vars for counting wrong tests (individual)
    boolean test;
    int wrongCount = 0;
    //vars for keeping track of which functions need to be worked on
    boolean goodConstructor = true;
    boolean goodCharAt = true;
    boolean goodLength = true;
    boolean goodSubSequence = true;
    boolean goodCompareTo = true;
    String constructor, charAt, length, subSequence, compareTo = "";

//---------------------------------------------------------------------------------------------------//

    //-----Testing the constructor and toString(CharSequence c)-----//
    System.out.println("\n\n-----Testing the constructor and toString(CharSequence c)-----");
    System.out.println("Original alphabet: " + alphabet);
    System.out.println("New MyString newAlphabet: "+newAlphabet.toString());
    test = alphabet.equals(newAlphabet.toString());
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("Original sentence: " + sentence);
    System.out.println("New MyString newSentence: "+newSentence.toString());
    test = sentence.equals(newSentence.toString());
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("Original empty: " + empty);
    System.out.println("New MyString newEmpty: "+newEmpty.toString());
    test = empty.equals(newEmpty.toString());
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("\nNumber of wrong tests: "+wrongCount);
    if (wrongCount > 0) goodConstructor=false; //if wrong tests > 0, constructor not good :(
    wrongCount = 0;

//---------------------------------------------------------------------------------------------------//

    //-----Testing charAt(int index)-----//
    System.out.println("\n\n-----Testing charAt(int index)-----");
    try{
      System.out.println("alphabet.charAt(0) --> a: " + alphabet.charAt(0));
      test = alphabet.charAt(0)=='a';
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);
      System.out.println("alphabet.charAt(25) --> z: " + alphabet.charAt(25));
      test = alphabet.charAt(25)=='z';
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);
      System.out.println("newAlphabet.charAt(0) --> a: " + newAlphabet.charAt(0));
      test = newAlphabet.charAt(0)=='a';
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);
      System.out.println("newAlphabet.charAt(25) --> z: " + newAlphabet.charAt(25));
      test = newAlphabet.charAt(25)=='z';
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);

      //Exception testing
      System.out.println("\n----------Exception testing for charAt(int index)----------");
      System.out.println("alphabet.charAt(26) --> Exception: ");
      System.out.println(alphabet.charAt(26));
      wrongCount++; //only runs if the above didn't cause an Exception
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("Test Passed: "+ test);
    }
    try{
      System.out.println("newAlphabet.charAt(26) --> Exception: ");
      System.out.println(newAlphabet.charAt(26));
      wrongCount++; //only runs if the above didn't cause an Exception
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
      System.out.println("Test Passed: "+ test);
    }
    try{
      test = true;
      System.out.println("empty.charAt(0) --> Exception: ");
      System.out.println(empty.charAt(0));
      wrongCount++; //only runs if the above didn't cause an Exception
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    try{
      test = true;
      System.out.println("newEmpty.charAt(0) --> Exception: ");
      System.out.println(newEmpty.charAt(0));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    try{
      test = true;
      System.out.println("sentence.charAt(-1) --> Exception: ");
      System.out.println(sentence.charAt(-1));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    System.out.println("\nNumber of wrong tests: "+wrongCount);
    if (wrongCount > 0) goodCharAt=false; //if wrong tests > 0, charAt not good :(
    wrongCount = 0;

//---------------------------------------------------------------------------------------------------//

    //-----Testing length()-----//
    System.out.println("\n\n-----Testing length()-----");
    System.out.println("newAlphabet.length() --> 26: "+newAlphabet.length());
    test = newAlphabet.length() == 26;
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("alphabet.length() --> 26: "+alphabet.length());
    test = alphabet.length() == 26;
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("newEmpty.length() --> 0: "+newEmpty.length());
    test = newEmpty.length() == 0;
    if (!test) wrongCount++;
    System.out.println("Test Passed: "+ test);
    System.out.println("\nNumber of wrong tests: "+ wrongCount);
    if (wrongCount > 0) goodLength=false; //if wrong tests > 0, length not good :(
    wrongCount=0;

  //---------------------------------------------------------------------------------------------------//

    //-----Testing subSequence(int start, int end)-----//
    System.out.println("\n\n-----Testing subSequence(int start, int end)-----");
    try{
      System.out.println("Should print \"bcde\"");
      System.out.println("Output: " + newAlphabet.subSequence(1, 5));
      test = newAlphabet.subSequence(1,5).toString().equals(alphabet.substring(1,5));
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);
      System.out.println("Should print \"abcdefghijklmnopqrstuvwxy\": ");
      System.out.println("Output: " + newAlphabet.subSequence(0,26));
      test = newAlphabet.subSequence(0,26).toString().equals(alphabet.substring(0,26));
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+ test);
      System.out.println("Should print \" brown\"");
      System.out.println("Output: " + newSentence.subSequence(9,15));
      test = newSentence.subSequence(9,15).toString().equals(sentence.substring(9,15));
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+test);
      System.out.println("Should print \"\"");
      System.out.println("Output: " + newSentence.subSequence(8,8));
      test = newSentence.subSequence(8,8).toString().equals(sentence.substring(8,8));
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+test);
      System.out.println("Should print \"\"");
      System.out.println("Output: " + newEmpty.subSequence(0,0));
      test = newEmpty.subSequence(0,0).toString().equals(empty.substring(0,0));
      if (!test) wrongCount++;
      System.out.println("Test Passed: "+test);

      //Exception testing
      System.out.println("\n----------Exception testing for subSequence(int start, int end)----------");
      test = true;
      System.out.println("\nnewAlphabet.subSequence(-1,9) --> IndexOutOfBoundsException: ");
      System.out.println(newAlphabet.subSequence(-1,9));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
      System.out.println("Check for negative indices!");
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    try{
      test = true;
      System.out.println("\nnewAlphabet.subSequence(10, -1) --> IndexOutOfBoundsException: ");
      System.out.println(newAlphabet.subSequence(10,-1));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
      System.out.println("Check for negative indices!");
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    try{
      test = true;
      System.out.println("\nnewAlphabet.subSequence(12, 8) --> IndexOutOfBoundsException: ");
      System.out.println(newAlphabet.subSequence(12, 8));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
      System.out.println("Check that start =< end!");
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    try{
      test = true;
      System.out.println("\nnewAlphabet.subSequence(5, 27) --> IndexOutOfBoundsException: ");
      System.out.println(newAlphabet.subSequence(5, 27));
      wrongCount++; //only runs if the above didn't cause an Exception
      test = false;
      System.out.println("Check that end =< length!");
    }
    catch (IndexOutOfBoundsException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    System.out.println("\nNumber of wrong tests: "+wrongCount);
    if (wrongCount > 0) goodSubSequence=false; //if wrong tests > 0, subSequence not good :(
    wrongCount = 0;

//---------------------------------------------------------------------------------------------------//

    //-----Testing compareTo(CharSequence)-----//
    System.out.println("\n\n-----Testing compareTo(CharSequence)-----");
    String a = "";
    String b = "hello";
    String c = "hello world";
    String d = "Hello";
    MyString A = new MyString(a);
    MyString B = new MyString(b);
    MyString C = new MyString(c);
    MyString D = new MyString(d);
    System.out.println("\nString a = \"\"");
    System.out.println("String b = \"hello\"");
    System.out.println("String c = \"hello world\"");
    System.out.println("String d = \"Hello\"");
    System.out.println("MyString A = new MyString(a)");
    System.out.println("MyString B = new MyString(b)");
    System.out.println("MyString C = new MyString(c)");
    System.out.println("MyString D = new MyString(d)");
    try{
      System.out.println("a.compareTo(a)--> 0: " + a.compareTo(a));
      if (a.compareTo(a)==0) test = true;
      else{
        wrongCount++;
        test = false;
        System.out.println("A CharSequence should be equal to itself. Make sure your function works for empty strings.");
      }
      System.out.println("Test Passed: "+ test);
      System.out.println("A.compareTo(A)--> 0: " + A.compareTo(A));
      if (A.compareTo(A)==0) test = true;
      else{
        wrongCount++;
        test = false;
        System.out.println("A CharSequence should be equal to itself. Make sure your function works for empty strings.");
      }
      System.out.println("Test Passed: "+ test);
      System.out.println("B.compareTo(c)--> some negative integer: " + B.compareTo(c));
      if (B.compareTo(c) >= 0){
        wrongCount++;
        test = false;
        System.out.println("Check your return statements. Should be negative.");
      }
      System.out.println("Test Passed: "+ test);
      System.out.println("C.compareTo(B)--> some positive integer: " + C.compareTo(B));
      if (C.compareTo(B) <= 0){
        wrongCount++;
        test = false;
        System.out.println("Check your return statements. Should be positive.");
      }
      System.out.println("Test Passed: "+ test);
      System.out.println("D.compareTo(b)--> some negative integer: " + D.compareTo(b));
      if (D.compareTo(b) >= 0){
        wrongCount++;
        test = false;
        System.out.println("Check your return statements. Should be positive.");
      }
      System.out.println("Test Passed: "+ test);

      //Exception testing
      System.out.println("\n----------Exception testing for compareTo----------");
      System.out.println("A.compareTo(null)--> NullPointerException: ");
      System.out.println(A.compareTo(null));
      //Below shouldn't run!!!
      wrongCount++;
      test = false;
      System.out.println("This should cause an exception!");
    }
    catch (NullPointerException e){
      System.out.println(e);
    }
    catch (ClassCastException e){
      System.out.println(e);
    }
    System.out.println("Test Passed: "+ test);
    System.out.println("\nNumber of wrong tests: "+wrongCount);
    if (wrongCount > 0) goodCompareTo=false; //if wrong tests > 0, compareTo not good :(
    wrongCount = 0;

  //---------------------------------------------------------------------------------------------------//

    //Results
    System.out.println("\n\n\nResults!!!");
    if (goodConstructor){
      System.out.println("Nice job! Everything works for your constructor and toString!");
    }
    else{
      System.out.println("Uh oh, you had some mistakes in your constructor or toString. Scroll up for the specific test cases!");
    }
    if (goodCharAt){
      System.out.println("Nice job! Everything works for your charAt!");
    }
    else{
      System.out.println("Uh oh, you had some mistakes in your charAt. Scroll up for the specific test cases!");
    }
    if (goodLength){
      System.out.println("Nice job! Everything works for your length!");
    }
    else{
      System.out.println("Uh oh, you had some mistakes in your length. Scroll up for the specific test cases!");
    }
    if (goodSubSequence){
      System.out.println("Nice job! Everything works for your subSequence!");
    }
    else{
      System.out.println("Uh oh, you had some mistakes in your subSequence. Scroll up for the specific test cases!");
    }
    if (goodCompareTo){
      System.out.println("Nice job! Everything works for your compareTo!");
    }
    else{
      System.out.println("Uh oh, you had some mistakes in your compareTo. Scroll up for the specific test cases!");
    }
    if (goodConstructor&&goodCharAt&&goodLength&&goodSubSequence&&goodCompareTo){
      System.out.println("\nCongrats! Everything is working nicely :)");
    }
    else{
      System.out.println("\nKeep working! You can do it :)");
    }
  }
}
