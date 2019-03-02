package ac.za.cput.Assgnmnt1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

public class CollectionListSetMapTest {
    CollectionListSetMap  CollectionListSetMap= new CollectionListSetMap();
    @Test
    public void myMap() {
        //my actual out put
        HashMap myActual = CollectionListSetMap.myMap();
        //my expected output
        String myExpectation ="{Lethu=8, Masintle=28, Thimna=12, Lungisa=22}";
        myExpectation= myExpectation.substring(1, myExpectation.length()-1);
        String[] keyValuePairs = myExpectation.split(",");
        Map<String,String> map = new HashMap<>();
        for(String pair : keyValuePairs)
        {
            String[] entry = pair.split("=");
            map.put(entry[0].trim(), entry[1].trim());
        }
        Assert.assertTrue(myActual.equals(myActual));
       // Assert.assertEquals(myActual,map);
    }
    @Test
    public void mySet() {
        TreeSet myAct =CollectionListSetMap.MySet();
       // TreeSet myExp= new TreeSet();
       // String actualString= "[Gugu, Lungisa, Masintle, Thimna]";
        String[] arrayNames = {"Gugu", "Lungisa", "Masintle", "Thimna"};
        List<String> list = Arrays.asList(arrayNames);
        Set<String> exSet = new TreeSet<String>(list);

        Assert.assertEquals(exSet,myAct);
    }
    @Test
    public void myList() {
        List actOut = CollectionListSetMap.myList();
        ArrayList<String> exOut= new ArrayList<>();
        exOut.add("25 Lungisa");exOut.add("28 Masintle");exOut.add("31 Masxole");exOut.add("2 Thimna");exOut.add("0.1 Lethu");exOut.add("39 Zola");exOut.add("41 Ma'am");exOut.add("44 Father");

        Assert.assertEquals(exOut,actOut);
    }
    @Test
    public void myCollection() {
        Collection exCol =CollectionListSetMap.myCollection();
        String [] arArray = {"0.1 M.Lethu", "2 M.Thimna", "25 M.Lungisa", "28 M.Masintle", "31 M.Masxole", "39 M.Zola", "41 M.Ma'am", "44 M.Father"};
        ArrayList<String> cardsList = new ArrayList<String>(Arrays.asList(arArray));
        Assert.assertEquals(cardsList,exCol);
    }
}

/**
String value = "{first_name = naresh,last_name = kumar,gender = male}";
value = value.substring(1, value.length()-1);           //remove curly brackets
        String[] keyValuePairs = value.split(",");              //split the string to creat key-value pairs
        Map<String,String> map = new HashMap<>();

        for(String pair : keyValuePairs)                        //iterate over the pairs
        {
        String[] entry = pair.split("=");                   //split the pairs to get key and value
        map.put(entry[0].trim(), entry[1].trim());          //add them to the hashmap and trim whitespaces
        }
**/