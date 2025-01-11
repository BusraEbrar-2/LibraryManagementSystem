public class Library {
    PhysicalBook[] physicalBooks = new PhysicalBook[10] ;
    DigitalBook[] digitalBooks = new DigitalBook[10] ;
private int dcount = 0 ;
private int pcount = 0 ;

public void addDigitalBook(DigitalBook  book ){
    if (dcount < digitalBooks.length) {
        digitalBooks[dcount++] = book;
    } else {
        System.out.println("Dizi dolu, kitap eklenemiyor.");
    }
}
public void addPhysicalBook(PhysicalBook  book ){
    if (pcount < physicalBooks.length) {
        physicalBooks[pcount++] = book;
    } else {
        System.out.println("Dizi dolu, kitap eklenemiyor.");
    }
}

public int getTotalPriceOfDigitalBooks() {
    int total = 0;
    for (int i = 0; i < dcount; i++) {
        total += digitalBooks[i].calculate();
    }
    return total;
}
public int getTotalPriceOfPhysicalBooks() {
    int total = 0;
    for (int i = 0; i < pcount; i++) {
        total += physicalBooks[i].calculate();
    }
    return total;
}




public void writeDetailedInformationOfAllBooks (){
    for (int i = 0; i < dcount; i++) {
        DigitalBook book = digitalBooks[i];
        System.out.println("Digital Book " + book.getBookName() + " has ISBN: " + book.getCode() + " with price: " + book.getPrice());
    }

    // Fiziksel kitapların bilgilerini yazdırma
    for (int i = 0; i < pcount; i++) {
        PhysicalBook book = physicalBooks[i];
        System.out.println("Physical Book " + book.getBookName() + " has ISBN: " + book.getCode() + " with price: " + book.getPrice());
    }
}






}
