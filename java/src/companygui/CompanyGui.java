package companygui;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;

public class CompanyGui {

  public static void main(String[] args) throws Exception {
    File thisDir = new File(System.getProperty("user.dir"));
    JFileChooser chooser = new JFileChooser(thisDir);
    int returnVal = chooser.showOpenDialog(null);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = chooser.getSelectedFile();
      Company company = new Company(file);
      DefaultListModel lm = new DefaultListModel();
      for (Employee e : company.getEmployees()) {
        lm.addElement(e);
      }
      CompanyFrame cf = new CompanyFrame(lm);
      cf.pack();
      cf.setVisible(true);
    }

  }
}
