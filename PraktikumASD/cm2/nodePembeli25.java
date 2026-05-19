package cm2;

public class nodePembeli25 {
    int noAntrian;
    pembeli25 data;
    nodePembeli25 prev, next;

    public nodePembeli25(int noAntrian, pembeli25 data) {
        this.noAntrian = noAntrian;
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
