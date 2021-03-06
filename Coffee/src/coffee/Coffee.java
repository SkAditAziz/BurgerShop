/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.util.Scanner;

/**
 *
 * @author AZ
 */

interface CoffeeMaker {

    void milk();

    void caffein();

    void sugar();

}
class CoffeeA implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sugar...Added");
    }

}

class CoffeeB implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("No Sugar added!!");
    }

}

class CoffeeC implements CoffeeMaker {

    @Override
    public void milk() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Milk...poured!!");
    }

    @Override
    public void caffein() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Caffein...Added!!");
    }

    @Override
    public void sugar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Sugar...Added");
    }

}


class CoffeeFactory {

    private static CoffeeFactory cFactory;

    private CoffeeFactory() {
    }

    public static CoffeeFactory existCoffeeFactory() {
        if (cFactory == null) {
            cFactory = new CoffeeFactory();
            System.out.println("\t~~~One & only Coffee Factory has been built successfully~~~\n");
        } else {
            System.out.println("\tAlas!! Already a coffee factory is in the world!!\n \tGet your coffee from that one!!!\n\n");
        }
        return cFactory;
    }

    public static CoffeeMaker make(String choice) {
        switch (choice) {
            case "A":
                return new CoffeeA();
            case "B":
                return new CoffeeB();
            case "C":
                return new CoffeeC();
        }
        return null;
    }
}

public class Coffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\t***Welcome to the world of Coffee!!***\n");
        CoffeeFactory cf = CoffeeFactory.existCoffeeFactory();
        CoffeeFactory cf2 = CoffeeFactory.existCoffeeFactory();
        
        System.out.println("\t\t^_^ CHOOSE YOUR COFFEE ^_^\n\t\t coffee 'A' and 'C' is open for all!!\n \t\t 'B' is for diabatic patient!!\n\n \t\t Why late??!! give your choice!! :D \n ");

        Scanner sc = new Scanner(System.in);
        String choice = null;
        if (sc.hasNextLine()) {
            choice = sc.nextLine();
        }
        
        CoffeeMaker newCoffee = null;

        if (choice.equals("A")) {
            newCoffee = CoffeeFactory.make("A");
        }
        else if (choice.equals("B")) {
            newCoffee = CoffeeFactory.make("B");
        } 
        else if (choice.equals("C")) {
            newCoffee = CoffeeFactory.make("C");
        }
        
        newCoffee.milk();
        newCoffee.sugar();
        newCoffee.caffein();
    }
    
}
