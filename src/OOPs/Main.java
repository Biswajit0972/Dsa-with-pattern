package OOPs;

public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("brown");
        System.out.println(p.color);
    }
}

class Pen {
    String color;
    int thik;

    void setColor (String penColor) {
        color = penColor;
    }

    void setThik (int  tip) {
        thik = tip;
    }
}