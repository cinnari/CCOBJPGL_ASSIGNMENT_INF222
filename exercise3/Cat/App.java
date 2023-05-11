public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("My mom is " + myPet.mom);
        System.out.println("My dad is " + myPet.dad);
        System.out.println("My height is " + myPet.height);
        System.out.println("My eye color is " + myPet.eyeColor);
    }
}