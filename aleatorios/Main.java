class Main {

  public static int obtenerAleatorio(int a , int b){
    int aleatorioEntero = 0;
    aleatorioEntero = (int)(Math.random()*(b-a)+a);
    return aleatorioEntero;
}
  public static void main(String[] args) {
    int aleatorio = 0;
    aleatorio = obtenerAleatorio(4,10);
    System.out.println("Var aleat:" + aleatorio);
  }
}