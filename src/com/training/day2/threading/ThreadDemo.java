package com.training.day2.threading;

public class ThreadDemo implements Runnable{
    private int n;

    public ThreadDemo(int n) {
        this.n = n;
    }

    @Override
    public void run(){
        synchronized (this){
            for(int i=1;i<=10;i++){
                System.out.println(n +" * " +i+" = "+(n*i));
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){

                System.out.println("Intureptted");
                }
            }

        }
    }
}
