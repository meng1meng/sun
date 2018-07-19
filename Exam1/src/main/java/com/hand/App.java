package com.hand;



public class App 
{
    public int n=0;
    public static void main( String[] args )
    {
        App a=new App();
        System.out.print( "101-200间总共有"+a.n+"个素数，分别是:");
        a.sushu();
    }

    public void sushu(){
//        int n=0;
        String s=null;
        for(int i=101;i<=200;i++){
            if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0&&i%11!=0&&i%13!=0){
                n++;
                System.out.print(i);
                if(i!=199) {
                    System.out.print(",");
                }
            }

        }
       // System.out.println( "101-200间总共有"+n+"个素数，分别是:"+s );
    }
}
