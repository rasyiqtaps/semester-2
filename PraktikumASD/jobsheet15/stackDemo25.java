package jobsheet15;

import java.util.Stack;

public class stackDemo25 {
    public static void main(String[] args) {
        book25 book1 = new book25("1234", "Dasar Pemrograman");
        book25 book2 = new book25("7145", "Hafalah Shalat Delisa");
        book25 book3 = new book25("3562", "Muhammad Al-Fatih");
        
        Stack<book25> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);
        
        book25 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }
        
        book25 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }
        
        System.out.println(books);
    }
}