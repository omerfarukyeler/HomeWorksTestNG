package utilities;

public class ReUsableMethods {

    public String findLocationOfElementsTableCell(int i){

        String xpath = "//table[" + 1 + "]/tbody/tr[" + i + "]/td[" + 4 + "]";
        return xpath;


    }




}
