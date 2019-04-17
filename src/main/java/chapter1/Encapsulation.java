package chapter1;

public class Encapsulation {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public final static int count=10;
    void testLocalVar(){
        final int count;
        count=10;
        System.out.println(count);
    }*/
}

class testclass{
    public static void main(String[] args){
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setColor("red");
        System.out.print(encapsulation.getColor());
    }
}
