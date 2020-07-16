package pack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

  @Test
  void test() {
    MyClass myClass = new MyClass();
    assertEquals(1, myClass.foo());
  }

}
