import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.ArrayList;
class hexadecbiConverter{
  public static void main(String[] args){
    Scanner omae_wa_no_shinderu=new Scanner(System.in);
    System.out.println("please select a base that is 16 or under in which you will type your number");
    double deaths=omae_wa_no_shinderu.nextDouble();
    int death=(int)deaths;
    System.out.println("please enter a number in the base you selected warning: some numbers may be too big for the system if you wish to convert to bianary proceed with caution");
    String trucks=omae_wa_no_shinderu.next()+"";
    for(int x=1;x<=3;x++){
      System.out.println("please select the first base you would like this to be in it can be any base between 16 or under");
      int catshat=(int)omae_wa_no_shinderu.nextDouble();
      int trumper=basetodeci(trucks, death);
      System.out.println(converto(trumper, catshat));
    }
  }
  public static int basetodeci(String inp, int base){
    Dictionary letnum= new Hashtable();
    letnum.put("A",10); letnum.put("B",11); letnum.put("C",12);  letnum.put("D",13); letnum.put("E",14); letnum.put("F",15); letnum.put("0",0); letnum.put("1",1);
    letnum.put("2",2); letnum.put("3",3); letnum.put("4",4); letnum.put("5",5); letnum.put("6",6); letnum.put("7",7); letnum.put("8",8); letnum.put("9",9);
    ArrayList actual=new ArrayList();
    int len=inp.length();
    for (int x=0;x<len;x++){
      String fish=inp.charAt(len-(x+1))+"";
      int y=(int)letnum.get(fish);
      actual.add(y);
    }
    int Strain=0; 
    for (int x=0;x<len;x++){
      int c=(int)actual.get(x);
      double drums=c*(Math.pow(base,x));
      Strain+=drums;
    }
    return Strain;
  }
  public static String converto(int deci, int btoo){
    ArrayList gudrid=new ArrayList();
    gudrid.add("A");gudrid.add("B");gudrid.add("C");gudrid.add("D");gudrid.add("E");gudrid.add("F");
    ArrayList theplebs=new ArrayList();
    int pleb=deci;
    int knight=0;
    String clubbing="";
    while (pleb>0){
      knight = pleb%btoo;
      pleb/=btoo;
      if(knight>=10){
        int pertrude=knight-10;
        clubbing=gudrid.get(pertrude)+"";
        theplebs.add(clubbing);
      }
      else{
        theplebs.add(knight);
      }
    }
    String diplodoculous="";
    int petry=theplebs.size();
    for (int x=1;x<=petry;x++){
      diplodoculous+=theplebs.get(petry-x)+"";
    }
    return diplodoculous;
  }
}
