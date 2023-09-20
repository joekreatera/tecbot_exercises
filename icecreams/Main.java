class Main {

  static int totalCheck = 0;
  static int types = 0;
  static int cQ = 0;
  static int vQ = 0;
  static int sQ = 0;
  
  
  
  public static int getRandom(int a, int b){

    return (int)(Math.random()*((b+0.99)-a)) + a;
    
  }

  public static void getFlavours(int t){

    int choc = t/1000;
    int left = t-choc*1000;
    int vanilla = left/100;
    left = left-vanilla*100;
    int strawberry = left/10;
    cQ = cQ + choc;
    vQ = vQ + vanilla;
    sQ = sQ + strawberry;
  }
  
  public static void doClient(){
    int flavour = getRandom(1,3);
    int size = getRandom(0,1);

    int check = 35+size*35;
    totalCheck = totalCheck + check;
    types = types +  (int)Math.pow(10,flavour);

    
    if(  flavour == 1    ){
      cQ = cQ + 1;
    }
    if(  flavour == 2    ){
      vQ = vQ + 1;
    }
    if(  flavour == 3    ){
      sQ = sQ + 1;
    }
  }
  
  public static void main(String[] args) {
    
    
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();

    //getFlavours(types);
    //types = 0;
   

    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();
    doClient();

    //getFlavours(types);
    //types = 0;

    doClient();
    doClient();

    //getFlavours(types);
    //types = 0;

    System.out.println("Total check : " + totalCheck);
    System.out.println("Choco: " + cQ);
    System.out.println("Vanilla: " + vQ);
    System.out.println("Strawberry: " + sQ);
  }


  /*
  
    Un robot tiene que avanzar en 3 momentos.
    Determina cual es la ruta que tomó, dado que los objetivos
    a donde tiene que ir, cambian en cada momento de izquierda a derecha

    Robot - I
    Robot - D
    Robot - I
    Objectivo - I
  
  
  */
}