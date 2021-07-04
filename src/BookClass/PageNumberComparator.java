package BookClass;

import java.util.Comparator;

public class PageNumberComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPageNumber()> o2.getPageNumber()){return 1;}
        else if(o1.getPageNumber()<o2.getPageNumber()){return -1;}



        return 0;
    }
}
