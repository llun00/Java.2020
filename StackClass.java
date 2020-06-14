public class Stapel {
    private StapelElement first = null;
    private long count = 0;

    //adding element on the top of the stack
    public void fuegeElementHinzu(String element){
        StapelElement oldfirst = first;
        first = new StapelElement();
        first.setElement(element);
        first.setNext(oldfirst);
        count++;
    }

    //deleting top element
    public String entferneOberstesElement() {
        if (first == null){
            return null;
        }
        String element = first.getElement();
        first = first.getNext();
        count--;
        return element;
    }

    //returning top element
    public String liefereOberstesElement(){
        if (first == null){
            return null;
        }
        return first.getElement();
    }

    //returning stack size
    public long liefereGroesse(){
        return count;
    }

    public boolean istLeer(){
        return (first == null);
    }

    public static void main(String[] args) {
        Stapel stapel = new Stapel();
        stapel.fuegeElementHinzu("hello0");
        stapel.fuegeElementHinzu("hello1");
        stapel.fuegeElementHinzu("hello2");
        stapel.fuegeElementHinzu("hello3");

        stapel.entferneOberstesElement();
        System.out.println(stapel.liefereOberstesElement());
        System.out.println(stapel.liefereGroesse());
        System.out.println(stapel.istLeer());


    }

}

class StapelElement {
    private StapelElement next;
    private String element;

    public StapelElement getNext(){
        return next;
    }

    public void setNext(StapelElement next){
        this.next = next;
    }

    public String getElement(){
        return element;
    }

    public void setElement(String element){
        this.element = element;
    }

}
