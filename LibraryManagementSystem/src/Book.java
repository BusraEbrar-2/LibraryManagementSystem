public abstract class Book {
    // digital ve fiziksel kitaplar burdan türeyecek ilk bunu yaz 

 private String bookName ;
private int code ;
private int price ;

public Book(String bookName, int iSBN, int price) {
    this.bookName = bookName;

    this.price = price;
}

public String getBookName() {
    return bookName;
}
public void setBookName(String bookName) {
    this.bookName = bookName;
}

public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}

public abstract int  calculate ();

public int getCode() {
    return code;
}

public void setCode(int code) {
    this.code = code;
}

}
