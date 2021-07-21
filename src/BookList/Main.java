package BookList;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookArray=new ArrayList<>();
        bookArray.add(new Book("1984",350,"George Orwell","1949"));
        bookArray.add(new Book("Otomatik Portakal",168,"Anthony Burgess","1962"));
        bookArray.add(new Book("İki Soylu Akraba",144,"William Shakespeare","1634"));
        bookArray.add(new Book("Yalanın Siyaseti",174,"Yalın Alpay","2017"));
        bookArray.add(new Book("Bilmek ve İstemek",144,"Schopenhauer","1819"));
        bookArray.add(new Book("Metafizik Nedir?",56,"Martin Heidegger","1929"));
        bookArray.add(new Book("Atuan Mezarları",153,"Ursula K. Le Guin","1968"));
        bookArray.add(new Book("Zargana",205,"Hakan Günday","2002"));
        bookArray.add(new Book("Kumarbaz",177,"Dostoyevski","1866"));
        bookArray.add(new Book("Dava",220,"Franz Kafka","1925"));
        //Kitaplar listeye eklendi.

        Map<String,String> bookMap=new TreeMap<>();
        bookArray.forEach(i-> bookMap.put(i.getTitle(), i.getAuthor()));
        // Arrayden çekilen kitap ismi ve yazarı key value olarak map e eklendi stream api içinde daha kolay bi yöntemi varsa bilmiyorum.



        ArrayList<Book> newList=new ArrayList<>();//Yeni liste oluşturuldu.
        bookArray.stream().filter(number-> number.getPageNumber()>100).forEach(newList::add);//Filtrelenen yeni kitaplar sırayla eklendi.
        newList.forEach(i-> System.out.println(i.getTitle()));

    }
}
