package de.telran.data;

/*Create an Playable interface and the Guitar, Drum and Trumpet classes implementing it.
 Interface contains the play() method. In Guitar class has number of strings field, Drum - size, Trum - diameter.
 Create an array, containing instruments of different types. In the loop, call the play() method for each instrument,
 which should output the line "Plays this instrument with these characteristics"
 */


public class Trumpet implements Playable {
    private String name;
    private double tubingLength;

    public Trumpet(String name, double tubingLength) {
        this.name = name;
        this.tubingLength = tubingLength;
    }


    public String getName() {
        return name;
    }

    public double getTubingLength() {
        return tubingLength;
    }

    public void setDiameter(double tubingLength) {
        this.tubingLength = tubingLength;
    }

    @Override
    public void play() {
        System.out.println( "Plays " + this.name + " with these characteristics: tubingLength "
                + this.tubingLength + " m");

    }


}

