class Main {

  public static int getRandomInt(int a, int b){
    return (int)(Math.random()*(b-a+0.9999)+a);
  }
  
  public static void main(String[] args) {
    
    int claw = getRandomInt(0, 2);
    int dt = getRandomInt(0, 1); // 200, 800
    int intake = getRandomInt(0, 1); //  100 ,200
    int elevator = getRandomInt(0, 1); // 150 , 300   
    int bc = 400 + claw*50;
    int pc = 15+claw*2;
    System.out.println("Claw option " + claw + " $" + bc + " wp " + pc + "%");
    int bd = 200 + dt*50;
    int pd = 20+dt*40;
    System.out.println("DriveTrain option " + dt + " $" + bd + " wp " + pd + "%");
    int bi = 100 + intake*50;
    int pi = 10+intake*5;
    System.out.println("Intake option " + intake + " $" + bi + " wp " + pi + "%");
    int be = 150 + elevator*50;
    int pe = 3+elevator*2;
    System.out.println("Elevator option " + elevator + " $" + be + " wp " + pe + "%");
    int res = bc+bd+bi+be;
    System.out.println("Budget total $" + res + " WPT: " + (pc+pd+pi+pe) + "%" );


    
  }
}