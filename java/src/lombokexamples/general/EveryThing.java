package lombokexamples.general;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Log
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"number", "text"})
@ToString(exclude = "strList")
public class EveryThing {
  private final int number;
  private final String text;
  private boolean flag;
  private List<String> strList;

  public List<String> getStrList() {
    if (strList == null) {
      strList = new ArrayList<>(128);
    }
    return Collections.unmodifiableList(strList);
  }
}