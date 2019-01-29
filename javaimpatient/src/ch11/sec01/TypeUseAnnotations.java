package ch11.sec01;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

@Target(ElementType.TYPE_USE)
@interface NonNull {
}

@Target(ElementType.TYPE_USE)
@interface Localized {
}

public abstract class TypeUseAnnotations {
  public static String text = "";
  public static String moreText = "";
  public static String evenMoreText = text instanceof @Localized String ? text : null;
  List<@NonNull String> entries;
  Comparator<?> comp = Comparator.<@NonNull String>reverseOrder();
  @NonNull
  String[][] words;
  String @NonNull [][] moreWords;
  String[] @NonNull [] evenMoreWords;
  List<@Localized ? extends Message> warnings;
  List<? extends @Localized Message> greetings;
  Function<Message, String> fun = @Localized Message::getText;

  public String read() throws @Localized IOException {
    return null;
  }

  class Warning extends @Localized Message {
  }

  public class Message {
    public String getText() {
      return "";
    }
  }
}