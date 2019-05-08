package schwimmer.net;

public class Photo {

    private String url;
    private String title;

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
