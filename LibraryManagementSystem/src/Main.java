public class Main {
    public static void main(String[] args) {
        Library library = new Library(); 
        
        library.addDigitalBook(new DigitalBook("Digital Book 1", 3, 50));
        library.addDigitalBook(new DigitalBook("Digital Book 2", 4, 75));
        library.addPhysicalBook(new PhysicalBook("Physical Book 1",5, 200,3));
        library.addPhysicalBook(new PhysicalBook("Physical Book 2", 6,6,5));
        
        library.writeDetailedInformationOfAllBooks();
        int totalDigital = library.getTotalPriceOfDigitalBooks();
        System.out.println(totalDigital);
        int totalPhysical = library.getTotalPriceOfPhysicalBooks();
        System.out.println(totalPhysical); 

    }
}
