package main.java.com.strings;

import main.java.com.common.Utility;

/**
 * Created by imalonzo on 8/17/17.
 */
public class HelloWorld {
  public void displayGreetings(String mesg) {
    System.out.println("hella there : " + mesg);
  }

  public static void main(String[] args)  {
    Utility.display();

    HelloWorld hw = new HelloWorld();

    hw.displayGreetings("Derek");


  }


}
