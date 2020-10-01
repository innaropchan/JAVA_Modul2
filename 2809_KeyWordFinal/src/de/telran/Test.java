package de.telran;

public class Test {
    //private final int ID_NUMBER;
    private static int idNumber = 0;

    /*  public Test(int ID_NUMBER) {
          this.ID_NUMBER = ID_NUMBER;
      }

      public int getID_NUMBER() {
          return ID_NUMBER;
      }*/
    public Test(){
    idNumber++;
}

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Test.idNumber = idNumber;
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3= new Test();

        System.out.println(Test.getIdNumber());
    }
}
