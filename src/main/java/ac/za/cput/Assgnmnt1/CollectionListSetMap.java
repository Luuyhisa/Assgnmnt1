package ac.za.cput.Assgnmnt1;


import java.util.*;

//about my family
public class CollectionListSetMap {

    ArrayList<String> myFamilyNameAge = new ArrayList<String>();
    //my 1st HashMap Method
    public HashMap myMap(){
        HashMap<String,Integer> mySiblings = new HashMap();
        mySiblings.put("Lethu", 8);
        mySiblings.put("Masintle", 28);
        mySiblings.put("Thimna", 12);
        mySiblings.put("Lungisa", 22);
        return mySiblings;
    }
    //My 1st ListClass
    public TreeSet MySet(){
        String mySiblinges[] = {"Thimna", "Lungisa","Gugu","Lungisa","Masintle","Lungisa"};
        Set<String> set = new HashSet<String>();
        set.add(mySiblinges[0]);
        set.add(mySiblinges[1]);
        set.add(mySiblinges[2]);
        set.add(mySiblinges[3]);
        set.add(mySiblinges[4]);
        set.add(mySiblinges[5]);

        TreeSet sortedSet = new TreeSet<String>(set);
        System.out.println(sortedSet);
        return sortedSet;
    }

    public ArrayList myList(){
       // ArrayList<String> myFamilyNameAge = new ArrayList<String>();
        myFamilyNameAge.add("25 Lungisa");
        myFamilyNameAge.add("28 Masintle");
        myFamilyNameAge.add("31 Masxole");
        myFamilyNameAge.add("2 Thimna");
        myFamilyNameAge.add("0.1 Lethu");
        myFamilyNameAge.add("39 Zola");
        myFamilyNameAge.add("41 Ma'am");
        myFamilyNameAge.add("44 Father");
        //Collections.sort(myFamilyNameAge);  // Sort myFamilyNameAge

        System.out.println(myFamilyNameAge);

        for (String i : myFamilyNameAge) {
            // System.out.println(i);
        }
        return myFamilyNameAge;
    }
    ///ArrayList<String> myFamilyNameAge = new ArrayList<String>();

    public ArrayList myCollection(){
        myFamilyNameAge.add("25 M.Lungisa");
        myFamilyNameAge.add("28 M.Masintle");
        myFamilyNameAge.add("31 M.Masxole");
        myFamilyNameAge.add("2 M.Thimna");
        myFamilyNameAge.add("0.1 M.Lethu");
        myFamilyNameAge.add("39 M.Zola");
        myFamilyNameAge.add("41 M.Ma'am");
        myFamilyNameAge.add("44 M.Father");
        Collections.sort(myFamilyNameAge);
        System.out.println("myFamilyNameAge");
        return myFamilyNameAge;
    }

}

