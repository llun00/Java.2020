public class Stapel {
    private int maxSize;
    private StapelElement[] stackArray;
    private int top;

    //Konstruktor 1
    public Stapel(){
        top = -1;
    }

    //Konstruktor 2
    public Stapel(int m) {
        this.maxSize = m;
        stackArray = new StapelElement[maxSize];
        top = -1;
    }


    //adding element on the top of the stack
    public void fuegeElementHinzu(StapelElement e){
        if(top < maxSize - 1){ stackArray[++top] = e;}
        else
            System.out.println("Stack is full");
    }

    //deleting top element
    public String entferneOberstesElement() {
        if (top == -1){
            return null;
        }
        String temp = stackArray[top].getString();
        stackArray[top] = null;
        top--;
        return temp;

    }

    //returning top element
    public String liefereOberstesElement(){
        if (top == -1){
            return null;
        }
        return stackArray[top].getString();
    }

    //returning stack size
    public long liefereGroesse(){
        return (long)(top + 1);
    }

    public boolean istLeer(){
        return (top == -1);
    }

    public static void main(String[] args) {
        Stapel TestStack = new Stapel(10);

        TestStack.fuegeElementHinzu(new StapelElement("first"));
        TestStack.fuegeElementHinzu(new StapelElement("second"));
        TestStack.fuegeElementHinzu(new StapelElement("third"));

        TestStack.entferneOberstesElement();
        //System.out.println(boolean TestStack.istLeer());
        System.out.println(TestStack.liefereOberstesElement());
        System.out.println(TestStack.liefereGroesse());


    }

}

class StapelElement {
    private String s;

    public StapelElement(){

    }

    public StapelElement(String s){
        this.s = s;
    }

    public String getString() {
        return s;
    }

    public void setString(String s) {
        this.s = s;
    }
}
