package generics.dogs;

import java.util.LinkedList;
import java.util.List;

public class ObjectPrinter<T> {
  private final List<T> items;

  public ObjectPrinter(List<T> items) {
    this.items = new LinkedList<>(items);  // Defensive copy
  }

  public void printAll() {
    for (T t : items) {
      System.out.println(t.toString());
    }
  }

  public static void main(String[] args) {
    String[] strings = {"To", "be", "or", "not", "to", "be"};

    List<String> stringList = new LinkedList<>();
    for (String s : strings)
      stringList.add(s);

    ObjectPrinter<String> op = new ObjectPrinter<>(stringList);
    op.printAll();
  }
}
