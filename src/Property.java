/*
vraag 1c adress zou ik protected en misschien zelfs private maknen zodat niet iedereen hem ziet.
// getter had je moeten hebben. en dan onder de interface eerst de variabelen zoals je wilde doen en daarna de getters doen. blijkbaar mag dat.

 */
public abstract interface Property {
//    attributen o te maken: o.a. price.
 void price();
 void address();
 void numberOfRooms();
 void livingArea();
 void totalArea();
}
