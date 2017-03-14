package pacman2;
public class lintasan2 {
    int x=10,y=10;
    int w=1,z=1;
    int atas,bawah,kanan,kiri;
    String [][] pergerakan = new String [x][y];
    
    public void Lintasanpacman(){
        
    for (int b=0;b<=9;b++){
            for (int k=0;k<=9;k++){
                if  ( b==0 || b==9 || k==0 || k==9 || b==2 && 
                        (k==5||k==6||k==7||k==8)
                        || b==4 && (k==1||k==6)|| b==6 && (k==2||k==3) 
                        || b==7 && (k==2||k==3||k==4)){
                     pergerakan [b][k] = "#";
                }
                else if (b==2&&k==3 || b==4&&k==5 || b==7&&k==5){
                    pergerakan[b][k] = "X";
                }
                else {
                    pergerakan[b][k] = " ";
                }
                if (b==w&&k==z) {
                    pergerakan[b][k] = "O";
                }
                System.out.print(pergerakan[b][k]);
                }
             System.out.println("");
    }
    }
    public void atas() {
      w = w - 1;
      }
    public void kiri() {
        z = z-1;
    }
    public void kanan() {
        z = z+1;
    }
    public void bawah() {
       w = w+1;
    }
}
