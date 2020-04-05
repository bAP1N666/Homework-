
package karel;


public class Karelfnc {
    private String input;
    public int arrayplocha[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,1,0,0},{0,0,0,0,0},{0,0,0,0,0}};
    public int x = 2;
    public int y = 2;

    
    public Karelfnc(String input){
        this.input = input;
    }
    public void input(String input){
        this.input = input;
    }
    public void dothing(){
        
    if (null == input){
        System.out.println("Špatné zadání, pro příkazi napište HELP");
    }
    else switch (input) {
            case "HELP":
                this.HELP();
                break;
            case "start":
                this.start();
                break;
            case "N":
                this.North();
                break;
            case "E":
                this.East();
                break;
            case "S":
                this.South();
                break;
            case "W":
                this.West();
                break;
            default:
                System.out.println("Špatné zadání, pro příkazi napište HELP");
                break;
        }
    }

    public void North(){
        if (x == 0){
          }
          else {
          arrayplocha[x][y] = 0;
          x = x-1;
          arrayplocha[x][y] = 1;
          }
    }
    public void East(){
        if (y == 4){
          }
           else {
          arrayplocha[x][y] = 0;
          y = y+1;
          arrayplocha[x][y] = 1;
           }
    }
    public void South(){
        if (x == 4){
          }
          else {
          arrayplocha[x][y] = 0;
          x = x+1;
          arrayplocha[x][y] = 1;
          }
    }
    public void West(){
        if (y == 0){
          }
          else {
          arrayplocha[x][y] = 0;
          y = y-1;
          arrayplocha[x][y] = 1;
          }
    }

    public void start(){
        for (int i=0; i< 5 ; i++) 
        { 
            for (int j=0; j < 5 ; j++) 
                System.out.print(arrayplocha[i][j] + " ");
  
            System.out.println();
            
        }
    }
    
    public void HELP(){
        System.out.println("N-sever, S-jih, W-západ, E-východ, start-ukázat pole");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
