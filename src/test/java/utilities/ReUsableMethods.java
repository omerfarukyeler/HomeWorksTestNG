package utilities;

public class ReUsableMethods {

    public String findLocationOfElementsTableCell(int table,int row,int data){

        String xpath = "//table[" + table + "]/tbody/tr[" + row + "]/td[" + data + "]";
        return xpath;


    }




}
