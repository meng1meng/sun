package com.hand;

class PersonnalTax{
    //创建PersonnalTax类的一个对象
    private static PersonnalTax pt=new PersonnalTax();
    //设置构造函数为private
    private PersonnalTax(){};
    //获取唯一可用对象
    public static  PersonnalTax getPt(){
        return pt;
    }
    //计算个人缴税费用
    public void pay(float n){
        double w=0;//含税级距
        double p=0;//缴税
        w=n-3500;
        if(w<=1500){
            p=w*0.03;
        }else if(4500>=w&&w>1500){
            p=(w-1500)*0.1;
        }else if(9000>=w&&w>4500){
            p=(w-4500)*0.2;
        }else if(35000>=w&&w>9000){
            p=(w-9000)*0.25;
        }else if(55000>=w&&w>35000){
            p=(w-35000)*0.3;
        }else if(80000>=w&&w>55000){
            p=(w-55000)*0.35;
        }
        else {
            p=(w-80000)*0.45;
        }
        System.out.println("缴税金额为"+p);

    }

}


public class App 
{
    public static void main( String[] args )
    {
        //获取唯一可用对象
        PersonnalTax obj=PersonnalTax.getPt();
        System.out.print( "userA:"+5000+"  " );
        obj.pay(5000);
        System.out.print( "userB:"+10000+"  " );
        obj.pay(10000);
        System.out.print( "userC:"+15000+"  " );
        obj.pay(15000);
        System.out.print( "userD:"+60000+"  " );
        obj.pay(60000);
        //System.out.println( "Hello World!"   );
    }
}
