package patterns.factorymethod;

public class Factory {
    public void deliver() {
        Transport transport = this.create();
        transport.deliver();
    }

    public Transport create() {
        return null;
    }
}
