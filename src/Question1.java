import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userInput=sc.nextLine();
        System.out.print("index:"+"\t");
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.print("chars:"+"\t");
        for (int i = 0; i < userInput.length(); i++) {
            System.out.print(userInput.charAt(i)+"\t");
        }
    }
}
class Question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        int index = sc.nextInt();
        int index1 = sc.nextInt();
        System.out.println(userInput.substring(index,index1));
    }
}
class Question3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String userInput=sc.nextLine();
        userInput = userInput.replaceAll("[AaEeIiOoUu]", "*");
        System.out.println(userInput);
    }
}
class Question04 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i)=='e' || inputString.charAt(i)=='o' || inputString.charAt(i)=='u' || inputString.charAt(i)=='i') {
                char replaceChar = inputString.charAt(i);
                count += 1;
                switch (count) {
                    case 1:
                        inputString = inputString.replace(replaceChar, '*');
                        break;
                    case 2:
                        inputString = inputString.replace(replaceChar, '^');
                        break;
                    case 3:
                        inputString = inputString.replace(replaceChar, '!');
                        break;
                    case 4:
                        inputString = inputString.replace(replaceChar, '&');
                        break;
                    case 5:
                        inputString = inputString.replace(replaceChar, '$');
                        break;
                    default:
                        inputString = inputString.replace(replaceChar, '_');
                }
            }
        }

        System.out.println(inputString);
        scanner.close();
    }
}
class Question05 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Any String Value : ");
        String stringInput = sc.nextLine();
        System.out.print("Enter Value of subString : ");
        String subString = sc.nextLine();
        System.out.print("Enter the  Value to be Replaced with   : ");
        String subStringForReplacement = sc.nextLine();

        String newString = stringInput.replace(subString,subStringForReplacement);
        System.out.println("New String : " + newString);
    }
}
class Question06 {
    public static void main(String[] artgs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Value : ");
        String newString = sc.nextLine();

        newString = newString.toLowerCase();
        System.out.println("Lowered Case : " + newString);
    }
}
class Question07 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String stringInput = sc.nextLine();
        int lenOfString = stringInput.length();
        int totalWeight = 0;
        System.out.print("totalWeight = ");

        for (int i = 0; i < lenOfString ; i++) {
            int weightOfChar = (int) stringInput.charAt(i);
            totalWeight = totalWeight + weightOfChar;
            System.out.print( weightOfChar + " + ");
        }
        System.out.print("\b\b \n \t \t  = "+ totalWeight);
    }
}
class Question08 {
    public static void main(String[] artgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Value : ");
        String stringInput = sc.nextLine();

        int upperCaseWeight = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z'){
                upperCaseWeight += (int) stringInput.charAt(i);
            }
        }

        System.out.println("UpperCaseWeight of input String :" + upperCaseWeight);
        sc.close();
    }
}
class Question09 {
    public static void main(String[] artgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String Value : ");
        String stringInput = sc.nextLine();

        int LowerWeight = 0, UpperWeight = 0 ,absoluteWeight =0;

        for (int i = 0; i <stringInput.length() ; i++) {
            if (stringInput.charAt(i) >= 'A' && stringInput.charAt(i) <= 'Z'){
                UpperWeight += (int) stringInput.charAt(i);
            }
            else if (stringInput.charAt(i) >= 'a' || stringInput.charAt(i) <= 'z'){
                LowerWeight += (int) stringInput.charAt(i);
            }
        }
        absoluteWeight = UpperWeight - LowerWeight;
        if (absoluteWeight < 0)
            System.out.println("absoluteWeight = " + absoluteWeight*(-1));
        else System.out.println("absoluteWeight = " + absoluteWeight);
    }
}
class Question10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();
        String input=sc.next();
        System.out.println(inputString.indexOf(input));
    }
}
class Question11 {
    public static void main(String[] artgs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("char ch = ");
        String character = sc.next();
        System.out.print("String inputString = ");
        String inputString = sc.next();

        for (int i = 0; i <inputString.length() ; i++){
            if (inputString.charAt(i) == character.charAt(0)){
                System.out.println(i);
            }
        }
    }
}