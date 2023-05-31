package Game;

import Entities.*;
import Itens.HeroType;
import Itens.Weapon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * logic associated with the different battles that can be repeated according to the different game rooms selected by the user
 */
public class Room {
    Scanner input = new Scanner(System.in);

    /**
     *
     * @param h Hero built int the Game class in the new_hero() method
     * @param enemy Enemy of the room instantiated and initialized in the Game class in the maze method
     * @param bargainer Seller of the room instantiated and initialized in the Game class in the maze method
     * @param levelRoom the level of difficult of the current room
     * @return Winning entity: the current hero or the room enemy
     */
    public Entity room(Hero h, NPC enemy, Bargainer bargainer, int levelRoom){

        /**
         * instantiate the NPC of the Room and assign to him the param enemy
         */
        Entities.Entity enemyRoom = enemy, currentHero = h;

        /**
         * instantiate a peacefull Knight to be returned in case the player doesn't fight the enemy of the room
         */
        Knight peaceHero = new Knight("peace", 0, 0, 0, 0);

        /**
         * instantiate an object of type Array List of Hero Types and add all the available Types so the default Itens of Hero (weapon and potion) can be assign to any Hero that enter the room
         */
        ArrayList<HeroType> heroisTipo = new ArrayList<>();
        heroisTipo.add(HeroType.ARCHER);
        heroisTipo.add(HeroType.WIZARD);
        heroisTipo.add(HeroType.KNIGHT);
        int damageFloorWeapon = 0;

        String res = "";
        System.out.println("\n");
        System.out.println("##### Welcome to the room number "+levelRoom+" #####");
        do {
            /**
             * At the beggining of each Room ask the player if he wants to buy something to the Bargainer of the Room
             */
            System.out.println("Do you wanna check the Bargainers itens?\n" +
                    "y - yes \n" +
                    "n - no");
            res = input.next();
            if (res.equalsIgnoreCase("y")){
                bargainer.vender(h);
            }
        }while (!res.equalsIgnoreCase("n"));
        /**
         * Show the enemy of the room and ask the player if he wants to initialize the batlle
         */
        enemy.mostrarDetalhes();
        if (levelRoom==1){
            System.out.println("Out of nowhere an enemy appears to attack your hero");
            System.out.println("The Shadow Keeper is a hooded creature with glowing eyes and a dark cloak that extends to the ground. Its form is indistinct, seeming to merge with the shadows themselves. The air around him seems to get colder and more oppressive as he gets closer to your hero.");
        } else if (levelRoom==2) {
            System.out.println("After crossing the first room of the dungeon, your hero meet in a large hall, darkened by the shadows that dance on the walls. The echo of slow, heavy footsteps resonates through the room, announcing the arrival of the first enemy.");
        } else if (levelRoom==3) {
            System.out.println("The air is moist and laden with a smell of wet earth. A light breeze blows through the stalagmites and stalactites, creating a mysterious atmosphere. As your hero explores the hall, he is surprised by a powerful roar that echoes through the walls...");
        }else if (levelRoom==4) {
            System.out.println("The soft sound of a nearby stream echoes through the air. However, the peace is interrupted when a terrifying roar cuts through the silence, drawing the hero'S attention to a steep hill ahead.");
        } else if (levelRoom==5) {
            System.out.println("Descending the hill with thunderous strides, an enemy appears. His rough, stony skin causes him to blend in with the rocks around him. His eyes sparkle with a savage fury, and his mighty war hammer seems capable of crushing anything in its path.");
        } else if (levelRoom==6) {
            System.out.println("As the hero entered the dark and ominous forest, a feeling of unease washed over them. The trees twisted and turned, making it hard to see where they were going. Suddenly, a loud roar echoed through the forest, causing the hero to jump with fear.");
        } else if (levelRoom==7) {
            System.out.println("Your hero find himself in a dense forest again, facing off against a group of enemies who appear to be guarding something.");
        } else if (levelRoom==8) {
            System.out.println("Your hero continued on through the dark and dreary dungeon. As he made his way deeper into the dungeon, the hero could feel their heart pounding in their chest, knowing that there would be more battles to come.");
        } else if (levelRoom==9) {
            System.out.println("Suddenly, the ground shook as a horde of giant spiders emerged from the shadows. Towering over him, their eyes gleamed with hunger as they encircled him. With quick reflexes, our hero darted between their legs, slicing and dodging as he pushed his way through their ranks.");
        } else if (levelRoom==10) {
            System.out.println("As the hero approached the temple, he was met by a group of cultists who worshipped the Minotaur as a god. They demanded that the hero leave and never return, but the hero refused to be deterred. He charged forward, prepared to face the cultists and the Minotaur itself.");
        } else if (levelRoom==11) {
            System.out.println("As the hero reaches the last battle, the sky turns dark and the ground beneath them shakes violently. Suddenly, a massive dragon with shadowy scales emerges from the ground and lets out an ear-splitting roar. They come from the dead!.\n");
        }else if(levelRoom==12){
            System.out.println("As the hero approached the entrance to the final chamber, he could sense the ominous presence of the Djinns. He had been fighting against these powerful entities for weeks now, slowly whittling down their numbers and weakening their hold on the land. This was to be the last battle before he faced the ultimate challenge of the third and final boss.");
        } else if (levelRoom==13 && h.getNivel()<=9) {
            return peaceHero;
        }else if (levelRoom==13){
            System.out.println("Here is the final boss of the game. The hero leaps into action, dodging the dragon's fierce attacks and striking back with all their might. Your hero must use all the skills and abilities he have gathered throughout the game to weaken the Shadow Dragonkin.\n");
        }
        System.out.println("\n### Prepare to fight ###");
        System.out.println("Are you ready to fight?\n" +
                "y - yes\nn - Run away");
        res = input.next();
        /**
         * instantiate a variable to save the return Entity of the battle (the winner)
         */
        Entities.Entity e1 = currentHero;
        if (res.equalsIgnoreCase("y")) {
            e1 = h.atacar(enemy);
        }else if(res.equalsIgnoreCase("n") && levelRoom>11){
            return peaceHero;
        }else {
            return currentHero;
        }

        if (e1.getNome().equalsIgnoreCase(h.getNome())){
            System.out.println("You hero defeat the "+enemy.getNome()+"!");
            if (levelRoom==1){
                System.out.println("After an intense and fierce battle, the "+enemy.getNome()+" of the Shadows is finally defeated. It dissolves into dark shadows, dissipating into thin air. The hall is again silent and illuminated only by the dim light that penetrates through the cracks in the walls.");
            } else if (levelRoom==2) {
                System.out.println("The "+enemy.getNome()+" dissipates into dark ashes, its evil energy fading into thin air. The room is once again filled with the light of the torches, and a solemn silence hangs over the room.");
            } else if (levelRoom==3) {
                /**
                 * At the end of each Tresaure Room show a Hero Iten that the player can swap with their current weapont
                 */
                damageFloorWeapon = 20*levelRoom;
                Weapon floorWeapon = new Weapon("floorWeapon", 0, heroisTipo, damageFloorWeapon);
                floorWeapon.mostrarDetalhes();
                System.out.println("A weapon is on the floor. Do you wanna pick it up and drop your "+h.getArma().getNome()+"?\n"+
                        "y - yes \n" +
                        "n - no\n");
                res = input.next();
                if (res.equals("y")){
                    h.setArma(floorWeapon);
                    System.out.println("\n");
                    h.mostrarDetalhes();
                    return currentHero;
                }
                System.out.println("Wounded and weakened, the "+enemy.getNome()+" tries to regain his posture, but it is in vain. The hero takes advantage and delivers final blows, defeating the fearsome creature. The dragon bows, disappearing into a dark mist.");
            } else if(levelRoom==4) {
                System.out.println("After an uphill fight, your hero finally weakens the "+enemy.getNome()+". The monster falls to its knees, exhausted and defeated. His body dissolves into a cloud of dust, and a reverent silence fills the air.");
            } else if (levelRoom==5) {
                System.out.println("Despite the enormous strengthcof the "+enemy.getNome()+", your Hero used his skills to finish the enemy with a swift strike of his sword.");
            } else if (levelRoom==6) {
                System.out.println(h.getNome()+" used his skills to slow them down the "+enemy.getNome()+" until he's nothing but rubble.");
            } else if (levelRoom==7) {
                System.out.println(h.getNome()+ "proved to be the key to victory by taking down the "+enemy.getNome()+" with his accurate hit with his sword.");
            } else if (levelRoom==8) {
                /**
                 * At the end of each Tresaure Room show a Hero Iten that the player can swap with their current weapont
                 */
                damageFloorWeapon = 20*levelRoom;
                Weapon floorWeapon = new Weapon("floorWeapon", 0, heroisTipo, damageFloorWeapon);
                floorWeapon.mostrarDetalhes();
                System.out.println("A weapon is on the floor. Do you wanna pick it up and drop your "+h.getArma().getNome()+"?\n"+
                        "y - yes \n" +
                        "n - no\n");
                res = input.next();
                if (res.equals("y")){
                    h.setArma(floorWeapon);
                    System.out.println("\n");
                    h.mostrarDetalhes();
                    return currentHero;
                }
                System.out.println("Your hero relied on his stealth skills to avoid the shades and using his weapon he dispel the spectral creatures.");
            } else if (levelRoom==9) {
                System.out.println(h.getNome()+" battled the hulking "+enemy.getNome()+", while studied the maze and worked out a way to get to the other side without getting lost. In the end, he emerged victorious, having outsmarted the "+enemy.getNome());
            } else if (levelRoom==10) {
                System.out.println(enemy.getNome()+" launched a devastating assault on your Hero, breathing fire and clawing at him with razor-sharp talons. With his weapon "+h.getNome()+" found the enemy weak spots, taking him down!");
            } else if (levelRoom==11) {
                System.out.println("Your Hero entered a sandstorm and faced off against a powerful "+enemy.getNome()+" hellbent on taking the Forbidden Treasure. The enemy granted wishes to the hero, but each wish came with a terrible price, and so he realized that he must rely on his own abilities to defeat the wish-granting entity. Using his skills to battle the enemy your Hero delivered the final blow using his weapon.");
            }else {
                System.out.println(enemy.getNome()+" summoned powerful demons to do their bidding and protect the Forbidden Treasure. Your hero have overcome the demons and reach the Warlocks. The battle was fierce, but ultimately "+h.getNome()+" emerged as the winner using his cunning to outsmart the enemies and retrieve the Forbidden Treasure.");
            }

            /**
             * At the end of each Room as the player if he wants to use a Potion to recover his Hero health
             */
            System.out.println("\nCheck your bag to heal some of your hero health \nDo you wanna use a potion?\ny - yes\nn - no");
            res = input.next();
            if (res.equalsIgnoreCase("y")){
                if (h.getPocoes().size()>1){
                    h.usarPocao();
                }else {
                    System.out.println("Your hero doesn't have any potion with him");
                    System.out.println("Do you wanna check the Bargainer itens list?\n" +
                            "y - yes \n" +
                            "n - no\n");
                    res = input.next();
                    if (res.equalsIgnoreCase("y")){
                        bargainer.vender(h);
                    }
                }
            }

            /**
             * Return the Hero if he won the battle
             */
            return currentHero;
        }else {
            /**
             * Return the enemy of the Room if the Hero had lost the battle
             */
            return enemyRoom;
        }
    }

}
