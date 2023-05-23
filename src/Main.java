import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//check of hij het nog doet
public class Main{
    public static void main(String[] args) {
        introductieClass Anna = new introductieClass( "Anna", 28);
        introductieClass Tom = new introductieClass( "Tom", 38);
        introductieClass Rob = new introductieClass( "Rob", 26);

        Car myCar = new Car();
        myCar.drive();
        myCar.brake();
        myCar.typeOfFuel = "benzine";
        myCar.drive();

        schoolklas mbo = new schoolklas();
        mbo.klas();
        mbo.level = "HBO";
        mbo.klas();

        Disney frozen = new Disney("Frozen", "morgen");
        frozen.kijken();
        Disney bambi = new Disney("Bambi", "donderdag");
        Disney tangled = new Disney("Tangled", "wanneer");
        bambi.kijken();
        tangled.kijken();
        Disney biggen = new Disney("3 biggetjes", "woensdag");


        Test poging1 = new Test();
        poging1.pogingen();
        Test poging2 = new Test();
        poging2.pogingen();
    }
}

