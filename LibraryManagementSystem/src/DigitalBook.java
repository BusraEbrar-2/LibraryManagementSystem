public class DigitalBook extends Book {
    
public DigitalBook (String bookName, int code, int price) {
    super( bookName, code, price) ;

}

@Override
public int  calculate() {
return getPrice();
}







}
