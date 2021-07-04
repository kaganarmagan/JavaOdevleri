package BookClass;

public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private String publishDate;
    private int pageNumber;

    public Book(String name,int pageNumber,String author,String publishDate){
        this.publishDate=publishDate;
        this.author=author;
        this.name=name;
        this.pageNumber=pageNumber;
    }

    @Override
    public int compareTo(Book a) {
        char[] v1=this.name.toLowerCase().toCharArray();
        char[] v2=a.name.toLowerCase().toCharArray();

        int length=Math.min(v1.length,v2.length);
        for(int i=0;i<length;i++){
            if(v1[i]>v2[i]){
                return 1;
            }else if(v2[i]>v1[i]){
                return -1;
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
