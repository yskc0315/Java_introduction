public class Main {
  public static void main(String[] args) {
    Book b = new Book("普通の本", 9000, "赤", "978-3-16-148410-0");
    Computer c = new Computer("普通のコンピューター", 40, "青", "東芝");

    System.out.println(b.getName());
    System.out.println(b.getIsbn());
  }
}