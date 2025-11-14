package uteis;

import java.util.ArrayList;

public class Article extends Publication {
    private ArrayList<String> keyWords = new ArrayList<>();
    private long issn;
    private byte issue;
    private short startPage;
    private short endPage;

    public Article(ArrayList<String> keyWords, long issn, byte issue, short startPage, short endPage, String title,
            short year, byte volume, long id) {
        super(title, year, volume, id);
        this.keyWords = keyWords;
        this.issn = issn;
        this.issue = issue;
        this.startPage = startPage;
        this.endPage = endPage;
    }

    public void Article() {
    }

    public ArrayList<String> getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(ArrayList<String> keyWords) {
        this.keyWords = keyWords;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }

    public byte getIssue() {
        return issue;
    }

    public void setIssue(byte issue) {
        this.issue = issue;
    }

    public short getStartPage() {
        return startPage;
    }

    public void setStartPage(short startPage) {
        this.startPage = startPage;
    }

    public short getEndPage() {
        return endPage;
    }

    public void setEndPage(short endPage) {
        this.endPage = endPage;
    }

    public String getArticleInfo() {
        return "Article{" +
                "keyWords=" + keyWords +
                ", issn=" + issn +
                ", issue=" + issue +
                ", startPage=" + startPage +
                ", endPage=" + endPage +
                '}';
    }

    // um metodo para adicionar e remover palavras-chave da lista de palavras-chave
    // Métodos do diagrama UML
    public void addKeyWord(String key) {
        if (key != null && !key.trim().isEmpty()) {
            keyWords.add(key);
        }
    }

    public boolean removeKeyWord(String key) {
        return keyWords.remove(key);
    }
}
