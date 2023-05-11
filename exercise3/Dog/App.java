public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        GoldenDoodle myFriend = new GoldenDoodle();

        myFriend.bark();
        System.out.println(myFriend.name);
        System.out.println("My eye color " + myFriend.eyeColor);
        System.out.println("My height is " + myFriend.height);
        System.out.println("My coat is " + myFriend.fur);
    }
}