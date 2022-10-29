interface FlyInterface {
    public String fly();
}

class canFly implements FlyInterface {
    public String fly() {
        return "I can fly";
    }
}

class canNotFly implements FlyInterface {
    public String fly() {
        return "I can not fly";
    }
}