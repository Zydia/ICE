/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Zydia
    Student ID : 991587856
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card luckyCard = new Card();
        int s = 6;
        String d = "Diamonds";
        
        Card[] magicHand = new Card[7];
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
            
            //c.setValue(insert call to random number generator here)
           Random rand = new Random();
            int random = rand.nextInt(13 - 1) + 0;
            c.setValue(random);
            
            int random2 = rand.nextInt(3);
            c.setSuit(Card.SUITS[random2]);
            
            magicHand [i] = c;
        }
        //printing The magicHand array with 
        for(int i =0; i<magicHand.length;i++){
            System.out.println(magicHand[i].getSuit() + "  "+magicHand[i].getValue());
            }
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Card infos");
        
        int num = input.nextInt();
    
        
        String usersuit = " ";
        switch(num){
            case 1: 
                usersuit = "Heart";
                break;
                case 2: 
                 usersuit = "Diamonds";
                   break;
                case 3: 
                 usersuit = "Heart";
                   break;
                case 4: 
                 usersuit = "Heart";   } 
        
        int userValue = input.nextInt(); 
        
        System.out.println("Your Crad: ");
        System.out.println("Suit: "+usersuit);
        System.out.println("Value: "+userValue);
        
        for (int i =0 ; i<magicHand.length;i++){
            
                if(usersuit.equals(magicHand[i].getSuit()) && userValue == magicHand[i].getValue() ){
                System.out.println("The majic hand dose contain your card!"); 
                break;
            }else{
                System.out.println("The majic hand dose NOT contain your card!"); 
                break;
            }
                 
                }    
        
                    
               
                  
            
        }
        
    }


