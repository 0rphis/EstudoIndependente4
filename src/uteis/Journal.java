package uteis;

public class Journal {
    private String name;
    private byte impactFactor;

    public Journal(String name, byte impactFactor) {
        this.name = name;
        this.impactFactor = impactFactor;
    }

    public void Journal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getImpactFactor() {
        return impactFactor;
    }

    public void setImpactFactor(byte impactFactor) {
        this.impactFactor = impactFactor;
    }

    @Override
    public String toString() {
        return "Journal [name=" + name + ", impactFactor=" + impactFactor + "]";
    }
}
