package Mediator;

public class MediatorTest {
    //En mediator, er en klasse som andre kommunikere igennem. f.eks. Mail liste
    // /
    //Hvis man sender en besked til mange, sender den ikke til hver enkelte, men i stedet til Mediator. Og så sende mediator den till alle sammen.

    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John Hitler");

        robert.sendMessage("Hello my friends");
        john.sendMessage("Kys");
    }


}
