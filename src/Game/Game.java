package Game;

import Entities.*;
import Itens.ItenHero;
import Itens.Weapon;
import Itens.Potion;
import Itens.HeroType;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public final String op1 = "a", op2 ="b";
    /**
     *
     * @return instantiation and initialization of the various game objects and logic associated with their distribution across the different game rooms
     */
    public boolean labirinto() {

        Scanner input = new Scanner(System.in);

        /**
         * instantiate a Hero object
         */
        Hero currentHero = null;

        /**
         * instantiate a variable of type Boolean to return at the end of the maze method and initialize the variable as false
         */
        boolean isAlive = false;

        /**
         * instantiate multiple objects of type Array List of HeroType and initialize the objects
         */
        ArrayList<HeroType> heroisTipo1 = new ArrayList<>();
        heroisTipo1.add(HeroType.ARCHER);
        heroisTipo1.add(HeroType.WIZARD);
        ArrayList<HeroType> heroisTipo2 = new ArrayList<>();
        heroisTipo2.add(HeroType.WIZARD);
        heroisTipo2.add(HeroType.KNIGHT);
        ArrayList<HeroType> heroisTipo3 = new ArrayList<>();
        heroisTipo3.add(HeroType.KNIGHT);
        heroisTipo3.add(HeroType.ARCHER);
        ArrayList<HeroType> heroisTipo4 = new ArrayList<>();
        heroisTipo4.add(HeroType.ARCHER);

        /**
         * instantiate multiple objects of type Potion and initialize the objects
         */
        Potion p1 = new Potion("poção 1", 10, heroisTipo4, 25);
        Potion p2 = new Potion("poção 2", 15, heroisTipo2, 90);
        Potion p3 = new Potion("poção 3", 25, heroisTipo1, 80);
        Potion p4 = new Potion("poção 4", 10, heroisTipo3, 5);
        Potion p5 = new Potion("poção 5", 40, heroisTipo4, 45);
        Potion p6 = new Potion("poção 6", 35, heroisTipo2, 30);
        Potion p7 = new Potion("poção 7", 20, heroisTipo1, 15);
        Potion p8 = new Potion("poção 8", 45, heroisTipo2, 35);
        Potion p9 = new Potion("poção 9", 50, heroisTipo3, 40);

        /**
         * instantiate multiple objects of type Array List of Potion and initialize the variables
         */
        ArrayList<Potion> iventarioP1 = new ArrayList<>();
        iventarioP1.add(p1);
        iventarioP1.add(p7);
        iventarioP1.add(p5);
        ArrayList<Potion> iventarioP2 = new ArrayList<>();
        iventarioP2.add(p2);
        iventarioP2.add(p3);
        iventarioP2.add(p4);
        ArrayList<Potion> iventarioP3 = new ArrayList<>();
        iventarioP3.add(p9);
        iventarioP3.add(p8);
        ArrayList<Potion> iventarioP4 = new ArrayList<>();
        iventarioP4.add(p1);
        iventarioP4.add(p7);
        iventarioP4.add(p3);
        iventarioP4.add(p2);
        iventarioP4.add(p5);
        iventarioP4.add(p2);

        /**
         * instantiate multiple objects of Weapon and initialize the variables
         */
        Weapon weapon1 = new Weapon("arma1", 20, heroisTipo1, 40);
        Weapon weapon2 = new Weapon("arma2", 15, heroisTipo2, 35);
        Weapon weapon3 = new Weapon("arma3", 25, heroisTipo4, 40);
        Weapon weapon4 = new Weapon("arma4", 57, heroisTipo3, 55);
        Weapon weapon5 = new Weapon("arma5", 8, heroisTipo1, 5);
        Weapon weapon6 = new Weapon("arma6", 10, heroisTipo2, 10);
        Weapon weapon7 = new Weapon("arma7", 5, heroisTipo4, 1);
        Weapon weapon8 = new Weapon("arma8", 60, heroisTipo3, 60);

        /**
         * instantiate multiple objects of type Array Iten of Hero Types and add the weapon and potion objects
          */

        ArrayList<ItenHero> iten1 = new ArrayList<>();
        iten1.add(weapon1);
        iten1.add(weapon2);
        iten1.add(weapon4);
        iten1.add(weapon6);
        iten1.add(weapon7);
        iten1.add(p1);
        iten1.add(p2);
        iten1.add(p3);
        iten1.add(p4);
        iten1.add(p5);
        iten1.add(p6);
        iten1.add(p7);
        iten1.add(p8);

        ArrayList<ItenHero> iten2 = new ArrayList<>();
        iten2.add(weapon1);
        iten2.add(weapon2);
        iten2.add(p2);
        iten2.add(p3);
        iten2.add(p4);
        iten2.add(weapon3);
        iten2.add(weapon4);
        iten2.add(p5);
        iten2.add(p6);
        iten2.add(p7);
        iten2.add(p9);
        iten2.add(weapon5);
        iten2.add(weapon6);

        ArrayList<ItenHero> iten3 = new ArrayList<>();
        iten3.add(weapon2);
        iten3.add(weapon3);
        iten3.add(p4);
        iten3.add(p5);
        iten3.add(p6);
        iten3.add(weapon4);
        iten3.add(p7);
        iten3.add(weapon5);
        iten3.add(weapon6);
        iten3.add(p9);
        iten3.add(weapon7);
        iten3.add(weapon8);

        ArrayList<ItenHero> iten4 = new ArrayList<>();
        iten4.add(weapon1);
        iten4.add(weapon2);
        iten4.add(p2);
        iten4.add(p3);
        iten4.add(p4);
        iten4.add(p5);
        iten4.add(p6);
        iten4.add(p7);
        iten4.add(weapon4);
        iten4.add(weapon5);
        iten4.add(weapon6);
        iten4.add(p8);
        iten4.add(p9);
        iten4.add(p1);

        ArrayList<ItenHero> iten5 = new ArrayList<>();
        iten5.add(weapon1);
        iten5.add(weapon2);
        iten5.add(weapon3);
        iten5.add(weapon7);
        iten5.add(weapon8);
        iten5.add(p2);
        iten5.add(p3);
        iten5.add(p4);
        iten5.add(p5);
        iten5.add(p6);
        iten5.add(p8);
        iten5.add(p9);

        /**
         * instantiate multiple objects of type Bargainer and initialize the objects
         */
        Bargainer b1 = new Bargainer(iten2);
        Bargainer b2 = new Bargainer(iten1);
        Bargainer b3 = new Bargainer(iten3);
        Bargainer b4 = new Bargainer(iten4);
        Bargainer b5 = new Bargainer(iten5);

        /**
         * assign the return value of the method new_hero to the local variable currentHero
         */
        currentHero = new_hero();

        if (currentHero == null){
            /**
             * If the new_hero method returns a null value the maze method should return false
             */
            return isAlive;
        }else {
            /**
             * instantiate multiple objects of type NPC and initialize the objects
             */
            NPC enemy1 = new NPC("Guardian of the Shadows", (110), (30), weapon1, iventarioP3);
            NPC enemy2 = new NPC("Burning Shadow", (120), (35), weapon2, iventarioP2);
            NPC enemy3 = new NPC("Dragon of the Deep", (155), (40), weapon3, iventarioP1);
            NPC boss1 = new NPC("Boss Troll", (currentHero.getHp()-10),(currentHero.getForca()-10),weapon6,iventarioP4);
            NPC enemy4 = new NPC("Mountain Giant", (160), (30), weapon3, iventarioP1);
            NPC enemy5 = new NPC("Warlock Queen", (170), (35), weapon1, iventarioP3);
            NPC enemy6 = new NPC("Skeleton warriors", (140), (40), weapon1, iventarioP3);
            NPC enemy7 = new NPC("Golems", (170), (45), weapon2, iventarioP2);
            NPC boss2 = new NPC("Giant spiders", (currentHero.getHp()-15),(currentHero.getForca()-15),weapon7,iventarioP4);
            NPC enemy8 = new NPC("Harpies", (165), (40), weapon3, iventarioP1);
            NPC enemy9 = new NPC("Minotaur", (170), (50), weapon3, iventarioP2);
            NPC enemy10 = new NPC("Unknown sorcerer", (165),(45),weapon8,iventarioP4);
            NPC enemy11 = new NPC("Necromancer", (170),(50),weapon8,iventarioP3);
            NPC enemy12 = new NPC("Red Serpent", (180),(45),weapon8,iventarioP4);
            NPC enemy13 = new NPC("Djinns", (185),(50),weapon8,iventarioP4);
            NPC boss3 = new NPC("Shadow Dragonkin", (currentHero.getHp()-1),(currentHero.getForca()-1),weapon8,iventarioP4);
            Entities.Entity enemyRoom;
            int count = 0;
            String res = "";
            do {
                /**
                 * call the method Room with the params currentHero, an Enemy, a Bargainer and the level of the room
                 */
                int roomLevel = 1;
                Room room1 = new Room();
                ArrayList <String> sms= new ArrayList<>();
                sms.add("As the "+ currentHero.getNome() +" catch their breath, he is faced with two paths before him\n"+
                        "a) Go back and fight the Guardian of the Shadows.\n"+
                        "b) Engage in battle with the Burning Shadow and defeat him.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n"+
                        "a) Mysterious Door path\n" +
                        "b) Dark Corridor path - Treasure Room");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Go left.\n" +
                        "b) Engage in battle against the goblins and their Boss Troll to defeat them.");
                sms.add("Exhausted, the " + currentHero.getNome() + " took a moment to catch their breath and examine the spoils of their victory.\n" +
                        "As the "+currentHero.getNome()+" catch their breath, he is faced with two paths before him\n" +
                        "a) Sneak past the Mountain Giant and avoid battle fro now.\n" +
                        "b) Engage in battle with the Mountain Giant and defeat him");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him +\n" +
                        "a) Sneak past the Warlock Queen and avoid battle for now.\n" +
                        "b) Engage in battle with the Warlock Queen's.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Sneak past the Skelton Warriors and avoid battle for now.\n" +
                        "b) Engage in battle with the Skelton Warriors and defeat them.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Go left and confront a group of warriors.\n" +
                        "b) Go right and face off against a pack of Golems - Treasure Room.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Go back and confront the group of giant Golems.\n" +
                        "b) Go right and face off against the Giant spiders Boss.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Go back to the swamp that may help them defeat the sorcerer.\n" +
                        "b) Engage in a direct battle with the Harpies and try to overpower them.");
                sms.add("The " + currentHero.getNome() + " arrives at a temple that is being used by a group of cultists to summon a powerful Minotaur demon:\n" +
                        "a) Destroy the altar and disrupt the cultists' ritual.\n" +
                        "b) Engage in combat with the demon after it has been summoned.");
                sms.add("As the " + currentHero.getNome() + " catch their breath, he is faced with two paths before him\n" +
                        "a) Mysterious Door path\n" +
                        "b) Dark Corridor path - Treasure Room");
                sms.add(currentHero.getNome() +" encounters a massive creature that is terrorizing a small town.\n" +
                        "a) Search for information about the creature's weaknesses before engaging in battle.\n" +
                        "b) Engage in battle with the Djinns creatures directly and try to overpower them.");
                sms.add("In the aftermath of the battle, the people of the land begin to emerge from their hiding places, their faces filled with hope and wonder. The hero's victory has ended the tyranny of the magical beings that once ruled over them, and they are finally free to live their lives without fear.\n" +
                        "With the Shadow Dragonkin vanquished, " + currentHero.getNome() + " is hailed as a true hero and a savior to all the people of the land. As the credits roll, the hero sets out on a new journey, ready to do battle with whatever challenges may lie ahead.");

                do {
                    /**
                     * if the return Entity doesn't have the name of the Hero the Enemy had won the battle and the game is over
                     */
                    enemyRoom = room1.room(currentHero,enemy1,b1,roomLevel);

                    if (enemyRoom.getNome().equals("peace")){
                        System.out.println("Your Hero doesn't have the required level to enter in the lasts Room." +
                                "\n Do you wanna go back and fight with other enemies to get stronger?" +
                                "\ny - yes" +
                                "\nn - no");
                        res = input.next();
                        if (res.equalsIgnoreCase("y")){
                            roomLevel=1;
                            enemy1 = enemy1;
                            b1 = b1;
                            enemyRoom = room1.room(currentHero,enemy1,b1,roomLevel);
                        }else {
                            return isAlive;
                        }
                    }else if (!enemyRoom.getNome().equals(currentHero.getNome())){
                        return isAlive;
                    }else if (enemyRoom.equals(null)){
                        System.out.println("null");
                    }else {
                        /**
                         * if the name of the return Entity match the name of the Hero, the player had won the battle and a new Room will be inicialize with the same Hero (currentHro) but with a diferent enemy, bargainer and level of the room
                         */
                        if (roomLevel < 13) {
                            if (roomLevel == 1) {
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy1;
                                    b1 = b2;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy2;
                                    b1 = b2;
                                }
                            } else if (roomLevel == 2) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy2;
                                    b1 = b3;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy3;
                                    b1 = b3;
                                }
                            } else if (roomLevel == 3) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy3;
                                    b1 = b3;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = boss1;
                                    b1 = b3;
                                }
                            } else if (roomLevel == 4) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy5;
                                    b1 = b4;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy6;
                                    b1 = b5;
                                }
                            } else if (roomLevel == 5) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy6;
                                    b1 = b5;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy7;
                                    b1 = b4;
                                }
                            } else if (roomLevel == 6) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy7;
                                    b1 = b5;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy8;
                                    b1 = b4;
                                }
                            } else if (roomLevel == 7) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy8;
                                    b1 = b3;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy9;
                                    b1 = b3;
                                }
                            } else if (roomLevel == 8) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy8;
                                    b1 = b5;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = boss2;
                                    b1 = b5;
                                }
                            } else if (roomLevel == 9) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy10;
                                    b1 = b2;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy9;
                                    b1 = b2;
                                }
                            } else if (roomLevel == 10) {
                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy10;
                                    b1 = b1;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy11;
                                    b1 = b1;
                                }
                            } else if (roomLevel == 11) {

                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy11;
                                    b1 = b1;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = enemy12;
                                    b1 = b1;
                                }
                            } else if (roomLevel == 12) {

                                count++;
                                System.out.println(sms.get(count));
                                res = input.next();
                                if (res.equals(op1)) {
                                    roomLevel += 1;
                                    enemy1 = enemy12;
                                    b1 = b4;
                                } else if (res.equals(op2)) {
                                    roomLevel += 1;
                                    enemy1 = boss3;
                                    b1 = b5;
                                    }
                                }
                            }else if (roomLevel == 13) {
                                count++;
                                System.out.println(sms.get(count));
                                return true;
                            }
                        }
                    }while (enemyRoom.getNome().equals(currentHero.getNome()));

                }while (isAlive);

            return isAlive;
            }
        }

    /**
     *Method to build a new Hero for the current game
      * @return hero and game builder with user-chosen features
     */
    public Hero new_hero() {
        System.out.println("______________############################# The Search for Lost Legends     ||     RPG Java Game ############################# __________\n");
        System.out.println("Centuries ago, the kingdom of Iris was a prosperous and harmonious place, ruled by a wise and just king. However, ancient legends told the story of three powerful artifacts that would grant their possessor unimaginable power. These legends faded over time, becoming little more than children's tales.\n" +
                "But now, the legends have been resurrected. Rumors have surfaced that the lost artifacts are scattered in a mysterious dungeon filled with deadly dangers. And, as if the rumors weren't enough, the kingdom of Eldoria is threatened by a growing darkness that spreads across the country, bringing with it hordes of evil creatures.\n" +
                "To face these threats, three heroes from different backgrounds decide to join forces and embark on the search for the lost legends. Each hero has unique abilities and an individual purpose:\n" +
                "1. The Archer:\n" +
                "She is a skilled archer, known for her precise aim and unparalleled agility. His journey began when his village was attacked by the creatures of darkness. Determined to protect her people, she became the guardian of the ancestral bow, which grants extraordinary abilities.\n" +
                "2. The Knight:\n" +
                "The Knight is a loyal and courageous warrior, known for his strength and unwavering devotion to justice. He sets out in search of the lost legends to strengthen his kingdom against the darkness that threatens to engulf him. Wielding his legendary sword, he will face any enemy that stands in his way.\n" +
                "3. The Sorceress:\n" +
                "The Sorceress is a powerful user of magic, whose powers have been passed down through generations. Determined to unravel the mysteries of the past, she searches for the lost artifacts to prevent them from falling into the wrong hands. With her arcane knowledge, she is able to conjure devastating spells to defeat her enemies.\n" +
                "\n" +
                "As the heroes enter the dungeon, they come across a maze of twelve rooms, each protected by challenging enemies. Each room offers the player crucial choices that will shape the fate of the heroes and the kingdom of Eldoria. These choices range from directly challenging enemies in combat, searching for hidden clues and secrets, or even deciding between alternate paths that can lead to rewards or traps.\n" +
                "As they progress, the heroes discover that not only the creatures of darkness are after the artifacts, but also a mysterious villain who seeks to use them to awaken an ancestral force and dominate the kingdom of Eldoria.\n" +
                "The heroes' journey is full of challenges and twists");
        Scanner input = new Scanner(System.in);
        String op = "", nomeHeroi = "", diff ="", heroi="";
        int pontosC = 300, coins = 20, life = 0, strenght = 0;
        boolean isAlive = false;

        System.out.print("\nPress any key to Start the Game\n0 - QUIT");
        op = input.next();


        Hero entidade = null;
        if (!op.equals("0")) {
            do {
                /**
                 * Hero Type menu
                 */
                System.out.println("A - Knight \n" +
                        "B - Wizard\n" +
                        "C - Archer \n" +
                        "q - QUIT\n"+
                        "Pick a Hero type: ");
                heroi = input.next();

            } while (!heroi.equalsIgnoreCase("A") && !heroi.equalsIgnoreCase("B") && !heroi.equalsIgnoreCase("C") && !heroi.equalsIgnoreCase("Q") );
            if (heroi.equalsIgnoreCase("q")){
                return null;
            }
            do {
                /**
                 * Game Difficult menu
                 */
                System.out.println("Difficulty: \n" +
                        "A - EASY\n"+
                        "B - HARD\n"+
                        "q - QUIT\n"+
                        "Choose the difficulty: ");
                diff = input.next();
            }  while (!diff.equalsIgnoreCase("A") && !diff.equalsIgnoreCase("B") && !diff.equalsIgnoreCase("Q") );
            if (diff.equalsIgnoreCase("0")){
                return null;
            }

            do {
                /**
                 * Logic associated with the distribution of the creator points of the Hero (life + strenght)
                 */
                if (diff.equalsIgnoreCase("A")) {
                    System.out.println("Distribute the " + pontosC + " creating points to your Hero.\n" +
                            "Life: " + life + " [1 point per HP]\n");
                    life = input.nextInt();
                    pontosC -= life;

                    if (pontosC > 0) {
                        System.out.println("Distribute the " + pontosC + " creating points to your Hero.\n" +
                                "Strenght: " + strenght + " [5 points per STRENGHT]\n");
                        strenght = 5 * input.nextInt();
                        pontosC -= strenght;

                        if (pontosC == 0) {
                            break;
                        } else if (pontosC < 0) {
                            pontosC = 300;
                            life = 0;
                            strenght = 0;
                            System.out.println("Incorrect distribution. Please distribute your " + pontosC + " character's creation points correctly!");
                        }
                    } else if (pontosC == 0) {
                        break;
                    } else {
                        pontosC = 300;
                        life = 0;
                        strenght = 0;
                        System.out.println("Incorrect distribution. Please distribute your " + pontosC + " character's creation points correctly!");
                    }
                } else {
                    pontosC = 200;
                    System.out.println("Distribute the " + pontosC + " creating points to your Hero.\n" +
                            "Life: " + life + " [1 point per HP]\n");
                    life = input.nextInt();
                    pontosC -= life;

                    if (pontosC > 0) {
                        System.out.println("Distribute the " + pontosC + " creating points to your Hero.\n" +
                                "Strenght: " + strenght + " [5 points per STRENGHT]\n");
                        strenght = 5 * input.nextInt();
                        pontosC -= strenght;

                        if (pontosC == 0) {
                            break;
                        } else if (pontosC < 0) {
                            pontosC = 200;
                            life = 0;
                            strenght = 0;
                            System.out.println("Incorrect distribution. Please distribute your " + pontosC + " character's creation points correctly!");
                        }

                    } else if (pontosC == 0) {
                        break;
                    } else {
                        pontosC = 200;
                        life = 0;
                        strenght = 0;
                        System.out.println("Incorrect distribution. Please distribute your " + pontosC + " character's creation points correctly!");
                    }
                }
            } while (pontosC != 0);
            /**
             * Ask the user for a Hero's name
             */
            System.out.println("Give a name to your Hero: ");
            nomeHeroi = input.next();

            /**
             * Given a Hero type, instantiate a Hero object and initialize the object with the params given by the player
             */
            if (heroi.equalsIgnoreCase("A") && diff.equalsIgnoreCase("A")) {
                Hero k1 = createHero.create_Hero(HeroType.KNIGHT);
                k1 = new Knight(nomeHeroi, life, strenght, 1, coins);
                k1.mostrarDetalhes();
                entidade = k1;
            } else if (heroi.equalsIgnoreCase("A") && diff.equalsIgnoreCase("B")) {
                Hero k1 = createHero.create_Hero(HeroType.KNIGHT);
                coins = 15;
                k1 = new Knight(nomeHeroi, life, strenght, 1, coins);
                k1.mostrarDetalhes();
                entidade = k1;
            } else if (heroi.equalsIgnoreCase("B") && diff.equalsIgnoreCase("A")) {
                Hero w1 = createHero.create_Hero(HeroType.WIZARD);
                w1 = new Wizard(nomeHeroi, life, strenght, 1, coins);
                w1.mostrarDetalhes();
                entidade = w1;
            } else if (heroi.equalsIgnoreCase("B") && diff.equalsIgnoreCase("B")) {
                Hero w1 = createHero.create_Hero(HeroType.WIZARD);
                coins = 15;
                w1 = new Wizard(nomeHeroi, life, strenght, 1, coins);
                w1.mostrarDetalhes();
                entidade = w1;
            } else if (heroi.equalsIgnoreCase("C") && diff.equalsIgnoreCase("A")) {
                Hero a1 = createHero.create_Hero(HeroType.ARCHER);
                a1 = new Archer(nomeHeroi, life, strenght, 1, coins);
                a1.mostrarDetalhes();
                entidade = a1;
            } else {
                Hero a1 = createHero.create_Hero(HeroType.ARCHER);
                coins = 15;
                a1 = new Archer(nomeHeroi, life, strenght, 1, coins);
                a1.mostrarDetalhes();
                entidade = a1;
            }
        }
        return entidade;
    }
}