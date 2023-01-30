public class App {
    public static void main(String[] args) {

        Character knight = new Character(10,5,0,"Chen");

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyIntelligence();
        knight.sayMyAgility();

        Character mage = new Character(0,5,10,"Akasha");

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyIntelligence();
        mage.sayMyAgility();

        Character thief = new Character(5,10,0,"Gondar");

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyIntelligence();
        thief.sayMyAgility();

       Character archer = new Character(5,5,5,"Primo"); 
       archer.strength = 5;
       archer.agility = 5;
       archer.intelligence = 5;
       archer.name = "Primo";
       archer.sayMyName();
       archer.sayMyStrength(); 
       archer.sayMyIntelligence();
       archer.sayMyAgility();

       Character warrior = new Character(5,5,5,"Tatin");
       warrior. strength = 5;
       warrior.agility = 5;
       warrior.intelligence = 5;
       warrior.name = "Tatin";
       warrior.sayMyName();
       warrior.sayMyStrength();
       warrior.sayMyIntelligence();
       warrior.sayMyAgility();

    }
}
