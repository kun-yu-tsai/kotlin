public class Singleton{
    public static Singleton singleton;

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }

        }

        return singleton;
    }

    public void myFun(){
        System.out.println("gogogo123123");
    }
}