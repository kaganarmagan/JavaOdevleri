package BookClass;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Set<Book> bookSet=new TreeSet<Book>();


        bookSet.add(new Book("White Fang",175,"Jack London","05/1906"));
        bookSet.add(new Book("Lord of the Flies",224,"William Golding","09/1954"));
        bookSet.add(new Book("Animal Farm",112,"George Orwell","08/1945"));
        bookSet.add(new Book("Odysseia",413,"Homeros","800 BC"));
        bookSet.add(new Book("The Sorrows of Young Werther",164,"Goethe","09/1774"));

        for (Book a:bookSet
             ) {
            System.out.println(a.getName()+"\n\t\tSayfa sayısı :"+a.getPageNumber());
        }

        Set<Book> bookSet2=new TreeSet<Book>(new PageNumberComparator());

        bookSet2.add(new Book("White Fang",175,"Jack London","05/1906"));
        bookSet2.add(new Book("Lord of the Flies",224,"William Golding","09/1954"));
        bookSet2.add(new Book("Animal Farm",112,"George Orwell","08/1945"));
        bookSet2.add(new Book("Odysseia",413,"Homeros","800 BC"));
        bookSet2.add(new Book("The Sorrows of Young Werther",164,"Goethe","09/1774"));

        System.out.println("===============================================");
        for (Book a:bookSet2
        ) {
            System.out.println(a.getName()+"\n\t\tSayfa sayısı :"+a.getPageNumber());
        }

    }
}
