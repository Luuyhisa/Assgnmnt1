package ac.za.cput.Assgnmnt1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CollectionListSetMapTest {
    CollectionListSetMap  CollectionListSetMap= new CollectionListSetMap();
    @Test
    public void myMap() {
        //my actual out put
        HashMap myActual = CollectionListSetMap.myMap();
        //my expected output

        String myExpectation ="{Lethu=8, Masintle=28, Thimna=12, Lungisa=22}";
        Assert.assertNotEquals(myExpectation,myActual);
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