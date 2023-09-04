class Main {
    public static void main(String[] args) {
  
      double area = getSquareArea(7);
      System.out.println("Area C:" +  area);
      area = getSquareArea(20);
      System.out.println("Area C2:" +  area);
      // -> mision double triA = getTriangleArea(lado, altura);
      area = getTriangleArea(7, 5) 
      System.out.println("Area T:" +   area);
      
      int x1 = 20;
      int x2 = 10;
      int y1 = 20;
      int y2 = 10;
  
      // API
      int manh = Math.abs(x2-x1) + Math.abs(y2-y1);
      System.out.println("Manhattan distance:" +  manh);
      double resp = getEuclidean(x1,y1,x2,y2);
      System.out.println("Euclidean Distance:" +  resp);
  
      resp = getEuclidean(x1+10,y1-10,x2+5,y2-5);
      System.out.println("Euclidean Distance:" +  resp);
    }
  
    public static double getTriangleArea(double base, double altura){
  
      double area = base*altura/2;
      return area;
    }
  
    public static double getSquareArea(double lado){
  
      double area = lado*lado;
      return area;
    }
  
    public static double getEuclidean(int x1, int y1, int x2, int y2){
      int dx = x2-x1;
      int dy = y2-y1;
      int d1 = dx*dx;
      int d2= dy*dy;
      double r = d1+d2;
      r = Math.sqrt(r);
      return r;
    }
  }