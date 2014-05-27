package jp.co.jjs.java_seminar.bookshelf.beans;

import java.io.Serializable;

public class Book implements Serializable {

    private int id;
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private int price;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn
                + ", author=" + author + ", publisher=" + publisher
                + ", price=" + price + "]";
    }


}
