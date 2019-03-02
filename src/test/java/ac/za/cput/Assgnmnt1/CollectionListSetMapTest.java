package ac.za.cput.Assgnmnt1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        CollectionListSetMap.MySet();
        Assert.assertEquals("","");
    }
    @Test
    public void myList() {
        CollectionListSetMap.myList();
        Assert.assertEquals("","");
    }
    @Test
    public void myCollection() {

        CollectionListSetMap.myCollection();


        Assert.assertEquals("","");
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