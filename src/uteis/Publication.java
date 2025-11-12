package uteis;

public class Publication {
    private String title;
    private short year;
    private byte volume;
    private long id;

    public Publication(String title, short year, byte volume, long id) {
        this.title = title;
        this.year = year;
        this.volume = volume;
        this.id = id;
    }

    public void Publication(String title, short year, byte volume, long id) {
        this.title = title;
        this.year = year;
        this.volume = volume;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public short getYear() {
        return year;
    }

    public byte getVolume() {
        return volume;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void setVolume(byte volume) {
        this.volume = volume;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Publication [title=" +
                title + ", year=" + year + ", volume="
                + volume + ", id=" + id + "]";
    }
}
