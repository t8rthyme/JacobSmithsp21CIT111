
package sp21_friends_basics_c1m3;
    import java.util.Scanner;
/**
 *
 * @author jacob
 */
public class Sp21_Friends_basics_c1M3 {
    
  
    public static void main(String[] args){
            System.out.println("Welcome to my friendship \"Application\"");
    //Method
        //Variables
            //Output  
//                          Question 1

        Scanner userInput = new Scanner(System.in);
        int compScore = 0;
        String yes = new String ("Yes");
        String no = new String ("No");
                        
            System.out.println("Do you play video games ?");    
        String input = userInput.nextLine();
            System.out.println("");
            System.out.println("You answered: " + input);
            System.out.println("");
            
    while (input.equalsIgnoreCase("no")){
        
        compScore = (compScore - 10);
            System.out.println("I bet you were one of those played outside kids! ");
            System.out.println("You lose 10 points.");
        
            System.out.println(compScore + " total points");
            System.out.println("");
    break;}
    
    if (input.equalsIgnoreCase("yes")){ 
        
        compScore= (compScore + 5);
            System.out.println("That was an easy one!");
            System.out.println("You get 5 points!");
            System.out.println("");}
    else {
        System.out.println("Input Error");}
    
    
    // Question 1a               
        String a = new String("A");
        String b = new String("B");
        String c = new String("C");
        String d = new String("D");
        String playstation = new String("Playstation");
        String xbox = new String("Xbox");
        String pc = new String("PC");
        String nintendo = new String("Nintendo");
         
        
    while (input.equalsIgnoreCase("yes")){{
            
            System.out.println("");
            System.out.println("What platform do you play on?");
            System.out.println("A. Playstation B. XBOX C. PC D. Nintendo");
            
            Scanner userInput1 = new Scanner(System.in);
            String input1 = userInput1.nextLine();
            System.out.println("You answered " + input1);
            System.out.println("");
            
    if(input1.equalsIgnoreCase("playstation")){
        
        compScore = compScore - 10;
            System.out.println("Darn! Wrong answer!");
            System.out.println("You lose 10 points");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}
    
    
    if(input1.equalsIgnoreCase("a")){
        
        compScore = compScore - 10;
            System.out.println("Darn! Wrong answer!");
            System.out.println("You lose 10 points");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}

    if(input1.equalsIgnoreCase("b")){
        
        compScore = compScore + 10;
            System.out.println("AYYYYYY! hit me up T8RTHYME");
            System.out.println(" + 10 pts");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}

    if(input1.equalsIgnoreCase("xbox")){
        
        compScore = compScore + 10;
            System.out.println("AYYYYYY! hit me up T8RTHYME");
            System.out.println(" + 10 pts");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;} 
    
    if(input1.equalsIgnoreCase("c")){
        
        compScore = compScore + 15;
            System.out.println("Why is it acceptable for the PC to be called the Master Race?");
            System.out.println("Seems a bit racist to me...");
            System.out.println(" +15 points!");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}
    
    if(input1.equalsIgnoreCase("pc")){
        
        compScore = compScore + 15;
            System.out.println("Why is it acceptable for the PC to be called the Master Race?");
            System.out.println("Seems a bit racist to me...");
            System.out.println(" +15 points!");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}
    
    if(input1.equalsIgnoreCase("d")){
        
        compScore = compScore -5;
            System.out.println("Why so weak?");
            System.out.println("SHAME  SHAME   SHAME");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;}
    
    if(input1.equalsIgnoreCase("nintendo")){
        
        compScore = compScore -5;
            System.out.println("Why so weak?");
            System.out.println("SHAME  SHAME   SHAME");
            System.out.println("");
            System.out.println(compScore + " total points!");
            System.out.println("");
    break;} 
    
    else {
            System.out.println("Input Error"); 
    }            
    }// closes q1a 
    }// closes q1a
    
// Question 2
        String under = new String("Under");
        String over = new String("Over");
        Scanner a2 = new Scanner(System.in);
        
            System.out.println("Time to change the toilet paper:");
            System.out.println("Does the roll go OVER or UNDER ?");
            
        String tp = a2.nextLine();
        
    while(tp.equalsIgnoreCase("Over")){
        compScore = compScore + 15;
            System.out.println("Ohhh that could have been messy...");
            System.out.println("+15 points");
            System.out.println("Current Total: " + compScore);
            System.out.println("");
    break;
        }
        
    while(tp.equalsIgnoreCase("under")){
        compScore = compScore - 20;
            System.out.println("YIKES!");
            System.out.println("-20 points");
            System.out.println("Current Total: " + compScore);
            System.out.println("");
    break;}
            
//Question three
        String si = new String("true");
        String nope = new String("false");
        Scanner three = new  Scanner(System.in);
    
            System.out.println("BLACK LIVES MATTER");
            System.out.println("True or False ?");
        String blm = three.nextLine();
        
    if(blm.equalsIgnoreCase("true")){
        compScore = compScore + 25;
            System.out.println("Look at that! You're a decent human being!");
            System.out.println("");
            System.out.println("That brings your total score to: ");
            System.out.println(compScore + " points !");
            System.out.println("");}
                    
    else {
        compScore = compScore - 100;
            System.out.println("GAME OVER");
            System.out.println("Total Points: " + compScore);
            System.out.println("");
    return;
        }
    while(blm.equalsIgnoreCase("true")){
        String fuyoh = new String("yes");
        String haiya = new String("no");
        Scanner ftb = new Scanner(System.in);
        
            System.out.println("FOR THE BRAND mean anything to you?");
            System.out.println("");
        String forTheBrand = ftb.nextLine();
        
    while(forTheBrand.equalsIgnoreCase(fuyoh)){{
        String radio = new String("Radio");
        String youtube = new String("Youtube");
        String podcast = new String("Podcast");
        String wrestling = new String("Wrestling");
        String tv = new String("TV");
        Scanner pmi = new Scanner(System.in);
                
            System.out.println("Nice!");
            System.out.println("");
            System.out.println("How do you consume Pat McaFee content? ");
            System.out.println("Accepted Answers:");
            System.out.println("Radio, Youtube, Podcast, Wrestling, TV");
            
        String q4a = pmi.nextLine();
     
    if (q4a.equalsIgnoreCase(radio)){
            System.out.println("You're missing out by not watching the Youtube stream!");
            System.out.println("You still get 10 points For The Brand! ");
        compScore = compScore + 10;
            System.out.println("");
            System.out.println("Total points: " + compScore);
    break;}
            
    if (q4a.equalsIgnoreCase(youtube)){
            System.out.println("That's what I'm talking about!");
        compScore = compScore + 20;
            System.out.println("That's scores you a whopping 20 points!");
            System.out.println("Total points: " + compScore);
            System.out.println("");
    break;}
    
    if (q4a.equalsIgnoreCase(podcast)){
        compScore = compScore + 15;
            System.out.println("Shoot... you must be an OG listener ");
            System.out.println("Much respect!");
            System.out.println("Total points: " + compScore);
            System.out.println("");
    break;}
    
    if (q4a.equalsIgnoreCase(wrestling)){
        compScore = compScore + 10;
            System.out.println("Adam Cole is a real piece of s**t");
            System.out.println("Total points: " + compScore);
            System.out.println("");
    break;}
    
    if (q4a.equalsIgnoreCase(tv)){
        compScore = compScore + 5;
            System.out.println("At least you know who he is!");
            System.out.println("Total points: " + compScore);
            System.out.println("");
    break;}
    
    else {
            System.out.println("Some people just want to see the world burn.");
            System.out.println("I too see the beauty in chaos!");
        compScore = compScore + 15;
            System.out.println("Total points: " + compScore);
            System.out.println("");
        } 
    
        } // closes fuyoh
    //new line of questions       
        
        
    
    
        
            
            
        
        }// closes while blm true
    if (compScore >= 20){
            System.out.println("");
            System.out.println("Congratulations... or my condolences");
            System.out.println("Seems we might just be friends!");}
    
    else{System.out.println("Looks like you get off easy this time!");
            System.out.println("No friendship for you!");
    return;
            
        }
            
    

    
    }
    } // closes main
    } // closes class
   


    

