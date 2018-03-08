package Singleton;

public class SingletonTestClass {
    public static void main(String[] args) {

        //Virker ikke
        //SingleObject object = new SingleObject();

        //Her henter den getinstance istedet for at blive istancierededededededededede
        SingleObject object = SingleObject.getInstance();

        //Viser Message;D
        object.showMessage();


    }
}
