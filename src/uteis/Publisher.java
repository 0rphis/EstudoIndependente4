package uteis;

public class Publisher {
    private String name;
    private String coutry;

    public Publisher(String name, String coutry) {
        this.name = name;
        this.coutry = coutry;
    }

    public void Publisher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    @Override
    public String toString() {
        return "Publisher [name=" + name + ", coutry=" + coutry + "]";
    }

}
