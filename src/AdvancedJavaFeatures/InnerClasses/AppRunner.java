package AdvancedJavaFeatures.InnerClasses;

public class AppRunner {

    

        public static void main(String[] args) {
            Library fiction = new Library("book", "fiction");

            Library.Book book = fiction.new Book();
            book.setDescription();
            System.out.println("Fiction Book Description = " +book.getDescription());


            Library nonFiction = new Library("book", "nonfiction");

            Library.Book book2 = nonFiction.new Book();
            book2.setDescription();
            System.out.println("Non-fiction Book Description = " +book2.getDescription());


        }
    

}
