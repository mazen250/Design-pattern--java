public class Animal {
    private String name;
    private int age;
    FlyInterface flyingAbility;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public String tryToFly(){
         return flyingAbility.fly();
   }
   public void setFlyInterface(FlyInterface fly){
            flyingAbility = fly;
   }
}
