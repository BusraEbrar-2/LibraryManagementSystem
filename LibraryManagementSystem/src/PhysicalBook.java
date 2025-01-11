public class PhysicalBook extends Book {
    private int numberOfPage ;

    public PhysicalBook(String bookName, int code , int price, int numberOfPage) {
        super(bookName, code , price);
        this.numberOfPage = numberOfPage;
    }
    

    public int getNumberOfPage() {
        return numberOfPage;
    }


    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }


    @Override
    public int calculate() {

        return getNumberOfPage()*5 ;


    }
    
}
