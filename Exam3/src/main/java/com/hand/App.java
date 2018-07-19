package com.hand;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//创建接口类
interface Num{
    void rm();//产生随机数方法
//    public <T> st(T t);//排序方法
}
//创建实现类1
class NumList implements Num{
    int ranNum;
    List list=new ArrayList();//保存50个随机数
    public  void rm(){
        for(int i=0;i<50;i++){
            ranNum=(int)(Math.random()*100);
            list.add(ranNum);
        }
    }
    public  void st(List l){
        for(int i=0;i<l.size();i++){
            for(int j=1;j<l.size();j++){
                int p1=(int)l.get(i);
                int p2=(int)l.get(j);
                if(p1>p2){
                    int temp=0;
                    temp=p1;
                    p1=p2;
                    p2=temp;
                }
            }
        }
    };
}

//创建实现类2
class NumMap implements Num{
    public  void rm(){

    }
    public  void st(HashMap m){

    }

}

//创建工厂
class NumFactory {
    public Num getNum(){

        return new NumMap();

    }

//    //使用 getShape 方法获取形状类型的对象
//    public Shape getShape(String shapeType){
//        if(shapeType == null){
//            return null;
//        }
//        if(shapeType.equalsIgnoreCase("CIRCLE")){
//            return new Circle();
//        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
//            return new Rectangle();
//        } else if(shapeType.equalsIgnoreCase("SQUARE")){
//            return new Square();
//        }
//        return null;
//    }
}


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "没有完成题目3" );
    }
}
