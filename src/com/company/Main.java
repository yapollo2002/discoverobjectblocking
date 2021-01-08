package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1=new String("It is blocking object ");

        BlockingObject b = new BlockingObject(s1);
        String s2=new String(" It is blocking object2");

        BlockingObject b2 = new BlockingObject(s2);


        b.start();


        b2.start();




    }
}
       class BlockingObject extends Thread {

    public BlockingObject(String s){
        this.s = s;
    }
           String s =" It is blocking object" ;
          public void run() {
              synchronized (s) {
                  System.out.println("we are entered in block");
                  System.out.println(s);
                  try {
                      sleep(5000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }


              }
          }

       }