interface A {
  void call1();

  void call2();

  void call3();
}

abstract class B implements A {
  public void call1() {
    System.out.println("last day of the month");
  }
}

class C extends B {
  public void call2() {
    System.out.println("June");
  }

  public void call3() {
    System.out.println("2020");
  }
}

class Interfaces {
  public static void main(String args[]) {
    C ob = new C();
    ob.call1();
    ob.call2();
    ob.call3();

  }
}
