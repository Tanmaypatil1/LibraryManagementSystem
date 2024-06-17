package com.wipro.library;

public class LibraryManagementSystem
{
    public static void main(String[] args) 
    {
        Library library = new Library();

        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "9780747532699"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780261102385"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780060935467"));

        System.out.println("All Books:");
        library.displayAllBooks();

        String searchTitle = "The Lord of the Rings";
        System.out.println("\nLinear Search:");
        Book foundBookLinear = library.linearSearch(searchTitle);
        System.out.println(foundBookLinear != null ? "Found: " + foundBookLinear : "Book not found");

        System.out.println("\nBinary Search:");
        Book foundBookBinary = library.binarySearch(searchTitle);
        System.out.println(foundBookBinary != null ? "Found: " + foundBookBinary : "Book not found");

        System.out.println("\nRemoving 'Harry Potter and the Philosopher's Stone':");
        library.removeBook("Harry Potter and the Philosopher's Stone");
        library.displayAllBooks();
    }
}
