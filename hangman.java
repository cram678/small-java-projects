import java.util.Scanner;
import java.util.ArrayList;
class hangman{
  public static void main(String[] args){
    ArrayList words=new ArrayList();
    int done=1;
    words.add("one");words.add("tail");words.add("snail");words.add("embark");words.add("destroy");
    while(done==1){
    int complete=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("YOU ARE NOW PLAYING HANG MAN");
    System.out.println("");
    String word=(String)words.get((int)(Math.random()*5));
    String array="";
    for(int x =0; x<word.length();x++){
      array+="_ ";
    }
    int chances=3;
    String guessed="";
    while (complete==1){
      System.out.println("your word is "+word.length()+" letters long please guess a letter");
      System.out.println(array);
      String letter=(sc.next()).toLowerCase();
      System.out.println();
      if (guessed.indexOf(letter)!=-1){
        System.out.println("you already guesssed that");
      }
      else if (word.indexOf(letter)==-1){
        chances--;
        System.out.println("sorry u were wrong u have "+chances+" chances left");
        guessed+=letter;
      }
      else{
        System.out.println("nice job u are correct");
        array=array.substring(0,(word.indexOf(letter)*2))+letter+array.substring(word.indexOf(letter)*2+1,array.length());
        guessed+=letter;
      }
      if (array.replace(" ","").equals(word)){
        System.out.println("you win would you like to play again? (1)yes (2)no");
        int ans=sc.nextInt();
        complete=2;
        if (ans==2){
          done=2;
        }
      }
      if (chances==0){
        System.out.println("you LOSE WOW UR BAD would you like to play again? (1)yes (2)no");
        int ans=sc.nextInt();
        complete=2;
        if (ans==2){
          done=2;
      }
    }
  }
}
}
}
