public class Main {
    public static void main(String[] args) {

        // Create a new Animal object called dog with dog class
        Animal dog = new Dog();
        dog.flyingAbility = new canNotFly(); //print I can not fly
        System.out.println("Dog: "+dog.tryToFly());

        // Create a new Animal object called bird with bird class
        Animal bird = new Bird();
        bird.setFlyInterface(new canFly());
        System.out.println("Bird: "+bird.tryToFly());


        dog.setFlyInterface(new canFly()); //set flying ability to can fly
        System.out.println("Dog: "+dog.tryToFly());

    }
}