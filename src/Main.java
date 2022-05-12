public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        fan.turnOn();
        fan.setSpeed(3);
        fan.setRadius(10);
        System.out.println(fan.toString());
    }
}
