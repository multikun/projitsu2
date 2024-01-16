package practice;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("hello, world.");
    System.out.println("hello, world.");
    System.out.println("hello, world.");
IntStream.range(1,10).foreach(System.out::println);
  }
}
