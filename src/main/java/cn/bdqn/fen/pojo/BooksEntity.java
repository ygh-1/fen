package cn.bdqn.fen.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "books", schema = "book", catalog = "")
public class BooksEntity {
    private int id;
    private String bookName;
    private String bookAuthor;
    private String publisher;
    private int pageCount;
    private double price;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bookName")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "bookAuthor")
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Basic
    @Column(name = "publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "pageCount")
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BooksEntity that = (BooksEntity) o;
        return id == that.id &&
                pageCount == that.pageCount &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(bookName, that.bookName) &&
                Objects.equals(bookAuthor, that.bookAuthor) &&
                Objects.equals(publisher, that.publisher);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, bookName, bookAuthor, publisher, pageCount, price);
    }
}
