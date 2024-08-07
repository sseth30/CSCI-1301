// For an overview of the program and sample inputs, be sure to check out `InteractiveFiction.md`

public class Player {
    private int x;
    private int y;
    private Lamp lamp;
    private Key key;

    // No-argument constructor
    public Player() {
        this(0, 0);  
    }

    // Constructor with parameters
    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
        this.lamp = null;
        this.key = null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp newLamp) {
        lamp = newLamp;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key newKey) {
        key = newKey;
    }
}

