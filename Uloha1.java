package sk.euba.tajj.zadanie2;

import java.util.Scanner;

final class Staticka{
    static void vypis(){
        System.out.println("Hello static");
    }
}
class Instancna{
    public void vypis(){
        System.out.println("Hello instance");
    }
}
public class Uloha1 {
    public static void main(String[] args) {
        String option;

        if (args.length > 0){
            if (args[1].equals("static")){
                Staticka.vypis();
            }else if(args[1].equals("instant")){
                Instancna instant = new Instancna();
                instant.vypis();
            }

        }else{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ktora - static/instant? ");
            option = keyboard.nextLine();


            if (option.equals("static")){
                Staticka.vypis();
            }else if(option.equals("instant")){
                Instancna instant = new Instancna();
                instant.vypis();
            }
        }
    }
}