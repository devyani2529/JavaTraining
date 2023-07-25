public class InstrumentTest{
    public static void main(String[] args) {

	    Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();

		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();

        Flute flute= new Flute();
        flute.use();
        flute.play();
        flute.blowAir();

        Harmonium harmonium = new Harmonium();
        harmonium.use();
        harmonium.play();
        harmonium.blowAir();



//The method pluck() is undefined for the
        //type StringBasedMusicalInstrument

    }
}

interface Instrument
{
    void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
    abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
    abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
    public void use() {
        System.out.println("Using Guitar...");
    }
    void play() {
        System.out.println("Playing Guitar...");

    }
    void tuneStrings() {
        System.out.println("Tuning Strings of Guitar...");

    }
    void pluck() {
        System.out.println("Plucking Strings of Guitar...");
        System.out.println("__________");
    }

}


class Violin extends StringBasedMusicalInstrument
{
    public void use() {
        System.out.println("Using Violin...");
    }
    void play() {
        System.out.println("Playing Violin...");

    }
    void tuneStrings() {
        System.out.println("Tuning Strings of Violin...");

    }
    void bow() {
        System.out.println("Bowing Strings of Violin...");
        System.out.println("__________");
    }
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument {
    abstract void blowAir();
}

class Flute extends AirBasedMusicalInstrument {
    public void use() {
        System.out.println("Using Flute...");
    }

    public void play() {
        System.out.println("Playing Flute...");

    }

    public void blowAir() {
        System.out.println("Blowing air into the Flute...");
        System.out.println("__________");
    }

}
class Harmonium extends AirBasedMusicalInstrument {
    public void use() {
        System.out.println("Using Harmonium...");
    }

    public void play() {
        System.out.println("Playing Harmonium...");

    }

    public void blowAir() {
        System.out.println("Blowing air into the Harmonium...");
        System.out.println("__________");
    }
}

