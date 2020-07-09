package Generics;

class Media<T>{
    
    private T type;

    public void set(T t) { 
        this.type = t; 
    }
    public T get() { 
        return type; 
    }
    
    
}

class Book {
    private String Name;
    private static final String Type = "Video";
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    
}

class Video {
    private String Name;
    private static final String Type = "Video";
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
}

class Newspaper {
    private String Name;
    private static final String Type = "Video";
    
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
}

public class MediaLibrary {
    
    
    public static void main(String[] args) {
        
        Book book1 = new Book();
        Video video1 = new Video();
        Newspaper newspaper1 = new Newspaper();
        
        Media<Book> bookObject = new Media<Book>();
        bookObject.set(book1);
        //mediaObject.set(video1);
        
        Media<Object> mediaObject = new Media<Object>();
        
        mediaObject.set(book1);
        mediaObject.set(video1);
        mediaObject.set(newspaper1);
        
        
        
        
        
    } 

}