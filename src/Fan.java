public class Fan {
    String speed = "SLOW", color = "blue";
    boolean on = false;
    double radius = 5;
    public void turnOn(){
        this.on=true;
    }
    public void turnOff(){
        this.on=false;
    }

    public String getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                this.speed = "SLOW";
                break;
            case 2:
                this.speed = "MEDIUM";
                break;
            case 3:
                this.speed = "FAST";
                break;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        if (this.on){
            return ("fan is on"+"..Speed: "+this.speed+"..Radius: "+this.radius+"..Color: "+this.color);
        }else {
            return ("fan is off"+"..Speed: "+this.speed+"..Radius: "+this.radius+"..Color: "+this.color);
        }
    }
}
