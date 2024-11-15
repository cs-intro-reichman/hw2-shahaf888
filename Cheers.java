// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // the inputs
            String textToCheer = args[0];
            int numOfRoutins = Integer.parseInt(args[1]);
            Character letter = null;

             //CONVERTING LOWER TO UPPER THEN EASY WAY
            String newTextToCheer = textToCheer.toUpperCase();

            String anOrA = "";

            for (int i = 0; i < newTextToCheer.length(); i++){
                letter = newTextToCheer.charAt(i);

                switch (letter) {
                    case 'A':
                        anOrA = "an";
                        break;
                    case 'E':
                        anOrA = "an";
                        break;
                    case 'F':
                        anOrA = "an";
                        break;
                    case 'H':
                        anOrA = "an";
                        break;
                    case 'I':
                        anOrA = "an";
                        break;  
                    case 'L':
                        anOrA = "an";
                        break; 
                    case 'M':     
                        anOrA = "an";
                        break;
                    case 'N':
                        anOrA = "an";
                        break;
                    case 'O':
                        anOrA = "an";
                        break;
                    case 'R':
                        anOrA = "an";
                        break;
                    case 'S':
                        anOrA = "an";
                        break;
                    case 'X':
                        anOrA = "an";
                        break;  
                    default:
                        anOrA = "a";
                }

                System.out.println("Give me " + anOrA + " " + letter + ": " + letter + "!");
            }

            System.out.println("What does that spell?");

            for (int j=0; j < numOfRoutins; j++){
                System.out.println(newTextToCheer + "!!!");
            }

            

        }
}
