package BookList;



public class Book {
    private String title;
    private int pageNumber;
    private String author;
    private String publishDate;

    public Book(String title,int pageNumber,String author,String publishDate){
        this.author=author;
        this.pageNumber=pageNumber;
        this.title=title;
        this.publishDate=publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
