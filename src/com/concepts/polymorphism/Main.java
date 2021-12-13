package com.concepts.polymorphism;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lot of people";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alien Invasion";
    }
}

public class Main {

    public static void main(String[] args){
        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie # "+ i + " : "+ movie.getName()+ "\n"+
                    "Plot: "+ movie.plot());
        }
    }

    public static Movie randomMovie (){
        int randomNumber = (int) (Math.random() * 3)+ 1;
        System.out.println("Random number is " + randomNumber);
        switch (randomNumber){
            case 1: return new Jaws();
            case 2: return new IndependenceDay();
            case 3: return new Forgettable();
        }
        return null;
    }
}


