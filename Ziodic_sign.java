package Practice_ziodic;
import java.util.Scanner;

public class Ziodic_sign {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter your birth date (dd-mm): ");
        String birthDate = scanner.nextLine();
        String[] parts = birthDate.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);

        String zodiacSign = "";
        String description = "";

       
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            zodiacSign = "Capricorn";
            description = "Practical and prudent, ambitious and disciplined.";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
            description = "Friendly and humanitarian, honest and loyal.";
        } 
    
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
            description = "Imaginative and sensitive, compassionate and kind.";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Aries";
            description = "Adventurous and energetic, pioneering and courageous.";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Taurus";
            description = "Patient and reliable, warmhearted and loving.";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Gemini";
            description = "Adaptable and versatile, communicative and witty.";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
            description = "Emotional and loving, intuitive and imaginative.";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
            description = "Generous and warmhearted, creative and enthusiastic.";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
            description = "Modest and shy, meticulous and reliable.";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
            description = "Diplomatic and urbane, romantic and charming.";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
            description = "Determined and forceful, emotional and intuitive.";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
            description = "Optimistic and freedom-loving, jovial and good-humored.";
        }

        
        System.out.println("Your Zodiac Sign: " + zodiacSign);
        System.out.println("Description: " + description);
    }

	}


