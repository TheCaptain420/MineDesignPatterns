package Singleton;

public class SingleObject {
//Laver et object
    private static SingleObject instance = new SingleObject();

    //Laver constructor private så den ikke kan blive instansieret.
    private SingleObject(){}

    //En getter der henter instancen
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Im pickle rick, reeee");
    }

}
