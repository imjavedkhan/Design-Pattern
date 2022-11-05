class SingletonEager{
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}

class SingletonLazy{
    private static SingletonLazy instance = null;

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        if(instance == null){
             instance = new SingletonLazy();
        }
        return instance;
    }
}

class SingletonThreadSafe{
    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe(){}

    public static SingletonThreadSafe getInstance(){
        
        if(instance == null){
        synchronized (SingletonThreadSafe.class){
                if(instance == null){
                instance = new SingletonThreadSafe();
            }
        }
    }
    return instance;
    }
}


class DiverClass{
    public static void main(String[] args) {
        //Singleton obj = new Singleton();
        SingletonEager obj1 = SingletonEager.getInstance();
        SingletonEager obj2 = SingletonEager.getInstance();

        SingletonLazy obj3 = SingletonLazy.getInstance();
        SingletonLazy obj4 = SingletonLazy.getInstance();

        SingletonThreadSafe obj5 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe obj6 = SingletonThreadSafe.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj3);
        System.out.println(obj4);

        System.out.println(obj5);
        System.out.println(obj6);
        
    }
}