package Entities;

import Itens.HeroType;

public class createHero {
    /**
     *
     * @param type given a type of hero present int the Hero Type class
     * @return of an instance of a hero object: knight, archer or wizard
     */
        public static Hero create_Hero(HeroType type){
            switch (type){
                case ARCHER:
                    return new Archer();
                case KNIGHT:
                    return new Knight();
                case WIZARD:
                    return new Wizard();
                default:
                    throw new IllegalArgumentException("Unknown type of Hero: "+type);
            }
        }
    }

