public class LivingOrgranismTest {
    public static void main(String args[]){
        Ameoba ameoba=new Ameoba();
        ameoba.livingThing();
        ameoba.prokaryotes();
        ameoba.singleCell();

        Yeast yeast=new Yeast();
        yeast.livingThing();
        yeast.prokaryotes();
        yeast.singleCell();
    }
}
interface LivingOrganism{
    void livingThing();
}
abstract class Unicellular implements LivingOrganism{
    abstract void singleCell();
}
 abstract class Bacteria extends Unicellular {
    abstract void prokaryotes();
}
class Ameoba extends Bacteria{
    public void livingThing(){
        System.out.println("Ameoba Unicellular Orgranism..");
    }
    public void singleCell(){
        System.out.println("Unicellular Orgranism having single cell..");
    }
    public void prokaryotes(){
        System.out.println("Ameoba is prokaryotes");
    }
}
abstract class Fungus extends Unicellular{
    abstract void prokaryotes();
}
 class Yeast extends Fungus{
     public void livingThing(){
         System.out.println("Unicellular Orgranism..");
     }
     public void singleCell(){
         System.out.println("Unicellular Orgranism having single cell..");
     }
     public void prokaryotes(){
         System.out.println("Yeast is prokaryotes");
     }
}


abstract class Multicellular implements LivingOrganism {
    abstract void multiCell();
}
abstract class Plant extends Multicellular {
    abstract void Eukaryotes();
}
class BananaTree extends Plant {
    public void livingThing(){
        System.out.println("Plant is multicellular..");
    }
    public void multiCell(){
        System.out.println(" multicellular Orgranism having multiple cell..");
    }
    public void Eukaryotes(){
        System.out.println("plants is Eukaryotes");
    }
}
class MangoTree extends Plant {
    public void livingThing(){
        System.out.println("Plant is multicellular..");
    }
    public void multiCell(){
        System.out.println(" multicellular Orgranism having multiple cell..");
    }
    public void Eukaryotes(){
        System.out.println("Mangoplants is Eukaryotes");
    }
}
    abstract class Animal extends Multicellular {

    }
