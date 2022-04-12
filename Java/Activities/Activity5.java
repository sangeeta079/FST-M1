package Activities;


    abstract class Book{
       String title;
       //Abstract Method
        public abstract void setTitle(String s);

        //Concrete Method
        public String getTitle(){
            return title;
        }
    }

    class MyBook extends Book {
        public void setTitle(String s){
            title = s;
        }
    }
public class Activity5 {
        public static void main(String[] args){
            Book newNovel= new MyBook();
            String title = "Pather Dabi";
            newNovel.setTitle(title);

            System.out.println("The title is:"+ newNovel.getTitle());

        }
}
