public class llama {
    private String name;
    private int eyeCount;
    private String colour;
    private boolean isAlive;

    public llama(String name, int eyeCount, String colour, boolean isAlive) {
        this.name = name;
        this.eyeCount = eyeCount;
        this.colour = colour;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEyeCount() {
        return eyeCount;
    }

    public void setEyeCount(int eyeCount) {
        this.eyeCount = eyeCount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void spit(){
        System.out.println("*spit*");
    }

    public void  fart(){
        System.out.println("*fart*");
    }

    @Override
    public String toString() {
        return "llama{" +
                "name='" + name + '\'' +
                ", eyeCount=" + eyeCount +
                ", colour='" + colour + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
