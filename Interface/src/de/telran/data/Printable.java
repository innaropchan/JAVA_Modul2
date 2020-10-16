package de.telran.data;

public interface Printable {
    void print();

    default void print2(String str){
        System.out.println(str);

    }
    static void print1(){
        System.out.println("reading is good");
    }

    static Printable createObjects(String name, int choice){
        switch (choice){
            case 1:
                Printable book = new Book(name);
                return book;
            case 2: return new Journal(name);
            case 3 : return  new Newspaper();
            default: return null;
        }

    }
}
