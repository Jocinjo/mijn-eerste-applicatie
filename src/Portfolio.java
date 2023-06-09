import com.sun.source.tree.Tree;

import java.util.*;


public class Portfolio {
    private Set<Property> offers = new HashSet<Property>();
    private int value;
    public Set<Property> getOffers() {
        return offers;
    }
    public int getValue() {
        return value;
    }
//    public Map<Integer, Set<Property>> groupInRooms() {
//        //to be inplemented
//        // ik zou deze eigenlijk willen omcasten naar een treemap zodat ik ze kan llaten printen
////        (TreeMap)Property;
////        toTreeMap(Property);
//        this.offers = offers;
//        Scanner input = new Scanner(System.in);
//        int element;
//        System.out.println("How many rooms are you looking into? ");
//        int searchAmountOfRooms = input.nextInt();
////        System.out.println(offers.get(searchAmountOfRooms);
//        for (element : offers) {
//            if (offers.contains(searchAmountOfRooms)) {
//                System.out.println("found the a property");
//            } else {
//                System.out.println("this is not possible");
//            }
//        }
//        return null;
//    }
}

