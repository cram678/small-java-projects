import java.util.Scanner;
class matrices{
  public static void main(String[] args){
    Scanner sushi=new Scanner(System.in);
    System.out.println("1(addition) 2(subtraction) 3(multiplication)");
    int choice=sushi.nextInt();
    if (choice==1||choice==2){
      System.out.println(" #of rows and colums");
      int rc=sushi.nextInt();
      int[][] jeremy=new int[rc][rc];
      int[][] ethan=new int[rc][rc];
      for(int x=0;x<rc;x++){
        for (int y=0;y<rc;y++){
          System.out.println(" what would u like the number in the "+x+" column and "+y+" row then the number of the same position in yoursecond matrix");
          int numb=sushi.nextInt();
          jeremy[x][y]=numb;
          int numb2=sushi.nextInt();
          ethan[x][y]=numb2;
        }
      }
      int[][] end=new int[rc][rc];
      for(int x=0;x<rc;x++){
        for (int y=0;y<rc;y++){
          if (choice==1){
            end[x][y]=jeremy[x][y]+ethan[x][y];}
          else{
            end[x][y]=jeremy[x][y]-ethan[x][y];}
        }
      }
    }
    else{
      System.out.println(" #of rows and colums");
      int r=sushi.nextInt();
      int c=sushi.nextInt();
      int[][] jeremy=new int[c][r];
      int[][] ethan=new int[r][c];
      for(int x=0;x<c;x++){
        for (int y=0;y<r;y++){
          System.out.println(" what would u like the number in the "+x+" column and "+y+" row");
          int numb=sushi.nextInt();
          jeremy[x][y]=numb;
        }
      }
      for(int x=0;x<r;x++){
        for (int y=0;y<c;y++){
          System.out.println(" what would u like the number in the "+x+" column and "+y+" row of the second matrix to be");
          int numb=sushi.nextInt();
          ethan[x][y]=numb;
        }
      }
      int[][] end=new int[r][r];
      for(int x=0;x<r;x++){
        for (int y=0;y<r;y++){
          int sum=0;
          for (int p=0;p<c;p++){
            sum+=jeremy[p][x]*ethan[y][p];
          }
          end[y][x]=sum;
        }
      }
    }
    for (int x=0;x<end.length;x++){
      for (int y=0;y<end[0].length;y++){
        System.out.print(end[y][x]);
      }
      System.out.println;
    }
  }
}
