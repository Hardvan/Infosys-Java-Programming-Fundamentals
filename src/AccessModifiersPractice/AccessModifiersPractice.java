package AccessModifiersPractice;

class InfyTV {
    private String photographer;
    private String newsReporter;
    private String correspondent;

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getNewsReporter() {
        return newsReporter;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public void documentraryFilm() {
        System.out.println("Documentary film is being shot.");
        System.out.println("A hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?......");
        System.out.println("by Correspondent: " + correspondent);
        System.out.println("by Photographer: " + photographer);
        System.out.println("by News Reporter: " + newsReporter);
    }
}

public class AccessModifiersPractice {
    public static void main(String[] args) {
        InfyTV infyTV = new InfyTV();
        // infyTV.correspondent; // Error: correspondent has private access in InfyTV
        infyTV.setCorrespondent("Siddharth");
        infyTV.setPhotographer("Rahul");
        infyTV.setNewsReporter("Raj");
        infyTV.documentraryFilm();
    }
}
